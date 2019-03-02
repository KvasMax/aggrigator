package mini.max.core

import android.content.Context

interface ContextProvider {
    fun getApplicationContext(): Context
}