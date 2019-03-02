package mini.max.core_network_api

interface NetworkRequestExecutor {

    fun <R> execute(request: NetworkRequest<R>, listener: ResponseListener<R>)

}