package com.stemlabs.ellu.data.preference;

import java.lang.System;

/**
 * This class will help to read/write data into preference.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001@B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010>\u001a\u00020?R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR&\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR&\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR&\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR&\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR&\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR&\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR&\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020#8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R&\u0010(\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020#8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R&\u0010*\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020#8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R&\u0010,\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020#8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R&\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\t\"\u0004\b0\u0010\u000bR\u000e\u00101\u001a\u000202X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010\u000bR&\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR&\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000b\u00a8\u0006A"}, d2 = {"Lcom/stemlabs/ellu/data/preference/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "MOBILE", "getMOBILE", "()Ljava/lang/String;", "setMOBILE", "(Ljava/lang/String;)V", "MOBILE_COUNTRY_CODE", "getMOBILE_COUNTRY_CODE", "setMOBILE_COUNTRY_CODE", "USER_ID", "getUSER_ID", "setUSER_ID", "USER_IMAGE_URL", "getUSER_IMAGE_URL", "setUSER_IMAGE_URL", "USER_NAME", "getUSER_NAME", "setUSER_NAME", "availability_log_id", "getAvailability_log_id", "setAvailability_log_id", "currency", "getCurrency", "setCurrency", "deviceToken", "getDeviceToken", "setDeviceToken", "isAvailabilityStatus", "setAvailabilityStatus", "", "isNotificationOn", "()Z", "setNotificationOn", "(Z)V", "isRemember", "setRemember", "isSmsOn", "setSmsOn", "isUserLogin", "setUserLogin", "password", "getPassword", "setPassword", "prefMode", "", "sharedPref", "Landroid/content/SharedPreferences;", "storeType", "getStoreType", "setStoreType", "supportEmail", "getSupportEmail", "setSupportEmail", "supportMobile", "getSupportMobile", "setSupportMobile", "clearAllPref", "", "PrefKeys", "app_debug"})
public final class SessionManager {
    private final int prefMode = 0;
    private final android.content.SharedPreferences sharedPref = null;
    private boolean isUserLogin = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String USER_ID = "RES1595341705UBS12170";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String USER_NAME = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String USER_IMAGE_URL = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String isAvailabilityStatus = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String availability_log_id = "";
    private boolean isNotificationOn = true;
    private boolean isSmsOn = true;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deviceToken = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String storeType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String MOBILE = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String MOBILE_COUNTRY_CODE = "";
    private boolean isRemember = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String supportMobile = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String supportEmail = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency = "";
    
    public final boolean isUserLogin() {
        return false;
    }
    
    public final void setUserLogin(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUSER_ID() {
        return null;
    }
    
    public final void setUSER_ID(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUSER_NAME() {
        return null;
    }
    
    public final void setUSER_NAME(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUSER_IMAGE_URL() {
        return null;
    }
    
    public final void setUSER_IMAGE_URL(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String isAvailabilityStatus() {
        return null;
    }
    
    public final void setAvailabilityStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvailability_log_id() {
        return null;
    }
    
    public final void setAvailability_log_id(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean isNotificationOn() {
        return false;
    }
    
    public final void setNotificationOn(boolean value) {
    }
    
    public final boolean isSmsOn() {
        return false;
    }
    
    public final void setSmsOn(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceToken() {
        return null;
    }
    
    public final void setDeviceToken(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStoreType() {
        return null;
    }
    
    public final void setStoreType(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMOBILE() {
        return null;
    }
    
    public final void setMOBILE(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMOBILE_COUNTRY_CODE() {
        return null;
    }
    
    public final void setMOBILE_COUNTRY_CODE(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean isRemember() {
        return false;
    }
    
    public final void setRemember(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSupportMobile() {
        return null;
    }
    
    public final void setSupportMobile(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSupportEmail() {
        return null;
    }
    
    public final void setSupportEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void clearAllPref() {
    }
    
    public SessionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stemlabs/ellu/data/preference/SessionManager$PrefKeys;", "", "()V", "AVAILABALITY_LOG_ID", "", "CURRENCY", "DEVICE_TOKEN", "IS_LOGIN", "IS_NOTIFICATION_ON", "IS_REMEMBER", "IS_SMS_ON", "MOBILE", "MOBILE_COUNTRY_CODE", "PASSWORD", "STORE_TPYE", "SUPPORT_EMAIL", "SUPPORT_MOBILE", "USER_AVAILABALITY_STATUS", "USER_ID", "USER_IMAGE_URL", "USER_NAME", "app_debug"})
    public static final class PrefKeys {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_LOGIN = "is_login";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_ID = "user_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_NAME = "user_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_IMAGE_URL = "user_image_url";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_AVAILABALITY_STATUS = "user_availability_status";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AVAILABALITY_LOG_ID = "availability_log_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MOBILE = "mobile";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PASSWORD = "password";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_NOTIFICATION_ON = "is_notification_on";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_SMS_ON = "is_sms_on";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MOBILE_COUNTRY_CODE = "mobile_country_code";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEVICE_TOKEN = "device_token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String STORE_TPYE = "store_type";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_REMEMBER = "is_remember";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUPPORT_EMAIL = "customer_support_email";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SUPPORT_MOBILE = "customer_support_mobile";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CURRENCY = "currency";
        public static final com.stemlabs.ellu.data.preference.SessionManager.PrefKeys INSTANCE = null;
        
        private PrefKeys() {
            super();
        }
    }
}