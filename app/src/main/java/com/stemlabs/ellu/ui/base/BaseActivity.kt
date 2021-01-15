package com.stemlabs.ellu.ui.base

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.res.Configuration
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.snackbar.Snackbar
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.RepoModel
import com.stemlabs.ellu.data.preference.PrefKeys
import com.stemlabs.ellu.ui.base.listeners.BaseView
import com.stemlabs.ellu.utils.EspressoIdlingResource
import com.stemlabs.ellu.utils.GlobalMethods
import dagger.android.AndroidInjection
import java.util.*



abstract class BaseActivity : AppCompatActivity(), BaseView {

    protected abstract fun initializeViewModel()
    abstract fun observeViewModel()
    protected abstract fun initViewBinding()
    var repo: RepoModel? = null
    private lateinit var mDialog: Dialog
    var fragment :Fragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        initViewBinding()
        initializeViewModel()
        observeViewModel()

        repo = RepoModel(this)

        mDialog = Dialog(this, R.style.MaterialDialogSheet)
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        mDialog.setContentView(R.layout.progress_loader)
        val progressImage = mDialog.findViewById<ImageView>(R.id.ivProgress)
        mDialog.setCancelable(false)
        mDialog.setCanceledOnTouchOutside(false)

        setLocale(this)
    }

    fun setLocale(context: Context) {
        val locale = Locale(repo!!.labelPref.LANGUAGE_CODE.toLowerCase(Locale.ROOT))
        Locale.setDefault(locale)

        val config = Configuration()
        config.setLocale(locale)
        context.resources
                .updateConfiguration(config, context.resources.displayMetrics)
        Log.e("TAG", "onCreate ${repo!!.labelPref.LANGUAGE_CODE}")

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    fun showProgressDialog() {
        if (!mDialog.isShowing && (!this.isFinishing)) {
            mDialog.show()
            EspressoIdlingResource.increment()
        }
    }

    fun dismissProgressDialog() {
        if (mDialog.isShowing) {
            mDialog.dismiss()
            EspressoIdlingResource.decrement()
        }
    }

    fun showMessageDialog(msg: String, isConfirm: Boolean = false) {
        val bundle = Bundle()
        bundle.putString("tvMsgText", msg)
        if (isConfirm) {
            bundle.putString("okTxt", repo!!.labelPref.getValue(PrefKeys.BTN_GLOBAL_YES))
            bundle.putString("cancelTxt", repo!!.labelPref.getValue(PrefKeys.BTN_GLOBAL_NO))
        } else {
            bundle.putString("okTxt", repo!!.labelPref.getValue(PrefKeys.BTN_GLOBAL_OK))
        }

    }

    fun replaceFragment(
            @NonNull fragment: Fragment,
            backStackName: Boolean = false,
            popStack: Boolean = false,
            @IdRes containerViewId: Int = R.id.mainContainer
    ) {
        this.fragment = fragment
        GlobalMethods.hideKeyboard(this)
        val transition = supportFragmentManager.beginTransaction()
        transition.setCustomAnimations(
                R.anim.slide_in_from_right,
                R.anim.slide_out_from_left,
                R.anim.slide_in_from_left,
                R.anim.slide_out_from_right
        )
        if (popStack)
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        if (backStackName)
            transition.addToBackStack("")

        transition.replace(containerViewId, fragment).commitAllowingStateLoss()

    }


    fun addFragment(
            @NonNull fragment: Fragment,
            backStackName: Boolean = false,
            aTAG: String = "",
            popBackStack: Boolean = false,
            @IdRes containerViewId: Int = R.id.mainContainer
    ) {
        /*supportFragmentManager
            .beginTransaction()
            .add(containerViewId, fragment)
            .commit()*/

        var transition = supportFragmentManager.beginTransaction()
        transition.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out,
                android.R.anim.fade_in,
                android.R.anim.fade_out
        )
        /*transition.setCustomAnimations(
              R.anim.slide_in_from_right,
                R.anim.slide_out_from_left,
                R.anim.slide_in_from_left,
                R.anim.slide_out_from_right
        )*/
        /*if (backStackName)
            transition.addToBackStack(aTAG)*/
        Log.e("aTAG", "aTAG==>" + aTAG)
        transition.addToBackStack(aTAG)

        if (popBackStack) {
            supportFragmentManager.popBackStack()
        }

        transition.add(containerViewId, fragment, aTAG).commitAllowingStateLoss()
    }

    fun replaceWitohutFragment(
            @NonNull fragment: Fragment,
            backStackName: Boolean = false,
            popStack: Boolean = false,
            @IdRes containerViewId: Int = R.id.mainContainer
    ) {
        GlobalMethods.hideKeyboard(this)
        val transition = supportFragmentManager.beginTransaction()
        /*transition.setCustomAnimations(
                R.anim.slide_in_from_right,
                R.anim.slide_out_from_left,
                R.anim.slide_in_from_left,
                R.anim.slide_out_from_right
        )*/
        if (popStack)
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        if (backStackName)
            transition.addToBackStack("")

        transition.replace(containerViewId, fragment).commitAllowingStateLoss()

    }

    open fun createDrawableFromView(
            context: Context,
            view: View
    ): Bitmap? {
        val displayMetrics = DisplayMetrics()
        (context as Activity).getWindowManager().getDefaultDisplay()
                .getMetrics(displayMetrics)
        view.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        )
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels)
        view.layout(
                0, 0, displayMetrics.widthPixels,
                displayMetrics.heightPixels
        )
        view.buildDrawingCache()
        val bitmap = Bitmap.createBitmap(
                view.measuredWidth,
                view.measuredHeight, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        view.draw(canvas)
        return bitmap
    }

    internal fun showBaseToast(view: View, message: String) {
        val snackBar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
        snackBar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
                .apply { maxLines = 5 }
        if (snackBar.isShown) snackBar.dismiss()
        snackBar.show()
    }
}
