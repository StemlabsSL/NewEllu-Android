package com.stemlabs.ellu.ui.component.loginflow.modelsignup

interface SignupCommand {

    fun onSuccess(response: Signupmodel)
    fun onError(message: String)
}