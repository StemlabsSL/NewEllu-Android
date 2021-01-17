package com.stemlabs.ellu.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b\u00a8\u0006#"}, d2 = {"Lcom/stemlabs/ellu/utils/Constants;", "", "()V", "APPSTATUS", "", "getAPPSTATUS", "()Ljava/lang/String;", "setAPPSTATUS", "(Ljava/lang/String;)V", "APP_BASE_URL_LOCAL", "APP_NAME", "BASE_URL", "DELAY", "", "FINGER_KEY", "IMAGE_BASE_URL", "LABEL_PREFERENCE_NAME", "PREF_NAME", "PRO_ID", "ProximityDelay", "SOCIAL_ID", "SPLASH_DELAY", "USER_CPP", "USER_DEVICE_ID", "USER_EMAIL", "USER_ID", "USER_LATITUDE", "USER_LONGITUDE", "USER_NAME", "USER_OTP", "USER_PASSWORD", "USER_PHONE", "userType", "getUserType", "setUserType", "app_debug"})
public final class Constants {
    public static final int SPLASH_DELAY = 700;
    public static final int DELAY = 1200;
    public static final int ProximityDelay = 5000;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://34.227.86.250:4000/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_BASE_URL = "http://34.227.86.250:4000/uploads/profile/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_BASE_URL_LOCAL = "http://localhost:3000/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FINGER_KEY = "FingerKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_NAME = "smartdata-mvvm";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LABEL_PREFERENCE_NAME = "smartdata-mvvm-label";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String userType = "mvvm";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String APPSTATUS = "APPSTATUS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_NAME = "Ellu Chat";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_NAME = "userName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "USER_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRO_ID = "PRO_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOCIAL_ID = "SOCIAL_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_EMAIL = "userEmail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PASSWORD = "userPassword";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_DEVICE_ID = "DeviceId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_LATITUDE = "latitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_LONGITUDE = "longitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PHONE = "phone";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_OTP = "otp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_CPP = "cpp";
    public static final com.stemlabs.ellu.utils.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserType() {
        return null;
    }
    
    public final void setUserType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPPSTATUS() {
        return null;
    }
    
    public final void setAPPSTATUS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private Constants() {
        super();
    }
}