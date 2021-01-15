package com.stemlabs.ellu.utils

import android.util.Patterns

object Validations {


    fun isFieldEmpty(field: String): Boolean = field.isEmpty()

    fun isInvalidEmail(field: String): Boolean = !Patterns.EMAIL_ADDRESS.matcher(field).matches()

    fun isInvalidNumber(field: String): Boolean = field.length < 9

    fun isShortPassword(field: String): Boolean = field.length < 6

    fun isInvalidCVV(field: String): Boolean = field.length < 3

    fun isDifferentPassword(oldPass: String, newPass: String): Boolean = !oldPass.equals(newPass, true)
}