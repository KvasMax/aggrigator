package mini.max.reddit.di

import android.content.Context
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.serjltt.moshi.adapters.Wrapped
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import mini.max.core_utils.isDebug
import mini.max.reddit.R
import mini.max.reddit.data.network.RedditWebService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
internal class RedditModule {

    @Singleton
    @Provides
    internal fun provideOkHttpClient(context: Context): OkHttpClient {
        val clientBuilder = OkHttpClient.Builder()
        if (context.isDebug()) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            clientBuilder.addInterceptor(logging)
        }
        return clientBuilder.build()
    }

    @Singleton
    @Provides
    internal fun provideWebService(context: Context, okHttpClient: OkHttpClient): RedditWebService {
        val moshi = Moshi.Builder()
            .add(Wrapped.ADAPTER_FACTORY)
            .build()
        return Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(context.getString(R.string.base_url))
            .client(okHttpClient)
            .build()
            .create(RedditWebService::class.java)
    }

}