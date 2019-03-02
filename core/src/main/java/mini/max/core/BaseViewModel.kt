package mini.max.core

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), CoroutineScope {

    private var parentJob = SupervisorJob()

    override val coroutineContext: CoroutineContext =
        Dispatchers.Main + parentJob + CoroutineExceptionHandler { _, throwable ->
            throwable.printStackTrace()
        }

}