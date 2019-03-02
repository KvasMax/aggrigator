package mini.max.reddit.ui.list

import android.os.Bundle
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_posts.*
import kotlinx.android.synthetic.main.item_gif_post.view.*
import kotlinx.android.synthetic.main.item_image_post.view.*
import kotlinx.android.synthetic.main.item_plain_post.view.*
import kotlinx.android.synthetic.main.item_video_post.view.*
import mini.max.core.BaseFragment
import mini.max.core.BaseRecyclerViewHolder
import mini.max.core.ViewModelFactory
import mini.max.core_utils.isVisible
import mini.max.reddit.R
import mini.max.reddit.di.RedditComponent
import mini.max.reddit.ui.models.GifPost
import mini.max.reddit.ui.models.ImagePost
import mini.max.reddit.ui.models.Post
import mini.max.reddit.ui.models.VideoPost
import javax.inject.Inject

internal class PostListFragment : BaseFragment<PostListViewModel>() {

    override val layoutId: Int = R.layout.fragment_posts

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override val viewModel: PostListViewModel by lazy {
        ViewModelProviders.of(this@PostListFragment, viewModelFactory).get(PostListViewModel::class.java)
    }

    private val adapter = PostsAdapter()

    override fun injectDependencies() {
        RedditComponent.get().inject(this)
    }

    override fun initViews(savedInstanceState: Bundle?) {
        recyclerView.adapter = adapter
        viewModel.posts.observe(this, Observer {
            adapter.setCollection(it)
        })
    }
}

private class PostsAdapter : RecyclerView.Adapter<BaseRecyclerViewHolder>() {

    private companion object {
        private const val PLAIN_POST_TYPE = 0
        private const val IMAGE_POST_TYPE = 1
        private const val GIF_POST_TYPE = 2
        private const val VIDEO_POST_TYPE = 3
    }

    private var items = emptyList<Post>()

    fun setCollection(posts: List<Post>) {
        this.items = posts
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is ImagePost -> IMAGE_POST_TYPE
            is GifPost -> GIF_POST_TYPE
            is VideoPost -> VIDEO_POST_TYPE
            else -> PLAIN_POST_TYPE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRecyclerViewHolder {
        return when (viewType) {
            IMAGE_POST_TYPE -> ImagePostViewHolder(parent)
            GIF_POST_TYPE -> GifPostViewHolder(parent)
            VIDEO_POST_TYPE -> VideoPostViewHolder(parent)
            PLAIN_POST_TYPE -> PlainPostViewHolder(parent)
            else -> error("Smth goes wrong")
        }
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BaseRecyclerViewHolder, position: Int) {
        val item = items[position]
        when (item) {
            is ImagePost -> (holder as? ImagePostViewHolder)?.bind(item)
            is GifPost -> (holder as? GifPostViewHolder)?.bind(item)
            is VideoPost -> (holder as? VideoPostViewHolder)?.bind(item)
            is Post -> (holder as? PlainPostViewHolder)?.bind(item)
        }
    }

    override fun onViewAttachedToWindow(holder: BaseRecyclerViewHolder) {
        super.onViewAttachedToWindow(holder)
        (holder as? VideoPostViewHolder)?.playVideo()
    }

    override fun onViewDetachedFromWindow(holder: BaseRecyclerViewHolder) {
        super.onViewDetachedFromWindow(holder)
        (holder as? VideoPostViewHolder)?.stopVideo()
    }
}

private class PlainPostViewHolder(parent: ViewGroup) : BaseRecyclerViewHolder(parent, R.layout.item_plain_post) {

    fun bind(post: Post) {
        with(itemView) {
            plainPostTitleTextView.text = post.title
        }
    }

}

private class ImagePostViewHolder(parent: ViewGroup) : BaseRecyclerViewHolder(parent, R.layout.item_image_post) {

    fun bind(post: ImagePost) {
        with(itemView) {
            imagePostTitleTextView.text = post.title
            Picasso.get()
                .load(post.imageUrl)
                .fit()
                .centerInside()
                .into(imageView)
        }
    }

}

private class GifPostViewHolder(parent: ViewGroup) : BaseRecyclerViewHolder(parent, R.layout.item_gif_post) {

    fun bind(post: GifPost) {
        with(itemView) {
            gitPostTitleTextView.text = post.title
            gifImageView.setImageDrawable(post.drawable)
        }
    }

}

private class VideoPostViewHolder(parent: ViewGroup) : BaseRecyclerViewHolder(parent, R.layout.item_video_post) {

    fun bind(post: VideoPost) {
        with(itemView) {
            videoPostTitleTextView.text = post.title
            videoView.setVideoURI(post.uri)
        }

    }

    fun playVideo() {
        itemView.videoView.apply {
            if (isVisible()) start()
        }
    }

    fun stopVideo() {
        itemView.videoView.apply {
            if (isVisible()) stopPlayback()
        }
    }
}

