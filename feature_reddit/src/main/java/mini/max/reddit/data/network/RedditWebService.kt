package mini.max.reddit.data.network

import com.serjltt.moshi.adapters.Wrapped
import kotlinx.coroutines.Deferred
import mini.max.reddit.data.network.model.Post
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface RedditWebService {

    @GET("r/{subreddit}/.json")
    @Wrapped(path = ["data", "children"])
    fun getPosts(@Path("subreddit") subreddit: String): Deferred<List<Post>>

    @GET("r/{subreddit}/.json")
    @Wrapped(path = ["data", "children"])
    fun getNextPosts(@Path("subreddit") subreddit: String, @Query("after") after: String): Deferred<List<Post>>

}