package com.stemlabs.ellu.ui.component.loginflow.modelsignup

interface ForgotCommand {

    fun onSuccess(response: ForgotModel)
    fun onError(message: String)
}