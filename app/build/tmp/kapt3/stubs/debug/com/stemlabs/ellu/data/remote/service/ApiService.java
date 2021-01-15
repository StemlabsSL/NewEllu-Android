package com.stemlabs.ellu.data.remote.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\fH\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\fH\'J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010!H\'J6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u0006H\'J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/stemlabs/ellu/data/remote/service/ApiService;", "", "Login", "Lretrofit2/Call;", "Lcom/stemlabs/ellu/ui/component/loginflow/modelsignup/ForgotModel;", "phone", "", "password", "deviceID", "Otpverification", "Lcom/stemlabs/ellu/ui/component/loginflow/modelsignup/Signupmodel;", "request", "", "changePassword", "Lcom/stemlabs/ellu/data/model/CommonResponse;", "req", "Lcom/stemlabs/ellu/data/model/request/ApiRequest;", "fetchLanguage", "Lretrofit2/Response;", "Lcom/stemlabs/ellu/data/remote/dto/LanguageModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfile", "Lcom/stemlabs/ellu/data/model/getProfile/GetProfileResponse;", "resendOtp", "type", "country", "resetPassword", "signUp", "updateProfile", "userId", "Lokhttp3/RequestBody;", "remove_pic", "profileImage", "Lokhttp3/MultipartBody$Part;", "updateProfiles", "first_name", "dob", "status", "userSendOtp", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "language/get-languages")
    public abstract java.lang.Object fetchLanguage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.stemlabs.ellu.data.remote.dto.LanguageModel>> p0);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/myProfile")
    public abstract retrofit2.Call<com.stemlabs.ellu.data.model.getProfile.GetProfileResponse> getProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.stemlabs.ellu.data.model.request.ApiRequest req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/changePassword")
    public abstract retrofit2.Call<com.stemlabs.ellu.data.model.CommonResponse> changePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.stemlabs.ellu.data.model.request.ApiRequest req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/resetPassword")
    public abstract retrofit2.Call<com.stemlabs.ellu.data.model.CommonResponse> resetPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.stemlabs.ellu.data.model.request.ApiRequest req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/editProfile")
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<com.stemlabs.ellu.data.model.getProfile.GetProfileResponse> updateProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "userId")
    okhttp3.RequestBody userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "remove_pic")
    okhttp3.RequestBody remove_pic, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part profileImage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/editProfiles")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.stemlabs.ellu.data.model.getProfile.GetProfileResponse> updateProfiles(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "userId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "name")
    java.lang.String first_name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "dob")
    java.lang.String dob, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "statusMessage")
    java.lang.String status);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/signUp")
    public abstract retrofit2.Call<com.stemlabs.ellu.ui.component.loginflow.modelsignup.Signupmodel> signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/verifyOtp")
    public abstract retrofit2.Call<com.stemlabs.ellu.ui.component.loginflow.modelsignup.Signupmodel> Otpverification(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/signin")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotModel> Login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "deviceId")
    java.lang.String deviceID);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/sendOtp")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotModel> userSendOtp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "phone")
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "countryCode")
    java.lang.String country);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "user/sendOtp")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotModel> resendOtp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "phone")
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "countryCode")
    java.lang.String country);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}