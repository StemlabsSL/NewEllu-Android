package com.stemlabs.ellu.ui.component.chat.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.DialogFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.stemlabs.ellu.R
import com.stemlabs.ellu.utils.GPSTracker
import kotlinx.android.synthetic.main.fragment_share_location.*
import kotlinx.android.synthetic.main.fragment_share_location.view.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import kotlinx.android.synthetic.main.noraml_toolbar.view.*
import java.util.*


class ShareLocationDialog : DialogFragment() , GoogleMap.OnMarkerClickListener {

    lateinit var viewShareLocation: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.window!!.setGravity(Gravity.CENTER)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewShareLocation = inflater.inflate(R.layout.fragment_share_location, container, false)
        initView()
        return viewShareLocation
    }

    private fun initView() {
        gpsTracker1 = GPSTracker(context!!)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
        viewShareLocation.tvToolbarTitle.text = "Send Location"
        viewShareLocation.imgLeftIcon.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
        })
        viewShareLocation.tvSendLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()

        })
        viewShareLocation.llShareCurrentLocation.setOnClickListener(View.OnClickListener {
            viewShareLocation.rbShareLiveLocation.isChecked = false
            viewShareLocation.rbShareCurrentLocation.isChecked = true
        })
        viewShareLocation.rbShareCurrentLocation.setOnClickListener(View.OnClickListener {
            viewShareLocation.rbShareLiveLocation.isChecked = false
            viewShareLocation.rbShareCurrentLocation.isChecked = true
        })
        viewShareLocation.llShareLiveLocation.setOnClickListener(View.OnClickListener {
            viewShareLocation.rbShareLiveLocation.isChecked = true
            viewShareLocation.rbShareCurrentLocation.isChecked = false
        })
        viewShareLocation.rbShareLiveLocation.setOnClickListener(View.OnClickListener {
            viewShareLocation.rbShareLiveLocation.isChecked = true
            viewShareLocation.rbShareCurrentLocation.isChecked = false
        })

        viewShareLocation.imgMinus.setOnClickListener(View.OnClickListener {

        })
        viewShareLocation.imgPlus.setOnClickListener(View.OnClickListener {

        })



    }

    override fun onMarkerClick(p0: Marker?): Boolean {
        return true
    }


    private lateinit var googleMap: GoogleMap
    lateinit var gpsTracker1: GPSTracker
    lateinit var l1: LatLng
    lateinit var l2: LatLng

    private val callback = OnMapReadyCallback { googleMap ->
        this.googleMap = googleMap
        this.googleMap.setOnMarkerClickListener(this)
        animateCamera()
        addMarker()
    }

    private fun addMarker() {
        val PATTERN_DASH_LENGTH_PX = 20
        val PATTERN_GAP_LENGTH_PX = 20
        val DOT: PatternItem = Dot()
        val DASH: PatternItem = Dash(PATTERN_DASH_LENGTH_PX.toFloat())
        val GAP: PatternItem = Gap(PATTERN_GAP_LENGTH_PX.toFloat())
        val PATTERN_POLYGON_ALPHA: List<PatternItem> = Arrays.asList(GAP, DASH)

        val viewMarker: View =
                (context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker, null)

        val bmp: Bitmap = createDrawableFromView(context!!, viewMarker)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .position(l1)
        )

        /*val l2 = LatLng(23.043014189583463, 72.56414375699677)
        val viewMarker2: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_flag, null)

        val bmp2: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker2)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp2))
                        .position(l2)
        )

        val points = ArrayList<LatLng>()
        val polyLineOptions = PolylineOptions()
        points.add(l1)
        points.add(l2)
        polyLineOptions.width(7f)
        polyLineOptions.geodesic(true)
        polyLineOptions.pattern(PATTERN_POLYGON_ALPHA);
        polyLineOptions.color(baseActivity?.resources?.getColor(R.color.colorE69926)!!)
        polyLineOptions.addAll(points)
        val polyline: Polyline = googleMap.addPolyline(polyLineOptions)
        polyline.setGeodesic(true)*/


    }

    private fun animateCamera() {
        if (gpsTracker1 != null && googleMap != null) {

//            l1 = LatLng(gpsTracker1.latitude, gpsTracker1.longitude)
            l1 = LatLng(23.036892917287165, 72.56178341308778)


            googleMap.moveCamera(CameraUpdateFactory.newLatLng(l1))


            val cameraPosition =
                    CameraPosition.Builder().target(l1).zoom(15f).build()
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        }
    }





    lateinit var listener: OnClickShareLocation
    public fun setShareLocationListener(listener: OnClickShareLocation) {
        this.listener = listener
    }


    public interface OnClickShareLocation {
        public fun setOKOnClickOnClickShareLocation()
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
}