package mini.max.reddit.data.network.model

import com.squareup.moshi.Json
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Variants(

    @Json(name = "mp4")
    val mp4: Mp4? = null,

    @Json(name = "gif")
    val gif: Gif? = null
)