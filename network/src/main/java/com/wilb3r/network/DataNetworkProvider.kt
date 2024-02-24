package com.wilb3r.network

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.ToJson
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.lang.reflect.Type
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale
import java.util.TimeZone


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

    private val getMoshiDateJasonAdapter = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        //.add(Date::class.java, Rfc3339DateJsonAdapter())
        .add(OffsetDateTime::class.java, CustomDateAdapter())
        .build()

    private fun provideGson(): Gson = GsonBuilder()
        .setPrettyPrinting()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create()


    fun getRetrofitService(
        baseUrl: String,
        client: OkHttpClient? = null
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create(getMoshiDateJasonAdapter))
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


class CustomDateAdapter : JsonAdapter<Date>() {
    private val dateFormat = SimpleDateFormat(SERVER_FORMAT, Locale.getDefault())
    @FromJson
    override fun fromJson(reader: JsonReader): Date? {
        return try {
            val dateAsString = reader.nextString()
            synchronized(dateFormat) {
                dateFormat.parse(dateAsString)
//                val d = OffsetDateTime.parse(dateAsString, DateTimeFormatter.ISO_DATE_TIME)
//                Date.from(d.toInstant())
            }
        } catch (e: Exception) {
            null
        }
    }

    @ToJson
    override fun toJson(writer: JsonWriter, value: Date?) {
        if (value != null) {
            synchronized(dateFormat) {
                writer.value(dateFormat.format(value))
            }
        }
    }

    //val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")
    companion object {
        const val SERVER_FORMAT = ("yyyy-MM-dd'T'HH:mm:ssXXX") // define your server format here
    }
}