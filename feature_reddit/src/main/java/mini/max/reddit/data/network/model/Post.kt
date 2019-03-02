package mini.max.reddit.data.network.model

import com.squareup.moshi.Json
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Post(

    @field:Json(name = "data")
    val data: Data? = null,

    @field:Json(name = "kind")
    val kind: String? = null
)