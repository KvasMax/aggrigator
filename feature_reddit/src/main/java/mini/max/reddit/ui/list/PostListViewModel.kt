package mini.max.reddit.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.launch
import mini.max.core.BaseViewModel
import mini.max.reddit.data.repo.RedditRepo
import mini.max.reddit.ui.models.Post
import javax.inject.Inject


internal class PostListViewModel @Inject constructor(
    private val redditRepo: RedditRepo
) : BaseViewModel() {

    private val posts_ = MutableLiveData<List<Post>>()
    internal var posts: LiveData<List<Post>> = posts_

    private val loading_ = MutableLiveData<Boolean>()
    internal var loading: LiveData<Boolean> = loading_

    init {
        launch {
            loading_.postValue(true)
            val posts = redditRepo.getPosts()
            posts_.postValue(posts)
            loading_.postValue(false)
        }
    }

    fun loadMore() {
        if (loading.value == false) {
            launch {
                posts.value?.let {
                    loading_.postValue(true)
                    val posts = redditRepo.getPosts(lastPostName = it.lastOrNull()?.uniqueId)
                    posts_.postValue(it + posts)
                    loading_.postValue(false)
                }
            }
        }
    }


}