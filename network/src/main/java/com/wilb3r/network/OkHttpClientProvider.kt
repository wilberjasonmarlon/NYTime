package com.wilb3r.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

internal object OkHttpClientProvider {
    private lateinit var httpClient: OkHttpClient.Builder

    private const val CONNECTION_TIMEOUT: Long = 30
    private const val READ_TIMEOUT: Long = 60
    private const val WRITE_TIMEOUT: Long = 60

    fun build(
        interceptors: List<Interceptor>?,
        connectTimeout: Long?,
        readTimeout: Long?,
        writeTimeout: Long?,
        enableDebugLogs: Boolean?
    ): OkHttpClient {

        httpClient = OkHttpClient.Builder()
            .connectTimeout(connectTimeout ?: CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(readTimeout ?: READ_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(writeTimeout ?: WRITE_TIMEOUT, TimeUnit.SECONDS)

        addInterceptors(enableDebugLogs, interceptors)

        return httpClient.build()
    }

    private fun addInterceptors(enableDebugLogs: Boolean?, interceptors: List<Interceptor>?) {
        interceptors?.let { list ->
            for (it in list) {
                httpClient.addInterceptor(it)
            }
        }
        httpClient.addInterceptor(getHttpLoggingInterceptor(enableDebugLogs ?: false))
    }

    private fun getHttpLoggingInterceptor(enableDebugLogs: Boolean): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = if (enableDebugLogs) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
        return interceptor
    }

}