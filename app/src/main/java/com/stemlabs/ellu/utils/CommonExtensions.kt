package com.stemlabs.ellu.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.CompoundButton
import android.widget.EditText
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.stemlabs.ellu.R


fun <T> LiveData<T>.reObserve(owner: LifecycleOwner, observer: Observer<T>) {
    removeObserver(observer)
    observe(owner, observer)
}

/**
 * Adds TextWatcher to the EditText
 */
fun EditText.onTextChanged(listener: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {

        override fun afterTextChanged(s: Editable?) {
            listener(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    })
}


fun CompoundButton.check() {
    this.isChecked = true
}

fun CompoundButton.unCheck() {
    this.isChecked = false
}

fun CompoundButton.toggleCheck() {
    this.isChecked = !this.isChecked
}


fun View.makeVisible() {
    this.visibility = View.VISIBLE
}

fun View.makeGone() {
    this.visibility = View.GONE
}

fun View.makeInvisible() {
    this.visibility = View.INVISIBLE
}

fun View.makeTransaprent() {
    this.setBackgroundResource(R.color.transparent)
}

/**
 * Toggle a view's visibility
 */
fun View.toggleVisibility(): View {
    visibility = if (visibility == View.VISIBLE) {
        View.GONE
    } else {
        View.VISIBLE
    }
    return this
}

fun SnapHelper.getSnapPosition(recyclerView: RecyclerView): Int {
    val layoutManager = recyclerView.layoutManager ?: return RecyclerView.NO_POSITION
    val snapView = findSnapView(layoutManager) ?: return RecyclerView.NO_POSITION
    return layoutManager.getPosition(snapView)
}

/**
 * Extension method to show a keyboard for View.
 */


/**
 * Try to hide the keyboard and returns whether it worked
 * https://stackoverflow.com/questions/1109022/close-hide-the-android-soft-keyboard
 */


fun Double.findPerOf(total: Long): Double {
    Log.d("CommonExtensions", "${this / total}")
    return (this / total) * 100
}

fun <V : View?> BottomSheetBehavior<V>.expand() {
    this.state = BottomSheetBehavior.STATE_EXPANDED
}

fun <V : View?> BottomSheetBehavior<V>.collapse() {
    this.state = BottomSheetBehavior.STATE_COLLAPSED
}

fun <V : View?> BottomSheetBehavior<V>.setPeek(height: Int) {
    this.peekHeight = height
}

fun <V : View?> BottomSheetBehavior<V>.expandWithPeekHeight(height: Int) {
    this.isHideable = false
    this.peekHeight = height
    this.state = BottomSheetBehavior.STATE_EXPANDED
}

fun <V : View?> BottomSheetBehavior<V>.hide() {
    this.isHideable = true
    this.state = BottomSheetBehavior.STATE_HIDDEN
}

inline fun <R> R?.orElse(block: () -> R): R {
    return this ?: block()
}

fun Context.isInternetAvailable(): Boolean {
    val connectivityManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
    return activeNetwork?.isConnectedOrConnecting == true
}
