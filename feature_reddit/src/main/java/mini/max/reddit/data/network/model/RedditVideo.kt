package mini.max.reddit.data.network.model

import com.squareup.moshi.Json
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class RedditVideo(

    @field:Json(name = "duration")
    val duration: Int? = null,

    @field:Json(name = "is_gif")
    val isGif: Boolean? = null,

    @field:Json(name = "dash_url")
    val dashUrl: String? = null,

    @field:Json(name = "fallback_url")
    val fallbackUrl: String? = null,

    @field:Json(name = "width")
    val width: Int? = null,

    @field:Json(name = "scrubber_media_url")
    val scrubberMediaUrl: String? = null,

    @field:Json(name = "hls_url")
    val hlsUrl: String? = null,

    @field:Json(name = "transcoding_status")
    val transcodingStatus: String? = null,

    @field:Json(name = "height")
    val height: Int? = null
)