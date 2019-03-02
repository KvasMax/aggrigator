package mini.max.core

import android.content.Context
import android.view.View
import androidx.fragment.app.FragmentManager

interface Feature {

    fun openScreen(fragmentManager: FragmentManager, containerViewId: Int)

    fun getPreview(context: Context): View

    fun getTitle(): String

}