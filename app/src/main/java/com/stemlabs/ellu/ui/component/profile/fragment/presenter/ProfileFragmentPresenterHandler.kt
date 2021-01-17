package com.stemlabs.ellu.ui.component.profile.fragment.presenter

import com.stemlabs.ellu.data.model.request.ApiRequest
import java.io.File

interface ProfileFragmentPresenterHandler {

    fun getProfile(request:ApiRequest)
    fun updateProfile(request:ApiRequest,img: File?)
    fun updateProfileImage(request:ApiRequest,img: File?)
}