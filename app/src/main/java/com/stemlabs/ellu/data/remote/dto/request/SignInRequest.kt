package com.stemlabs.ellu.data.remote.dto.request


import com.google.gson.annotations.SerializedName

data class SignInRequest(
    @SerializedName("code")
    var code: String = "",
    @SerializedName("device_id")
    var deviceId: String = "",
    @SerializedName("device_name")
    var deviceName: String = "",
    @SerializedName("device_token")
    var deviceToken: String = "",
    @SerializedName("device_type")
    var deviceType: String = "",
    @SerializedName("mobile")
    var mobile: String = "",
    @SerializedName("mobile_country_code")
    var mobileCountyCode: String = "",
    @SerializedName("password")
    var password: String = ""
)