package mini.max.core_network

import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import mini.max.core_network_api.NetworkRequest
import mini.max.core_network_api.NetworkRequestExecutor
import mini.max.core_network_api.RequestType
import mini.max.core_network_api.ResponseListener

class FastAndroidNetworkRequestExecutor : NetworkRequestExecutor {

    override fun <R> execute(request: NetworkRequest<R>, listener: ResponseListener<R>) {
        when (request.requestType) {
            RequestType.GET -> AndroidNetworking.get(request.url)
                .build()
                .getAsObject(request.responseClass, object : ParsedRequestListener<R> {
                    override fun onResponse(response: R) {
                        listener.onSuccess(response)
                    }

                    override fun onError(error: ANError) {
                        listener.onError(error)
                    }
                })
            RequestType.POST -> AndroidNetworking.post(request.url).build()
        }
    }

}