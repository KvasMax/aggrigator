package mini.max.reddit.data.repo

import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import mini.max.reddit.data.network.RedditWebService
import mini.max.reddit.ui.models.GifPost
import mini.max.reddit.ui.models.ImagePost
import mini.max.reddit.ui.models.Post
import mini.max.reddit.ui.models.VideoPost
import pl.droidsonroids.gif.GifDrawable
import java.io.BufferedInputStream
import java.net.URL
import javax.inject.Inject

internal class RedditRepo @Inject constructor(
    private val webService: RedditWebService
) {
    suspend fun getPosts(lastPostName: String? = null): List<Post> = withContext(Dispatchers.IO) {
        return@withContext (lastPostName?.let { webService.getNextPosts("funny", it) }
            ?: webService.getPosts("funny")).await().map {
            val title = it.data?.title ?: ""
            val uniqueId = it.data?.name ?: ""
            val videoUrl = it.data?.media?.redditVideo?.fallbackUrl
            if (videoUrl != null) {
                return@map VideoPost(title, uniqueId, Uri.parse(videoUrl))
            }
            it.data?.preview?.images?.firstOrNull()?.variants?.gif?.source?.url?.let { gifUrl ->
                return@map GifPost(title, uniqueId, GifDrawable(BufferedInputStream(URL(gifUrl).openStream())))
            }
            it.data?.preview?.images?.firstOrNull()?.source?.url?.replace("amp;", "")?.let { imageUrl ->
                return@map ImagePost(title, uniqueId, imageUrl)
            }
            return@map Post(title, uniqueId)
        }
    }
}