package com.stemlabs.ellu.ui.component.profile.fragment.presenter

import android.content.Context
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CommonResponse
import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse
import com.stemlabs.ellu.data.model.request.ApiRequest
import com.stemlabs.ellu.data.remote.handler.CommonHandler
import com.stemlabs.ellu.data.remote.handler.GetProfileHandler
import com.stemlabs.ellu.data.remote.handler.UpdateProfileHandler
import com.stemlabs.ellu.data.remote.service.WebService
import com.stemlabs.ellu.ui.component.profile.fragment.view.SettingFragmentView
import java.io.File

class SettingFragmentPresenter(var context:Context, var view: SettingFragmentView) :SettingFragmentPresenterHandler{
    override fun changePassword(request: ApiRequest) {
        view.showProgressBar(context.getString(R.string.please_wait))
         WebService.mInstance.changePassword(request,object :CommonHandler{
             override fun onSuccess(response: CommonResponse) {
                 view.hideProgressBar()
                 view.onSuccessfullyChangePassword(response)

             }

             override fun onError(message: String) {
                 view.hideProgressBar()
                 view.showMessage(message)
             }

         })
    }


}