package com.stemlabs.ellu.data.remote.service

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.stemlabs.ellu.data.model.CommonResponse
import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse
import com.stemlabs.ellu.data.model.request.ApiRequest
import com.stemlabs.ellu.data.remote.handler.CommonHandler
import com.stemlabs.ellu.data.remote.handler.GetProfileHandler
import com.stemlabs.ellu.data.remote.handler.UpdateProfileHandler
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotCommand
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotModel
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.SignupCommand
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.Signupmodel
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.FrequentUtils
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.io.File
import java.lang.Exception
import java.util.concurrent.TimeUnit
import kotlin.reflect.jvm.internal.impl.load.java.Constant

class WebService {

    companion object {
        private lateinit var apiInterface: ApiService
        private lateinit var apiInterfacesend: ApiService
        private val interceptor: HttpLoggingInterceptor by lazy {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
        }
        private val httpClient: OkHttpClient by lazy {
            OkHttpClient.Builder()
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .callTimeout(60, TimeUnit.SECONDS)
                    .addInterceptor(interceptor).build()
        }
        val mInstance: WebService by lazy {
            //logging interceptor
            apiInterface = Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL.plus("api/"))
                    .client(httpClient)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            WebService()


            apiInterfacesend = Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL.plus("api/"))
                    .client(httpClient)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(ApiService::class.java)
            WebService()
        }
    }


    fun getProfile(request: ApiRequest, handler: GetProfileHandler) {
        apiInterface.getProfile(request).enqueue(object : Callback<GetProfileResponse> {
            override fun onFailure(call: Call<GetProfileResponse>, t: Throwable) {
                handler.onError(message = t.message.toString())
            }

            override fun onResponse(
                    call: Call<GetProfileResponse>,
                    response: Response<GetProfileResponse>
            ) {
                if (response.isSuccessful) {
                    if (response.body()!!.success)
                        handler.onSuccess(response.body()!!)
                    else
                        handler.onError(message = "")

                } else {
                    response.message().let {
                        handler.onError(message = it)
                    }
                }
            }

        })
    }

    fun updateProfile(
            request: ApiRequest,
            profileImg: File?,
            handler: UpdateProfileHandler
    ) {
//        FrequentUtils.getRequestBodyFromString(request.userId),
//        FrequentUtils.getRequestBodyFromString(request.name),
//        FrequentUtils.getRequestBodyFromString(request.dob),
//        FrequentUtils.getRequestBodyFromString(request.status),
//        profile_img
        val profile_img = FrequentUtils.getRequestBodyFromFile("avatar", profileImg)

        apiInterface.updateProfiles(
                request.userId, request.name, request.dob, request.status
        )
                .enqueue(object :
                        Callback<GetProfileResponse> {
                    override fun onFailure(call: Call<GetProfileResponse>, t: Throwable) {
                        t.message?.let {
                            handler.onError(it)
                        }
                    }

                    override fun onResponse(
                            call: Call<GetProfileResponse>,
                            response: Response<GetProfileResponse>
                    ) {
                        if (response.isSuccessful) {
                            if (response.body()!!.success)
                                handler.onSuccess(response.body()!!)
                            else
                                handler.onError(message = "")
                        } else {

                            handler.onError(response.message())
                        }
                    }

                })
    }

    fun updateProfole(
            request: ApiRequest,
            profileImg: File?,
            handler: UpdateProfileHandler
    ) {
//        FrequentUtils.getRequestBodyFromString(request.userId),
//        FrequentUtils.getRequestBodyFromString(request.name),
//        FrequentUtils.getRequestBodyFromString(request.dob),
//        FrequentUtils.getRequestBodyFromString(request.status),
//        profile_img
        val profile_img = FrequentUtils.getRequestBodyFromFile("avatar", profileImg)
        apiInterface.updateProfile(
                FrequentUtils.getRequestBodyFromString(request.userId),
                FrequentUtils.getRequestBodyFromString(request.remove_pic),
                profile_img
        )
                .enqueue(object :
                        Callback<GetProfileResponse> {
                    override fun onFailure(call: Call<GetProfileResponse>, t: Throwable) {
                        t.message?.let {
                            handler.onError(it)
                        }
                    }

                    override fun onResponse(
                            call: Call<GetProfileResponse>,
                            response: Response<GetProfileResponse>
                    ) {
                        if (response.isSuccessful) {
                            if (response.body()!!.success)
                                handler.onSuccess(response.body()!!)
                            else
                                handler.onError(message = "")
                        } else {

                            handler.onError(response.message())
                        }
                    }

                })
    }


    fun changePassword(request: ApiRequest, handler: CommonHandler) {
        apiInterface.changePassword(request).enqueue(object : Callback<CommonResponse> {
            override fun onFailure(call: Call<CommonResponse>, t: Throwable) {
                handler.onError(message = t.message.toString())
            }

            override fun onResponse(
                    call: Call<CommonResponse>,
                    response: Response<CommonResponse>
            ) {
                if (response.isSuccessful) {
                    if (response.body()!!.success)
                        handler.onSuccess(response.body()!!)
                    else
                        handler.onError(message = response.body()!!.message)

                } else {
                    response.message().let {
                        handler.onError(message = it)
                    }
                }
            }

        })
    }


    fun SignUp(
            name: String,
            email: String,
            password: String,
            deviceId: String,
            latitude: String,
            longitude: String,
            socialid: String,
            image: String,
            command: SignupCommand
    ) {
        apiInterface.signUp(
                mutableMapOf(
                        "name" to name,
                        "email" to email,
                        "password" to password,
                        "deviceId" to deviceId,
                        "latitude" to latitude,
                        "longitude" to longitude,
                        "socialId" to socialid,
                        "avatar" to image
                )
        )
                .enqueue(object : Callback<Signupmodel?> {
                    override fun onFailure(call: Call<Signupmodel?>, t: Throwable) {
                        command.onError(t.localizedMessage)
                    }

                    override fun onResponse(
                            call: Call<Signupmodel?>,
                            response: Response<Signupmodel?>
                    ) {
                        if (response.isSuccessful) {
                            response.body()?.let {

                                if (it.success == true) {
                                    command.onSuccess(it)
                                } else {
                                    it.success?.let { status ->
                                        command.onError(it.message)
                                    }
                                }
                            }
                        } else {
                            response.message().let {
                                command.onError(it)
                            }
                        }
                    }
                })

    }

    fun Forgot(
            type: String,
            phone: String, countryCode: String,
            command: ForgotCommand
    ) {
        apiInterface.userSendOtp(type, phone, countryCode)
                .enqueue(object : Callback<ForgotModel?> {
                    override fun onFailure(call: Call<ForgotModel?>, t: Throwable) {
                        command.onError(t.localizedMessage)
                    }

                    override fun onResponse(
                            call: Call<ForgotModel?>,
                            response: Response<ForgotModel?>
                    ) {
                        if (response.isSuccessful) {
                            response.body()?.let {

                                if (it.success == true) {
                                    command.onSuccess(it)
                                } else {
                                    it.success?.let { status ->
                                        command.onError(it.message)
                                    }
                                }
                            }
                        } else {
                            response.message().let {
                                command.onError(it)
                            }
                        }
                    }
                })

    }

    fun OtpVeriofy(
            name: String,
            email: String,
            password: String,
            phone: String,
            deviceId: String,
            latitude: String,
            longitude: String,
            otp: String,
            socialId: String,
            avatar:String,
            command: SignupCommand
    ) {
        apiInterface.Otpverification(
                mutableMapOf(
                        "name" to name,
                        "email" to email,
                        "password" to password,
                        "phone" to phone,
                        "deviceId" to deviceId,
                        "latitude" to latitude,
                        "longitude" to longitude,
                        "otp" to otp,
                        "avatar" to avatar,
                        "socialId" to socialId)

        )
                .enqueue(object : Callback<Signupmodel?> {
                    override fun onFailure(call: Call<Signupmodel?>, t: Throwable) {
                        command.onError(t.localizedMessage)
                    }

                    override fun onResponse(
                            call: Call<Signupmodel?>,
                            response: Response<Signupmodel?>
                    ) {
                        if (response.isSuccessful) {
                            response.body()?.let {

                                if (it.success == true) {
                                    command.onSuccess(it)
                                } else {
                                    it.success?.let { status ->
                                        command.onError(it.message)
                                    }
                                }
                            }
                        } else {
                            response.message().let {
                                command.onError(it)
                            }
                        }
                    }
                })

    }


    fun Login(
            email: String, password: String, deviceId: String,
            command: ForgotCommand
    ) {
        apiInterface.Login(email, password, deviceId)
                .enqueue(object : Callback<ForgotModel?> {
                    override fun onFailure(call: Call<ForgotModel?>, t: Throwable) {
                        command.onError(t.localizedMessage)
                    }

                    override fun onResponse(
                            call: Call<ForgotModel?>,
                            response: Response<ForgotModel?>
                    ) {
                        if (response.isSuccessful) {
                            response.body()?.let {

                                if (it.success == true) {
                                    command.onSuccess(it)
                                } else {
                                    it.success?.let { status ->
                                        command.onError(it.message)
                                    }
                                }
                            }
                        } else {
                            response.message().let {
                                command.onError(it)
                            }
                        }
                    }
                })

    }


    fun resetPassword(request: ApiRequest, handler: CommonHandler) {
        apiInterface.resetPassword(request).enqueue(object : Callback<CommonResponse> {
            override fun onFailure(call: Call<CommonResponse>, t: Throwable) {
                handler.onError(message = t.message.toString())
            }

            override fun onResponse(
                    call: Call<CommonResponse>,
                    response: Response<CommonResponse>
            ) {
                if (response.isSuccessful) {
                    if (response.body()!!.success)
                        handler.onSuccess(response.body()!!)
                    else
                        handler.onError(message = response.body()!!.message)

                } else {
                    response.message().let {
                        handler.onError(message = it)
                    }
                }
            }

        })
    }

    fun resendOtp(
            type: String,
            phone: String, countryCode: String,
            command: ForgotCommand
    ) {
        apiInterface.resendOtp(type,phone, countryCode)
                .enqueue(object : Callback<ForgotModel?> {
                    override fun onFailure(call: Call<ForgotModel?>, t: Throwable) {
                        command.onError(t.localizedMessage)
                    }

                    override fun onResponse(
                            call: Call<ForgotModel?>,
                            response: Response<ForgotModel?>
                    ) {
                        if (response.isSuccessful) {
                            response.body()?.let {

                                if (it.success == true) {
                                    command.onSuccess(it)
                                } else {
                                    it.success?.let { status ->
                                        command.onError(it.message)
                                    }
                                }
                            }
                        } else {
                            response.message().let {
                                command.onError(it)
                            }
                        }
                    }
                })

    }
}
