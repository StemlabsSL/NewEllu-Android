package com.stemlabs.ellu.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ \u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\bJ\"\u0010#\u001a\u0004\u0018\u00010\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014J\u000e\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0014J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J&\u00102\u001a\u00020\u000b2\u0006\u00100\u001a\u0002012\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014J\u0018\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u000209H\u0002J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u0014J\u0016\u0010>\u001a\u00020\b2\u0006\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020\u0014J\u000e\u0010?\u001a\u00020\b2\u0006\u0010<\u001a\u000209J\u000e\u0010@\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+J\n\u0010A\u001a\u00020\u0004*\u00020B\u00a8\u0006C"}, d2 = {"Lcom/stemlabs/ellu/utils/FrequentUtils;", "", "()V", "LoadImage", "", "view", "Landroid/widget/ImageView;", "imageUrl", "", "Lde/hdodenhof/circleimageview/CircleImageView;", "changeImageOrientation", "Landroid/graphics/Bitmap;", "photoPath", "bitmap", "createFileFromBitMap", "Ljava/io/File;", "getAddressExceptCountryName", "address", "getAge", "year", "", "month", "day", "getCorrectTime", "selectedHours", "selectedMinute", "getFormat", "Ljava/text/NumberFormat;", "getRequestBodyFromFile", "Lokhttp3/MultipartBody$Part;", "key", "file", "getRequestBodyFromString", "Lokhttp3/RequestBody;", "value", "getResizedBitmap", "bitmapImage", "bitmapWidth", "bitmapHeight", "getTwoDigitNumber", "i", "hideSoftKeyBoard", "activity", "Landroid/app/Activity;", "initFormat", "Ljava/util/Locale;", "isNetworkConnected", "", "context", "Landroid/content/Context;", "resizeMapIcons", "resId", "width", "height", "rotateImage", "source", "angle", "", "round", "", "values", "places", "roundToDigit", "roundToOneDigit", "showSoftKeyBoard", "hideKeyboard", "Landroid/view/View;", "app_debug"})
public final class FrequentUtils {
    public static final com.stemlabs.ellu.utils.FrequentUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressExceptCountryName(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorrectTime(int selectedHours, int selectedMinute) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody getRequestBodyFromString(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part getRequestBodyFromFile(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap resizeMapIcons(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resId, int width, int height) {
        return null;
    }
    
    public final void hideSoftKeyBoard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void showSoftKeyBoard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTwoDigitNumber(int i) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String roundToDigit(float values, int places) {
        return null;
    }
    
    public final double round(double values, int places) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String roundToOneDigit(float values) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.NumberFormat getFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale initFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAge(int year, int month, int day) {
        return null;
    }
    
    public final boolean isNetworkConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void LoadImage(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void LoadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File createFileFromBitMap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap changeImageOrientation(@org.jetbrains.annotations.Nullable()
    java.lang.String photoPath, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final android.graphics.Bitmap rotateImage(android.graphics.Bitmap source, float angle) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getResizedBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmapImage, int bitmapWidth, int bitmapHeight) {
        return null;
    }
    
    private FrequentUtils() {
        super();
    }
}