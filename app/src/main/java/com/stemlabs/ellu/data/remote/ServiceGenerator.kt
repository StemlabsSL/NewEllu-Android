package com.stemlabs.ellu.data.remote

import android.util.Log
import com.stemlabs.ellu.BuildConfig
import com.stemlabs.ellu.utils.Constants
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton



@Singleton
class ServiceGenerator @Inject
constructor() {

    //Network constants
    private val timeoutConnect = 30   //In seconds
    private val timeoutRead = 30   //In seconds
    private val contentType = "Content-Type"
    private val contentTypeValue = "application/json"

    private val okHttpBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
    private val retrofit: Retrofit

    private var headerInterceptor = Interceptor { chain ->
        val original = chain.request()

        val request = original.newBuilder()
                .header(contentType, contentTypeValue)
                .method(original.method, original.body)
                .build()

        chain.proceed(request)
    }

    private val logger: HttpLoggingInterceptor
        get() {
            val loggingInterceptor = HttpLoggingInterceptor()
            if (BuildConfig.DEBUG) {
                loggingInterceptor.apply { loggingInterceptor.level = HttpLoggingInterceptor.Level.HEADERS }.level = HttpLoggingInterceptor.Level.BODY
            }
            return loggingInterceptor
        }

    init {
        okHttpBuilder.addInterceptor(headerInterceptor)
        okHttpBuilder.addInterceptor(logger)
        /*okHttpBuilder.addInterceptor(object :Interceptor{
            override fun intercept(chain: Interceptor.Chain): Response {
                val newRequest: Request = chain.request().newBuilder()
                        .addHeader("Authorization", "Bearer $TOKEN")
                        .build()
                Log.e("Authorization", "Bearer $TOKEN")
                return chain.proceed(newRequest)
            }
        })*/
        okHttpBuilder.connectTimeout(timeoutConnect.toLong(), TimeUnit.SECONDS)
        okHttpBuilder.readTimeout(timeoutRead.toLong(), TimeUnit.SECONDS)
        val client = okHttpBuilder.build()
        val gson = GsonBuilder()
                .setLenient()
                .create()
        Log.e("TAG", "BASE_URL-> ${Constants.BASE_URL}")
        retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL).client(client)
                //.addConverterFactory(MoshiConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
    }

    fun <S> createService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }
}