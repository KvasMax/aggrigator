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

    init {
        launch {
            val posts = redditRepo.getPosts()
            posts_.postValue(posts)
        }
    }

}