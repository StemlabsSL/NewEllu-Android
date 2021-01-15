package com.stemlabs.ellu.ui.component.profile.fragment.view

import org.mockito.junit.MockitoJUnitRunner

interface BaseView {

    fun showMessage(message:String)
    fun hideProgressBar()
    fun showProgressBar(message: String)
}