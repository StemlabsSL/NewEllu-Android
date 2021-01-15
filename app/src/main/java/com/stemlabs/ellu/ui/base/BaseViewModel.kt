package com.stemlabs.ellu.ui.base

import androidx.lifecycle.ViewModel
import com.stemlabs.ellu.usecase.errors.ErrorManager





abstract class BaseViewModel : ViewModel() {
    /**Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    abstract val errorManager: ErrorManager

}
