package mini.max.reddit.data.network

import com.serjltt.moshi.adapters.Wrapped
import kotlinx.coroutines.Deferred
import mini.max.reddit.data.network.model.Post
import retrofit2.http.GET
import retrofit2.http.Path

internal interface RedditWebService {

    @GET("r/{subreddit}/.json")
    @Wrapped(path = ["data", "children"])
    fun getPosts(@Path("subreddit") subreddit: String): Deferred<List<Post>>

}