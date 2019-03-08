package mini.max.reddit.ui.models

import android.net.Uri
import pl.droidsonroids.gif.GifDrawable

open class Post(
    val title: String,
    val uniqueId: String
)

class ImagePost(
    title: String,
    uniqueId: String,
    val imageUrl: String
) : Post(title, uniqueId)

class GifPost(
    title: String,
    uniqueId: String,
    val drawable: GifDrawable
) : Post(title, uniqueId)

class VideoPost(
    title: String,
    uniqueId: String,
    val uri: Uri
) : Post(title, uniqueId) {

    var currentProgress = 0

}