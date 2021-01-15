package com.stemlabs.ellu.data

import com.bluebird.partner.data.remote.dto.ErrorModel

// A generic class that contains data and status about loading this data.
sealed class Resource<out T : Any> {
    class Success<out T : Any>(val data: T?) : Resource<T>()
    class Loading<out T : Any>(data: T? = null) : Resource<T>()
    class DataError<out T : Any>(val errorCode: Int) : Resource<T>()
    class DataErrorBody<out T : Any>(val errorBody: ErrorModel) : Resource<T>()

}