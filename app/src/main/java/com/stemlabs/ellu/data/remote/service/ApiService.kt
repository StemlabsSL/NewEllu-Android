package com.stemlabs.ellu.data.remote.service

import com.stemlabs.ellu.data.model.CommonResponse
import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse
import com.stemlabs.ellu.data.model.request.ApiRequest
import com.stemlabs.ellu.data.remote.dto.*
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotModel
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.Signupmodel
import retrofit2.Call
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*


interface ApiService {
    @GET("language/get-languages")
    suspend fun fetchLanguage(
    ): Response<LanguageModel>

    @POST("user/myProfile")
    fun getProfile(@Body req: ApiRequest): Call<GetProfileResponse>


    @POST("user/changePassword")
    fun changePassword(@Body req: ApiRequest): Call<CommonResponse>

    @POST("user/resetPassword")
    fun resetPassword(@Body req: ApiRequest): Call<CommonResponse>

    @Multipart
    @POST("user/editProfile")
    fun updateProfile(
            @Part("userId") userId: RequestBody,
            @Part("remove_pic") remove_pic: RequestBody,
            @Part profileImage: MultipartBody.Part?
    ): Call<GetProfileResponse>


    @FormUrlEncoded
    @POST("user/editProfiles")
    fun updateProfiles(
            @Field("userId") userId: String,
            @Field("name") first_name: String,
            @Field("dob") dob: String,
            @Field("statusMessage") status: String

    ): Call<GetProfileResponse>


    @POST("user/signUp")
    fun signUp(
            @Body request: Map<String, String> = mutableMapOf(
                    "name" to "",
                    "email" to "",
                    "password" to "",
                    "deviceId" to "",
                    "latitude" to "",
                    "longitude" to "",
                    "socialId" to "",
                    "avatar" to ""
            )
    ): Call<Signupmodel>

    @POST("user/verifyOtp")
    fun Otpverification(
            @Body request: Map<String, String> = mutableMapOf(
                    "name" to "",
                    "email" to "",
                    "phone" to "",
                    "password" to "",
                    "deviceId" to "",
                    "latitude" to "",
                    "longitude" to "",
                    "otp" to "",
                    "avatar" to "",
                    "socialId" to ""
            )
    ): Call<Signupmodel>

    @FormUrlEncoded
    @POST("user/signin")
    fun Login(@Field("email") phone: String, @Field("password") password: String, @Field("deviceId") deviceID: String): Call<ForgotModel>

    @FormUrlEncoded
    @POST("user/sendOtp")
    fun userSendOtp(@Field("type") type: String, @Field("phone") phone: String, @Field("countryCode") country: String): Call<ForgotModel>

    @FormUrlEncoded
    @POST("user/sendOtp")
    fun resendOtp(@Field("type") type: String, @Field("phone") phone: String, @Field("countryCode") country: String): Call<ForgotModel>

}
