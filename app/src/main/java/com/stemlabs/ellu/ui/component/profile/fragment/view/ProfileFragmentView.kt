package com.stemlabs.ellu.ui.component.profile.fragment.view

import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse

interface ProfileFragmentView:BaseView {

    fun onSuccessfullyGetProfile(response:GetProfileResponse)
    fun onSuccessfullyUpdateProfile(response:GetProfileResponse)
}