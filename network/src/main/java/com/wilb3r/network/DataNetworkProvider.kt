package com.wilb3r.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.Date

open class DataNetworkProvider private constructor() {

    fun getClient(
        interceptors: List<Interceptor>? = null,
        connectTimeout: Long? = null,
        readTimeout: Long? = null,
        writeTimeout: Long? = null,
        enableDebugLogs: Boolean = true
    ) = OkHttpClientProvider.build(
        interceptors,
        connectTimeout,
        readTimeout,
        writeTimeout,
        enableDebugLogs
    )

    private fun getMoshiDateJasonAdapter() = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .add(Date::class.java, Rfc3339DateJsonAdapter())
        .build()


    fun getRetrofitService(
        baseUrl: String,
        client: OkHttpClient? = null
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create(getMoshiDateJasonAdapter()))
            .client(client ?: getClient())
            .build()
    }

    companion object {

        private lateinit var _instance: DataNetworkProvider
        fun getInstance(): DataNetworkProvider {
            return if (Companion::_instance.isInitialized)
                _instance
            else {
                _instance = DataNetworkProvider()
                _instance
            }

        }
    }


}