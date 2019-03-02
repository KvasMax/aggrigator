package mini.max.aggregator

import android.app.Application
import mini.max.core.ContextProvider
import mini.max.reddit.di.RedditComponent

class App : Application(), ContextProvider {

    override fun onCreate() {
        super.onCreate()
        RedditComponent.initAndGet(this)
    }
}