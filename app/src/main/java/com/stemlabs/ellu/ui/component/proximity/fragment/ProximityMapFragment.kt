package com.stemlabs.ellu.ui.component.proximity.fragment

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
import com.stemlabs.ellu.data.model.ProximityUserModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog
import com.stemlabs.ellu.ui.component.chat.fragment.IndividualChatFragment
import com.stemlabs.ellu.ui.component.chat.fragment.PagerFragment
import com.stemlabs.ellu.ui.component.chat.fragment.VideoCallFragment
import com.stemlabs.ellu.ui.component.proximity.adapter.ProximityUserAdapter
import com.stemlabs.ellu.utils.GPSTracker
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_proximity_map.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.*
import kotlin.collections.ArrayList


class ProximityMapFragment : BaseFragment(), View.OnClickListener, GoogleMap.OnMarkerClickListener {

    private lateinit var googleMap: GoogleMap
    lateinit var gpsTracker1: GPSTracker
    lateinit var l1: LatLng
    lateinit var l2: LatLng
    lateinit var l3: LatLng
    lateinit var l4: LatLng
    lateinit var proximityAdapter: ProximityUserAdapter
    lateinit var proximityRingAdapter: ProximityUserAdapter
    var proximityUserList = ArrayList<ProximityUserModel>()
    var pagerDialog: PagerDialog? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_proximity_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        setHeader()
        initView()
    }

    private fun setData() {
        proximityUserList.clear()
        proximityUserList.add(ProximityUserModel(R.drawable.ic_men_sample_one))
        proximityUserList.add(ProximityUserModel(R.drawable.ic_women_sample_two))
        proximityUserList.add(ProximityUserModel(R.drawable.ic_men_sample_two))
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Proximity"
    }

    private fun initView() {
        pagerDialog = PagerDialog()

        gpsTracker1 = GPSTracker(baseActivity)
        tvEndProximity.setOnClickListener(this)
        imgPhone.setOnClickListener(this)
        imgVideo.setOnClickListener(this)
        imgNotification.setOnClickListener(this)
        imgChat.setOnClickListener(this)
        mapInitialization()
        setRecyclearView()
    }

    private fun setRecyclearView() {
        proximityAdapter = ProximityUserAdapter(mutableListOf(), false)
        proximityAdapter.setClickEventListener(object : ProximityUserAdapter.OnClickEvent {
            override fun getClickAt(position: Int) {
                tvProximityUsername.makeVisible()
                tvGroupName.makeGone()
                rvGroup.makeGone()
                rvBottomProximityMapUser.makeVisible()
                llUserInfoAndAction.makeVisible()
                if (proximityUserList.size > 0) {
                    for (i in proximityUserList.indices) {
                        if (position == i) {
                            if (!proximityUserList.get(position).isClicked) {
                                proximityUserList.get(position).isClicked = true
                            } else {
                                proximityUserList.get(position).isClicked = false
                            }
                        } else {
                            proximityUserList.get(i).isClicked = false
                        }
                    }
                    proximityAdapter.notifyDataSetChanged()
                    proximityRingAdapter.notifyDataSetChanged()
                    setPolyline()
                }
            }
        })
        rvGroup.adapter = proximityAdapter

        proximityRingAdapter = ProximityUserAdapter(mutableListOf(), true)
        proximityRingAdapter.setClickEventListener(object : ProximityUserAdapter.OnClickEvent {
            override fun getClickAt(position: Int) {
                if (proximityUserList.size > 0) {
                    for (i in proximityUserList.indices) {
                        if (position == i) {
                            if (!proximityUserList.get(position).isClicked) {
                                proximityUserList.get(position).isClicked = true
                            } else {
                                proximityUserList.get(position).isClicked = false
                            }
                        } else {
                            proximityUserList.get(i).isClicked = false
                        }
                    }
                    proximityAdapter.notifyDataSetChanged()
                    proximityRingAdapter.notifyDataSetChanged()
                    setPolyline()
                }
            }
        })
        rvBottomProximityMapUser.adapter = proximityRingAdapter
        proximityAdapter.updateList(proximityUserList)
        proximityRingAdapter.updateList(proximityUserList)
    }

    private fun setPolyline() {
        val PATTERN_DASH_LENGTH_PX = 5
        val PATTERN_GAP_LENGTH_PX = 5
        val DOT: PatternItem = Dot()
        //val DASH: PatternItem = Dash(PATTERN_DASH_LENGTH_PX.toFloat())
        val GAP: PatternItem = Gap(PATTERN_GAP_LENGTH_PX.toFloat())
        val PATTERN_POLYGON_ALPHA: List<PatternItem> = Arrays.asList(GAP, DOT)


        googleMap.clear()
        l3 = LatLng(23.033141032190084, 72.54959545538505)

        val viewMarker3: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_proximity_three, null)

        val bmp3: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker3)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp3))
                        .position(l3)
        )

        l4 = LatLng(23.02950752812897, 72.53599129122253)
        val viewMarker: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_proximity_four, null)

        val bmp: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker)!!


        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .position(l4)
        )

        val cameraPosition =
                CameraPosition.Builder().target(l3).zoom(15f).build()
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))

        val points = ArrayList<LatLng>()
        val polyLineOptions = PolylineOptions()
        points.add(l3)
        points.add(l4)
        polyLineOptions.width(7f)
        polyLineOptions.geodesic(true)
        polyLineOptions.pattern(PATTERN_POLYGON_ALPHA);
        polyLineOptions.color(baseActivity?.resources?.getColor(R.color.color7BB4D3)!!)
        polyLineOptions.addAll(points)
        val polyline: Polyline = googleMap.addPolyline(polyLineOptions)
        polyline.setGeodesic(true)
    }

    private fun mapInitialization() {
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

    private val callback = OnMapReadyCallback { googleMap ->
        this.googleMap = googleMap
        this.googleMap.setOnMarkerClickListener(this)
        animateCamera()
        addMarker()
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    private fun animateCamera() {
        if (gpsTracker1 != null && googleMap != null) {

//            l1 = LatLng(gpsTracker1.latitude, gpsTracker1.longitude)
            l1 = LatLng(23.036291090934908, 72.590748954472978)

            googleMap.moveCamera(CameraUpdateFactory.newLatLng(l1))


            val cameraPosition =
                    CameraPosition.Builder().target(l1).zoom(12f).build()
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        }
    }

    private fun addMarker() {
        googleMap.clear()

        l1 = LatLng(23.036291090934908, 72.590748954472978)

        val viewMarker1: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_proximity_one, null)

        val bmp1: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker1)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp1))
                        .position(l1)
        )

        l2 = LatLng(23.04301418765, 72.564143755432)

        val viewMarker2: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_proximity_two, null)

        val bmp2: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker2)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp2))
                        .position(l2)
        )


        l3 = LatLng(23.033141032190084, 72.54959545538505)


        val viewMarker3: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_proximity_three, null)

        val bmp3: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker3)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp3))
                        .position(l3)
        )

        l4 = LatLng(23.02950752812897, 72.53599129122253)
        val viewMarker: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_proximity_four, null)

        val bmp: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker)!!


        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .position(l4)
        )


    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }

            R.id.tvEndProximity -> {
                baseActivity!!.onBackPressed()
            }
            R.id.imgPhone -> {
                replaceFragment(VideoCallFragment(), true)
            }
            R.id.imgVideo -> {
                replaceFragment(VideoCallFragment("video"), true)
            }
            R.id.imgChat -> {
                replaceFragment(IndividualChatFragment("Individual Chat"), true)
            }
            R.id.imgNotification -> {
                addFragment(PagerFragment(), true)

                /* if (pagerDialog != null && pagerDialog!!.isAdded()) {
                        return;
                    }
                    pagerDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                    pagerDialog!!.setChatPopUpListener(object : PagerDialog.OnClickChatPopUp {
                        override fun setClickPopUp() {

                        }
                    })*/
            }
        }
    }

    override fun onMarkerClick(p0: Marker?): Boolean {
        return true
    }

}