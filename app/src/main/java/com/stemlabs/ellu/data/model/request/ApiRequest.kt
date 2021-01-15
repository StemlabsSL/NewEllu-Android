package com.stemlabs.ellu.data.model.request

import com.google.gson.annotations.SerializedName

class ApiRequest {
    @SerializedName("userId")
    var userId: String = ""
@SerializedName("name")
    var name: String = ""

    @SerializedName("dob")
    var dob: String = ""

    @SerializedName("status")
    var status: String = ""

    @SerializedName("phone")
    var phone: String = ""


    @SerializedName("remove_pic")
    var remove_pic: String = ""

    @SerializedName("type")
    var type: String = ""


    @SerializedName("password")
    var password: String = ""

    @SerializedName("newPassword")
    var newPassword: String = ""
    @SerializedName("oldPassword")
    var oldPassword: String = ""

}