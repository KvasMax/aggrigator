package mini.max.reddit.ui.models

import android.net.Uri
import pl.droidsonroids.gif.GifDrawable

open class Post(
    val title: String
)

class ImagePost(
    title: String,
    val imageUrl: String
) : Post(title)

class GifPost(
    title: String,
    val drawable: GifDrawable
) : Post(title)

class VideoPost(
    title: String,
    val uri: Uri
) : Post(title)