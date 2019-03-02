package mini.max.reddit

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import mini.max.core.Feature
import mini.max.reddit.ui.list.PostListFragment

object RedditFeature : Feature {

    override fun openScreen(fragmentManager: FragmentManager, containerViewId: Int) {
        fragmentManager.beginTransaction()
            .replace(containerViewId, PostListFragment(), PostListFragment::class.java.simpleName)
            .commitNow()
    }

    override fun getPreview(context: Context): View {
        return TextView(context).apply { text = "Reddit" }
    }

    override fun getTitle(): String = "Reddit"
}