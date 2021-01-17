package com.stemlabs.ellu.ui.component.sos

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
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
import com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog
import com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog
import com.stemlabs.ellu.utils.GPSTracker
import kotlinx.android.synthetic.main.fragment_aware.*
import kotlinx.android.synthetic.main.fragment_sos_send.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.*
import kotlin.collections.ArrayList


class SosSendFragment : BaseFragment(), GoogleMap.OnMarkerClickListener {

    private lateinit var googleMap: GoogleMap
    lateinit var gpsTracker1: GPSTracker
    lateinit var l1: LatLng
    lateinit var l2: LatLng
    lateinit var l3: LatLng
    lateinit var l4: LatLng
    var sosEndDialog: SosEndOverlayDialog? = null

    private val callback = OnMapReadyCallback { googleMap ->


        this.googleMap = googleMap
        this.googleMap.setOnMarkerClickListener(this)
        animateCamera()
        addMarker()
    }

    private fun animateCamera() {
        if (gpsTracker1 != null && googleMap != null) {

//            l1 = LatLng(gpsTracker1.latitude, gpsTracker1.longitude)
            l1 = LatLng(23.036892917287165, 72.56178341308778)


            googleMap.moveCamera(CameraUpdateFactory.newLatLng(l1))


            val cameraPosition =
                    CameraPosition.Builder().target(l1).zoom(12f).build()
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        }
    }

    private fun addMarker() {


        l4 = LatLng(23.02950752812897, 72.53599129122253)
        val viewMarker: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_sos, null)

        val bmp: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .position(l1)
        )
        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .position(l4)
        )


        l2 = LatLng(23.043014189583463, 72.56414375699677)
        l3 = LatLng(23.033141032190084, 72.54959545538505)

        val viewMarker2: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_sos2, null)

        val bmp2: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker2)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp2))
                        .position(l2)
        )
//        googleMap.addMarker(
//                MarkerOptions()
//                        .icon(BitmapDescriptorFactory.fromBitmap(bmp2))
//                        .position(l3)
//        )


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sos_send, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gpsTracker1 = GPSTracker(baseActivity)
        initView()
        mapInitialization()
    }

    //map initialization
    private fun mapInitialization() {
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)

    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    private fun initView() {

        sosEndDialog = SosEndOverlayDialog()

        ivClose.setOnClickListener(View.OnClickListener {
            baseActivity?.onBackPressed()
        })

        tvSendLBL.setOnClickListener(View.OnClickListener {
            if (sosEndDialog != null && sosEndDialog!!.isAdded()) {
                return@OnClickListener;
            }
            sosEndDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        })

    }

    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }

    public interface OnClickChatPopUp {
        public fun setClickPopUp()
    }

    override fun onMarkerClick(p0: Marker?): Boolean {

        return true
    }
}