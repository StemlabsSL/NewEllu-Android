package com.stemlabs.ellu.ui.component.profile.fragment.presenter

import android.content.Context
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse
import com.stemlabs.ellu.data.model.request.ApiRequest
import com.stemlabs.ellu.data.remote.handler.GetProfileHandler
import com.stemlabs.ellu.data.remote.handler.UpdateProfileHandler
import com.stemlabs.ellu.data.remote.service.WebService
import com.stemlabs.ellu.ui.component.profile.fragment.view.ProfileFragmentView
import com.stemlabs.ellu.ui.component.profile.fragment.view.SettingFragmentView
import java.io.File

class ProfileFragmentPresenter(var context:Context,var view: ProfileFragmentView) :ProfileFragmentPresenterHandler{
    override fun getProfile(request: ApiRequest) {
        view.showProgressBar(context.getString(R.string.please_wait))
         WebService.mInstance.getProfile(request,object :GetProfileHandler{
             override fun onSuccess(response: GetProfileResponse) {
                 view.hideProgressBar()
                    view.onSuccessfullyGetProfile(response);
             }

             override fun onError(message: String) {
                 view.hideProgressBar()
                 view.showMessage(message)
             }

         })
    }

    override fun updateProfile(request: ApiRequest, img: File?) {
        view.showProgressBar(context.getString(R.string.please_wait))
        WebService.mInstance.updateProfile(request,img,object :UpdateProfileHandler{
            override fun onSuccess(response: GetProfileResponse) {
                view.hideProgressBar()
                view.onSuccessfullyUpdateProfile(response);
            }

            override fun onError(message: String) {
                view.hideProgressBar()
                view.showMessage(message)
            }

        })
    }
    override fun updateProfileImage(request: ApiRequest, img: File?) {
        view.showProgressBar(context.getString(R.string.please_wait))
        WebService.mInstance.updateProfole(request,img,object :UpdateProfileHandler{
            override fun onSuccess(response: GetProfileResponse) {
                view.hideProgressBar()
                view.onSuccessfullyUpdateProfile(response);
            }

            override fun onError(message: String) {
                view.hideProgressBar()
                view.showMessage(message)
            }

        })
    }
}