package com.stemlabs.ellu.data.remote.handler

import com.stemlabs.ellu.data.model.CommonResponse
import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse

interface CommonHandler:BaseHandler {
    fun onSuccess(response:CommonResponse)
}