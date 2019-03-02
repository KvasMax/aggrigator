package mini.max.reddit.data.network.model

import com.squareup.moshi.Json
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Mp4(

    @Json(name = "resolutions")
    val resolutions: List<ResolutionsItem?>? = null,

    @Json(name = "source")
    val source: Source? = null
)