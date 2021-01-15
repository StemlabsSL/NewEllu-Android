package com.stemlabs.ellu.data.remote.handler

import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse

interface UpdateProfileHandler:BaseHandler {
    fun onSuccess(response:GetProfileResponse)


}