package com.stemlabs.ellu.data.remote.dto

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class LanguageModel(
        @SerializedName("error")
        val error: Any = Any(),
        @SerializedName("payload")
        val payload: List<Payload> = listOf(),
        @SerializedName("status")
        val status: Int = 0
) {
    data class Payload(
            @SerializedName("code")
            val code: String = "",
            @SerializedName("created_date")
            val createdDate: String = "",
            @SerializedName("_id")
            val id: String = "",
            @SerializedName("language_id")
            val languageId: String = "",
            @SerializedName("status")
            val status: String = "",
            @SerializedName("title")
            val title: String = "",
            @SerializedName("updated_date")
            val updatedDate: String = ""
    )
}