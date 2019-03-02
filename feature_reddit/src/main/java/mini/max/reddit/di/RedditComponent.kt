package mini.max.reddit.di

import dagger.Component
import mini.max.core.ContextProvider
import mini.max.reddit.ui.list.PostListFragment
import javax.inject.Singleton


@Singleton
@Component(
    modules = [RedditModule::class, ViewModelModule::class],
    dependencies = [ContextProvider::class]
)
abstract class RedditComponent {

    internal abstract fun inject(fragment: PostListFragment)

    companion object {

        private var redditComponent: RedditComponent? = null

        fun initAndGet(contextProvider: ContextProvider): RedditComponent {
            return redditComponent
                ?: synchronized(RedditComponent::class.java) {
                    redditComponent ?: DaggerRedditComponent.builder()
                        .contextProvider(contextProvider)
                        .build().also { redditComponent = it }
                }
        }

        fun get(): RedditComponent {
            return redditComponent ?: error("initAndGet must be called firstly")
        }

        fun release() {
            redditComponent = null
        }

    }

}