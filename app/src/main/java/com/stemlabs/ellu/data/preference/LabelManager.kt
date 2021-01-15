package com.stemlabs.ellu.data.preference

import android.content.Context
import android.content.SharedPreferences
import com.stemlabs.ellu.utils.Constants

/**
 * This class will help to read/write data into preference.
 */
class LabelManager(context: Context) {

    private val prefMode: Int = 0
    private val sharedPref: SharedPreferences =
        context.getSharedPreferences(Constants.LABEL_PREFERENCE_NAME, prefMode)

    var LANGUAGE_CODE: String = "EN"
        get() {
            return if (sharedPref.getString(PrefKeys.LANGUAGE_CODE, "")!!.isEmpty())
                "EN"
            else
                sharedPref.getString(PrefKeys.LANGUAGE_CODE, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.LANGUAGE_CODE, value).apply()
        }

    fun setValue(key: String, value: String) {
        sharedPref.edit().putString(key, value).apply()
    }

    fun getValue(key: String): String {
        return sharedPref.getString(key, "")!!
    }

    fun clearAllPref() {
        return sharedPref.edit().clear().apply()
    }
}