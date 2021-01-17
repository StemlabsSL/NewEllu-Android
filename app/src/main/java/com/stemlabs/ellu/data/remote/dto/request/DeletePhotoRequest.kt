package com.stemlabs.ellu.data.remote.dto.request


import com.google.gson.annotations.SerializedName

data class DeletePhotoRequest(
    @SerializedName("photo_type")
    var photo_type: String = "",
    @SerializedName("mediaType")
    var mediaType: String = "",
    @SerializedName("id")
    var id: String = "",
    @SerializedName("code")
    var code: String = "",
    @SerializedName("url")
    var url: String = "",
    @SerializedName("banner_id")
    var banner_id: String = ""
)