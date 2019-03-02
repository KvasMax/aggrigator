package mini.max.reddit.data.network.model

import com.squareup.moshi.Json
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Preview(

    @field:Json(name = "images")
    val images: List<ImagesItem?>? = null,

    @field:Json(name = "enabled")
    val enabled: Boolean? = null
)