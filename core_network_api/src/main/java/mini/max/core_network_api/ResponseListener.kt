package mini.max.core_network_api

interface ResponseListener<R> {
    fun onSuccess(response: R)
    fun onError(error: Throwable)
}