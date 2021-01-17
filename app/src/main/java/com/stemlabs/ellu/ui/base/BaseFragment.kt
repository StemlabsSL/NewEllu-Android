package com.stemlabs.ellu.ui.base


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.IdRes
import androidx.annotation.NonNull
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.github.ybq.android.spinkit.style.WanderingCubes
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.listeners.BaseView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment : Fragment(), BaseView {

    protected abstract fun initializeViewModel()
    abstract fun observeViewModel()


    var baseActivity: BaseActivity? = null

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseActivity = activity as BaseActivity
        initializeViewModel()
        observeViewModel()
    }

    fun handleShowMessage(message: String) {
        baseActivity!!.showMessageDialog(message)
    }

    fun replaceFragment(
            @NonNull fragment: Fragment,
            backStackName: Boolean = false,
            popStack: Boolean = false,
            @IdRes containerViewId: Int = R.id.mainContainer
    ) {

        baseActivity!!.replaceFragment(fragment, backStackName, popStack, containerViewId)
    }

    fun replaceWitohutFragment(
            @NonNull fragment: Fragment,
            backStackName: Boolean = false,
            popStack: Boolean = false,
            @IdRes containerViewId: Int = R.id.mainContainer
    ) {
        baseActivity!!.replaceWitohutFragment(fragment, backStackName, popStack, containerViewId)
    }

    fun placeMarkerOnMapWithSize(
            mMap: GoogleMap,
            location: LatLng,
            markerImg: Int,
            markerHeight: Int,
            markerWidth: Int
    ): Marker {

        val bitmapdraw = ContextCompat.getDrawable(baseActivity!!, markerImg) as BitmapDrawable
        val b = bitmapdraw.bitmap
        val smallMarker = Bitmap.createScaledBitmap(b, markerWidth, markerHeight, false)
        val markerOptions =
                MarkerOptions().position(location).icon(BitmapDescriptorFactory.fromBitmap(smallMarker))
        val marker = mMap.addMarker(markerOptions)
        //val titleStr = getAddress(location)  // add these two lines
        markerOptions.title("")
        mMap.addMarker(markerOptions)
        return marker
    }

    fun clearBackStack() {
        val manager = baseActivity!!.supportFragmentManager
        Log.e("TAG", "Fragment Count-> " + manager.backStackEntryCount)
        if (manager.backStackEntryCount > 0) {
            val first = manager.getBackStackEntryAt(0)
            manager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    fun shareKit(context: Context, shareBodyText: String, subject: String, SharingOption: String) {
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.type = "text/plain"
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText)
        context.startActivity(Intent.createChooser(sharingIntent, SharingOption))
    }

    fun addFragment(
            @NonNull fragment: Fragment,
            backStackName: Boolean = false,
            aTAG: String = "",
            popBackstack: Boolean = false,
            @IdRes containerViewId: Int = R.id.mainContainer

    ) {
        baseActivity!!.addFragment(fragment, backStackName, aTAG, popBackstack, containerViewId)
    }

    private lateinit var mAlertDialog: AlertDialog

    @SuppressLint("InflateParams")
    fun showBaseProgressDialog(context: Context, message: String) {
        val mAlertDialogBuilder = AlertDialog.Builder(context)
        mAlertDialogBuilder.setCancelable(false)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.view_progress_dialog, null)
        view.findViewById<ProgressBar>(R.id.progressBarPB).apply {
            indeterminateDrawable = WanderingCubes()
        }
        view.findViewById<TextView>(R.id.progressMessageTV).apply {
            text = message
        }
        mAlertDialogBuilder.setView(view)
        if (this::mAlertDialog.isInitialized && mAlertDialog.isShowing) {
            mAlertDialog.dismiss()
        }

        mAlertDialog = mAlertDialogBuilder.create()
        mAlertDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        mAlertDialog.show()

        val layoutParams = WindowManager.LayoutParams()
        val window = mAlertDialog.window
        window!!.setGravity(Gravity.CENTER)
        layoutParams.copyFrom(window.attributes)
        // show dialog on full screen
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT
        layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT
        window.attributes = layoutParams
    }

    fun hideBaseProgressDialog() {
        if (this::mAlertDialog.isInitialized && mAlertDialog.isShowing) {
            mAlertDialog.dismiss()
        }
    }

    internal fun showBaseToast(view: View, message: String) {
        val snackBar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
        snackBar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
                .apply { maxLines = 5 }
        if (snackBar.isShown) snackBar.dismiss()
        snackBar.show()
    }

}
