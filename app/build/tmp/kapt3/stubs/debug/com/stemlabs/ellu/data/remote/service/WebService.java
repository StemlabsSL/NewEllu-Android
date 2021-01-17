package com.stemlabs.ellu.data.remote.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ^\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0016JN\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020 J&\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010#\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020&J \u0010\'\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001d\u001a\u00020&\u00a8\u0006)"}, d2 = {"Lcom/stemlabs/ellu/data/remote/service/WebService;", "", "()V", "Forgot", "", "type", "", "phone", "countryCode", "command", "Lcom/stemlabs/ellu/ui/component/loginflow/modelsignup/ForgotCommand;", "Login", "email", "password", "deviceId", "OtpVeriofy", "name", "latitude", "longitude", "otp", "socialId", "avatar", "Lcom/stemlabs/ellu/ui/component/loginflow/modelsignup/SignupCommand;", "SignUp", "socialid", "image", "changePassword", "request", "Lcom/stemlabs/ellu/data/model/request/ApiRequest;", "handler", "Lcom/stemlabs/ellu/data/remote/handler/CommonHandler;", "getProfile", "Lcom/stemlabs/ellu/data/remote/handler/GetProfileHandler;", "resendOtp", "resetPassword", "updateProfile", "profileImg", "Ljava/io/File;", "Lcom/stemlabs/ellu/data/remote/handler/UpdateProfileHandler;", "updateProfole", "Companion", "app_debug"})
public final class WebService {
    private static com.stemlabs.ellu.data.remote.service.ApiService apiInterface;
    private static com.stemlabs.ellu.data.remote.service.ApiService apiInterfacesend;
    private static final kotlin.Lazy interceptor$delegate = null;
    private static final kotlin.Lazy httpClient$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy mInstance$delegate = null;
    public static final com.stemlabs.ellu.data.remote.service.WebService.Companion Companion = null;
    
    public final void getProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.remote.handler.GetProfileHandler handler) {
    }
    
    public final void updateProfile(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.Nullable()
    java.io.File profileImg, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.remote.handler.UpdateProfileHandler handler) {
    }
    
    public final void updateProfole(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.Nullable()
    java.io.File profileImg, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.remote.handler.UpdateProfileHandler handler) {
    }
    
    public final void changePassword(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.remote.handler.CommonHandler handler) {
    }
    
    public final void SignUp(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String socialid, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.loginflow.modelsignup.SignupCommand command) {
    }
    
    public final void Forgot(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotCommand command) {
    }
    
    public final void OtpVeriofy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String otp, @org.jetbrains.annotations.NotNull()
    java.lang.String socialId, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.loginflow.modelsignup.SignupCommand command) {
    }
    
    public final void Login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotCommand command) {
    }
    
    public final void resetPassword(@org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.model.request.ApiRequest request, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.data.remote.handler.CommonHandler handler) {
    }
    
    public final void resendOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotCommand command) {
    }
    
    public WebService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/stemlabs/ellu/data/remote/service/WebService$Companion;", "", "()V", "apiInterface", "Lcom/stemlabs/ellu/data/remote/service/ApiService;", "apiInterfacesend", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getInterceptor", "()Lokhttp3/logging/HttpLoggingInterceptor;", "interceptor$delegate", "mInstance", "Lcom/stemlabs/ellu/data/remote/service/WebService;", "getMInstance", "()Lcom/stemlabs/ellu/data/remote/service/WebService;", "mInstance$delegate", "app_debug"})
    public static final class Companion {
        
        private final okhttp3.logging.HttpLoggingInterceptor getInterceptor() {
            return null;
        }
        
        private final okhttp3.OkHttpClient getHttpClient() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stemlabs.ellu.data.remote.service.WebService getMInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}