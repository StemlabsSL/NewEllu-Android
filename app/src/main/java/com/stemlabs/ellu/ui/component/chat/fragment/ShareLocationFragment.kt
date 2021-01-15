package com.stemlabs.ellu.ui.component.chat.fragment

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.utils.GPSTracker
import kotlinx.android.synthetic.main.fragment_share_location.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.*
import kotlin.collections.ArrayList


class ShareLocationFragment : BaseFragment(), View.OnClickListener, GoogleMap.OnMarkerClickListener {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_share_location, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gpsTracker1 = GPSTracker(baseActivity)
        setHeader()
        mapInitialization()

    }

    private fun setHeader() {
        tvToolbarTitle.text = "Send Location"
        imgLeftIcon.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
        tvSendLBL.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
        llShareCurrentLocation.setOnClickListener(View.OnClickListener {
            rbShareLiveLocation.isChecked = false
            rbShareCurrentLocation.isChecked = true
        })
        rbShareCurrentLocation.setOnClickListener(View.OnClickListener {
            rbShareLiveLocation.isChecked = false
            rbShareCurrentLocation.isChecked = true
        })
        llShareLiveLocation.setOnClickListener(View.OnClickListener {
            rbShareLiveLocation.isChecked = true
            rbShareCurrentLocation.isChecked = false
        })
        rbShareLiveLocation.setOnClickListener(View.OnClickListener {
            rbShareLiveLocation.isChecked = true
            rbShareCurrentLocation.isChecked = false
        })

        imgMinus.setOnClickListener(View.OnClickListener {

        })
        imgPlus.setOnClickListener(View.OnClickListener {

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
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker, null)

        val bmp: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker)!!

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

    private fun mapInitialization() {
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)

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

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}