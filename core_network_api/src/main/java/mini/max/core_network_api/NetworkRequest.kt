package mini.max.core_network_api

class NetworkRequest<R>(
    val requestType: RequestType,
    val url: String,
    val responseClass: Class<R>
)