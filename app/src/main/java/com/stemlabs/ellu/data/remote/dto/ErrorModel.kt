package com.bluebird.partner.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ErrorModel(
    @SerializedName("error")
    val error: Error = Error(),
    @SerializedName("payload")
    val payload: Any = Any(),
    @SerializedName("status")
    val status: String = ""
) {
    data class Error(
        @SerializedName("code")
        val code: Int = 0,
        @SerializedName("language_code")
        val languageCode: String = "",
        @SerializedName("message")
        val message: String = "",
        @SerializedName("name")
        val name: String = ""
    )
}