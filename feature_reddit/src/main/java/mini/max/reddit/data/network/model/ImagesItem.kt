package mini.max.reddit.data.network.model

import com.squareup.moshi.Json
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class ImagesItem(

    @field:Json(name = "resolutions")
    val resolutions: List<ResolutionsItem?>? = null,

    @field:Json(name = "source")
    val source: Source? = null,

    @field:Json(name = "variants")
    val variants: Variants? = null,

    @field:Json(name = "id")
    val id: String? = null
)