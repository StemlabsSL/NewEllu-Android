package com.stemlabs.ellu.ui.model


data class UserSession(
    var availability_status: String? = "",
    var device_id: String? = "",
    var device_token: String? = "",
    var device_type: String? = "",
    var status: String? = ""
)