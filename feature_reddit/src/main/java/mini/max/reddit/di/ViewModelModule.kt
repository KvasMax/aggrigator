package mini.max.reddit.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import mini.max.core.ViewModelFactory
import mini.max.core.ViewModelKey
import mini.max.reddit.ui.list.PostListViewModel
import javax.inject.Singleton

@Module
internal interface ViewModelModule {

    @Binds
    @Singleton
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(PostListViewModel::class)
    fun postListViewModel(viewModel: PostListViewModel): ViewModel

}