package com.stemlabs.ellu.data.remote

import com.bluebird.partner.data.remote.dto.ErrorModel
import com.stemlabs.ellu.App
import com.stemlabs.ellu.data.Resource
import com.stemlabs.ellu.data.error.Error.Companion.DEFAULT_ERROR
import com.stemlabs.ellu.data.error.Error.Companion.NETWORK_ERROR
import com.stemlabs.ellu.data.error.Error.Companion.NO_INTERNET_CONNECTION
import com.stemlabs.ellu.data.remote.dto.*
import com.stemlabs.ellu.data.remote.service.ApiService
import com.stemlabs.ellu.utils.L
import com.stemlabs.ellu.utils.Network.Utils.isConnected
import com.stemlabs.ellu.utils.wrapEspressoIdlingResource
import com.google.gson.Gson
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject




class RemoteData @Inject
constructor(private val serviceGenerator: ServiceGenerator) : RemoteDataSource {

    override suspend fun requestLanguage(): Resource<LanguageModel> {
        wrapEspressoIdlingResource {
            val newsService = serviceGenerator.createService(ApiService::class.java)
            return when (val response = processCall(newsService::fetchLanguage)) {
                is LanguageModel -> {
                    Resource.Success(data = response)
                }
                is ErrorModel -> {
                    Resource.DataErrorBody(errorBody = response)
                }
                else -> {
                    Resource.DataError(errorCode = response as Int)
                }
            }
        }
    }

    // ---------------
    private suspend fun processCall(responseCall: suspend () -> Response<*>): Any? {
        if (!isConnected(App.context)) {
            return NO_INTERNET_CONNECTION // return internet connection
        }
        return try {
            val response = responseCall.invoke()
            val responseCode = response.code()
            if (response.isSuccessful) {
                L.e("TAG", "response.isSuccessful-> ${response.body()}")
                if (response.body() == null)
                    DEFAULT_ERROR
                else
                    response.body() // return body
            } else if (!response.isSuccessful) {
                ///--- return error body
                try {
                    val errorString = response.errorBody()!!.string()
                    L.e("TAG", "response.errorBody-> $errorString")
                    val errorBody = Gson().fromJson(errorString,
                            ErrorModel::class.java
                    )
                    L.e("TAG", "errorBody-> ${errorBody}")
                    return errorBody
                } catch (e: Exception) {
                    NETWORK_ERROR // return network error
                }
            } else {
                L.e("TAG", "responseCode")
                responseCode // return response code
            }
        } catch (e: IOException) {
            NETWORK_ERROR // return network error
        }
    }
}
