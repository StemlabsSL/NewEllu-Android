package com.stemlabs.ellu.usecase.errors

import com.stemlabs.ellu.data.error.Error

interface ErrorFactory {
    fun getError(errorCode: Int): Error
}