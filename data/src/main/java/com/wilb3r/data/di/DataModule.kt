package com.wilb3r.data.di

import com.wilb3r.data.BuildConfig
import com.wilb3r.data.remote.NewsRemoteDataSource
import com.wilb3r.data.remote.NewsRemoteDataSourceImpl
import com.wilb3r.data.remote.api.ApiService
import com.wilb3r.data.repository.TopStoriesRepositoryImpl
import com.wilb3r.domain.repository.TopStoriesRepository
import com.wilb3r.network.DataNetworkProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import okhttp3.Interceptor
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    private val authInterceptor = Interceptor { chain ->
        val newUrl = chain
            .request()
            .url
            .newBuilder()
            .addQueryParameter("api-key", BuildConfig.TNYT)
            .build()
        chain.proceed(chain.request().newBuilder().url(newUrl).build())
    }

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        val netProvider = DataNetworkProvider.getInstance()
        val client = netProvider.getClient(
            interceptors = listOf(authInterceptor),
            enableDebugLogs = BuildConfig.DEBUG
        )
        return netProvider.run {
            getRetrofitService(
                "https://api.nytimes.com/",
                client
            )
                .create(ApiService::class.java)
        }
    }


    @Singleton
    @Provides
    fun provideNewsRemoteDS(
        apiService: ApiService
    ): NewsRemoteDataSource = NewsRemoteDataSourceImpl(apiService)

}

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun topStoryRepository(topStoriesRepositoryImpl: TopStoriesRepositoryImpl): TopStoriesRepository
}


@Module
@InstallIn(SingletonComponent::class)
object DispatcherModule {
    @DefaultDispatcher
    @Provides
    fun providesDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default

    @IoDispatcher
    @Provides
    fun providesIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @MainDispatcher
    @Provides
    fun providesMainDispatcher(): CoroutineDispatcher = Dispatchers.Main
}

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class DefaultDispatcher

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class IoDispatcher

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class MainDispatcher