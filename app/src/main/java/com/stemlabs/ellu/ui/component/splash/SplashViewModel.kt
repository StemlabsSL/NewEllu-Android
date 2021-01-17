package com.stemlabs.ellu.ui.component.splash

import com.stemlabs.ellu.data.error.mapper.ErrorMapper
import com.stemlabs.ellu.ui.base.BaseViewModel
import com.stemlabs.ellu.usecase.errors.ErrorManager
import javax.inject.Inject



class SplashViewModel @Inject
constructor() : BaseViewModel(){
    override val errorManager: ErrorManager
        get() = ErrorManager(ErrorMapper())
}
