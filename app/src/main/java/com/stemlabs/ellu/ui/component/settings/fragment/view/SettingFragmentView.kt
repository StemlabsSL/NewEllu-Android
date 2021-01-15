package com.stemlabs.ellu.ui.component.profile.fragment.view

import com.stemlabs.ellu.data.model.CommonResponse
import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse

interface SettingFragmentView:BaseView {

    fun onSuccessfullyChangePassword(response:CommonResponse)
}