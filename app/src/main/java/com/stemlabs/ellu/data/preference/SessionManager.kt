package com.stemlabs.ellu.data.preference

import android.content.Context
import android.content.SharedPreferences
import com.stemlabs.ellu.utils.Constants

/**
 * This class will help to read/write data into preference.
 */
class SessionManager(context: Context) {

    private val prefMode: Int = 0
    private val sharedPref: SharedPreferences =
            context.getSharedPreferences(Constants.PREF_NAME, prefMode)

    // All the pref keys
    object PrefKeys {
        const val IS_LOGIN: String = "is_login"
        const val USER_ID: String = "user_id"
        const val USER_NAME: String = "user_name"
        const val USER_IMAGE_URL: String = "user_image_url"
        const val USER_AVAILABALITY_STATUS: String = "user_availability_status"
        const val AVAILABALITY_LOG_ID: String = "availability_log_id"
        const val MOBILE: String = "mobile"
        const val PASSWORD: String = "password"
        const val IS_NOTIFICATION_ON: String = "is_notification_on"
        const val IS_SMS_ON: String = "is_sms_on"
        const val MOBILE_COUNTRY_CODE: String = "mobile_country_code"
        const val DEVICE_TOKEN: String = "device_token"
        const val STORE_TPYE: String = "store_type"
        const val IS_REMEMBER: String = "is_remember"
        const val SUPPORT_EMAIL: String = "customer_support_email"
        const val SUPPORT_MOBILE: String = "customer_support_mobile"
        const val CURRENCY: String = "currency"
    }

    var isUserLogin: Boolean = false
        get() {
            return sharedPref.getBoolean(PrefKeys.IS_LOGIN, false)
        }
        set(value) {
            field = value
            sharedPref.edit().putBoolean(PrefKeys.IS_LOGIN, value).apply()
        }

    var USER_ID: String = "RES1595341705UBS12170"
        get() {
            return sharedPref.getString(PrefKeys.USER_ID, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.USER_ID, value).apply()
        }

    var USER_NAME: String = ""
        get() {
            return sharedPref.getString(PrefKeys.USER_NAME, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.USER_NAME, value).apply()
        }

    var USER_IMAGE_URL: String = ""
        get() {
            return sharedPref.getString(PrefKeys.USER_IMAGE_URL, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.USER_IMAGE_URL, value).apply()
        }

    var isAvailabilityStatus: String = ""
        get() {
            return sharedPref.getString(PrefKeys.USER_AVAILABALITY_STATUS, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.USER_AVAILABALITY_STATUS, value).apply()
        }

    var availability_log_id: String = ""
        get() {
            return sharedPref.getString(PrefKeys.AVAILABALITY_LOG_ID, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.AVAILABALITY_LOG_ID, value).apply()
        }

    var isNotificationOn: Boolean = true
        get() {
            return sharedPref.getBoolean(PrefKeys.IS_NOTIFICATION_ON, true)
        }
        set(value) {
            field = value
            sharedPref.edit().putBoolean(PrefKeys.IS_NOTIFICATION_ON, value).apply()
        }

    var isSmsOn: Boolean = true
        get() {
            return sharedPref.getBoolean(PrefKeys.IS_SMS_ON, true)
        }
        set(value) {
            field = value
            sharedPref.edit().putBoolean(PrefKeys.IS_SMS_ON, value).apply()
        }

    var deviceToken: String = ""
        get() {
            return sharedPref.getString(PrefKeys.DEVICE_TOKEN, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.DEVICE_TOKEN, value).apply()
        }

    var storeType: String = ""
        get() {
            return sharedPref.getString(PrefKeys.STORE_TPYE, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.STORE_TPYE, value).apply()
        }

    var MOBILE: String = ""
        get() {
            return sharedPref.getString(PrefKeys.MOBILE, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.MOBILE, value).apply()
        }

    var password: String = ""
        get() {
            return sharedPref.getString(PrefKeys.PASSWORD, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.PASSWORD, value).apply()
        }

    var MOBILE_COUNTRY_CODE: String = ""
        get() {
            return sharedPref.getString(PrefKeys.MOBILE_COUNTRY_CODE, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.MOBILE_COUNTRY_CODE, value).apply()
        }

    var isRemember: Boolean = false
        get() {
            return sharedPref.getBoolean(PrefKeys.IS_REMEMBER, false)
        }
        set(value) {
            field = value
            sharedPref.edit().putBoolean(PrefKeys.IS_REMEMBER, value).apply()
        }

    var supportMobile: String = ""
        get() {
            return sharedPref.getString(PrefKeys.SUPPORT_MOBILE, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.SUPPORT_MOBILE, value).apply()
        }

    var supportEmail: String = ""
        get() {
            return sharedPref.getString(PrefKeys.SUPPORT_EMAIL, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.SUPPORT_EMAIL, value).apply()
        }

    var currency: String = ""
        get() {
            return sharedPref.getString(PrefKeys.CURRENCY, "")!!
        }
        set(value) {
            field = value
            sharedPref.edit().putString(PrefKeys.CURRENCY, value).apply()
        }

    fun clearAllPref() {
        return sharedPref.edit().clear().apply()
    }

}