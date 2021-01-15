package com.stemlabs.ellu.notification


import com.google.gson.annotations.SerializedName

data class PushNotification(
    @SerializedName("data")
    val `data`: Data = Data()
) {
    data class Data(
        @SerializedName("driver_id")
        val driverId: String = "",
        @SerializedName("message")
        val message: String = "",
        @SerializedName("messageFrom")
        val messageFrom: String = "",
        @SerializedName("order_id")
        val orderId: String = "",
        @SerializedName("push_type")
        val pushType: String = ""
    )
}