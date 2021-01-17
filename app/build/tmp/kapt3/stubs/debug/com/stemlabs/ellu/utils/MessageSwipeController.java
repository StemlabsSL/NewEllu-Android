package com.stemlabs.ellu.utils;

import java.lang.System;

/**
 * Created by Shain Singh on 1/5/19.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002J\u0016\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\bH\u0016J@\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020$2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u000fH\u0016J \u0010.\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0016J\u0018\u00100\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\b2\u0006\u00101\u001a\u00020\u001bH\u0016J\u0018\u00102\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\bH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/stemlabs/ellu/utils/MessageSwipeController;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "swipeControllerActions", "Lcom/stemlabs/ellu/utils/SwipeControllerActions;", "(Landroid/content/Context;Lcom/stemlabs/ellu/utils/SwipeControllerActions;)V", "currentItemViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "", "density", "imageDrawable", "Landroid/graphics/drawable/Drawable;", "isVibrate", "", "lastReplyButtonAnimationTime", "", "mView", "Landroid/view/View;", "replyButtonProgress", "shareRound", "startTracking", "swipeBack", "checkDisplaySize", "", "convertToAbsoluteDirection", "", "flags", "layoutDirection", "convertTodp", "pixel", "dp", "value", "drawReplyButton", "canvas", "Landroid/graphics/Canvas;", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "onChildDraw", "c", "dY", "actionState", "isCurrentlyActive", "onMove", "target", "onSwiped", "direction", "setTouchListener", "app_debug"})
public final class MessageSwipeController extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    private android.graphics.drawable.Drawable imageDrawable;
    private android.graphics.drawable.Drawable shareRound;
    private androidx.recyclerview.widget.RecyclerView.ViewHolder currentItemViewHolder;
    private android.view.View mView;
    private float dX = 0.0F;
    private float replyButtonProgress = 0.0F;
    private long lastReplyButtonAnimationTime = 0L;
    private boolean swipeBack = false;
    private boolean isVibrate = false;
    private boolean startTracking = false;
    private float density = 1.0F;
    private final android.content.Context context = null;
    private final com.stemlabs.ellu.utils.SwipeControllerActions swipeControllerActions = null;
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override()
    public int convertToAbsoluteDirection(int flags, int layoutDirection) {
        return 0;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setTouchListener(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    private final void drawReplyButton(android.graphics.Canvas canvas) {
    }
    
    private final int convertTodp(int pixel) {
        return 0;
    }
    
    public final int dp(float value, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    private final void checkDisplaySize(android.content.Context context) {
    }
    
    public MessageSwipeController(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stemlabs.ellu.utils.SwipeControllerActions swipeControllerActions) {
        super();
    }
}