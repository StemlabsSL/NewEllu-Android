package com.stemlabs.ellu.ui.component.aware.fragment

import android.content.Context
import android.graphics.Bitmap
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.aware.adapter.AwareSearchLocationAdapter
import com.stemlabs.ellu.ui.component.aware.adapter.AwareSelectLocationAdapter
import com.stemlabs.ellu.ui.component.aware.model.SelectLocation
import com.stemlabs.ellu.utils.GPSTracker

import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.fragment_aware.*
import kotlinx.android.synthetic.main.fragment_aware_select_a_place.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.*
import kotlin.collections.ArrayList


class AwareSelectAPlaceFragment(var from: String) : BaseFragment(), MyOnItemClickListener, GoogleMap.OnMarkerClickListener {


    private lateinit var adapter: AwareSelectLocationAdapter
    private lateinit var adapterSearch: AwareSearchLocationAdapter
    private var list = ArrayList<SelectLocation>()
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
        val PATTERN_DASH_LENGTH_PX = 15
        val PATTERN_GAP_LENGTH_PX = 3
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

        val l2 = LatLng(23.043014189583463, 72.56414375699677)
        val viewMarker2: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.custom_marker_flag, null)

        val bmp2: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker2)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp2))
                        .position(l2)
        )

        val l3 = LatLng(23.043014189575354, 72.56414374759935)
        val viewMarker3: View =
                (baseActivity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                        .inflate(R.layout.walk_person_marker_flag, null)

        val bmp3: Bitmap = baseActivity?.createDrawableFromView(baseActivity!!, viewMarker3)!!

        googleMap.addMarker(
                MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp3))
                        .position(l3)
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
        polyline.setGeodesic(true)


    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_aware_select_a_place, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gpsTracker1 = GPSTracker(baseActivity)
        initView()
        setAdapter()
        mapInitialization()
    }

    //map initialization
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

    private fun initView() {
        tvToolbarTitle.text = "Aware"
        imgLeftIcon.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })


        if (from.equals("Tracking")) {
            llProgress.visibility = View.VISIBLE
            llSendAware.visibility = View.GONE
            rlMap.visibility = View.VISIBLE
            rvSelectLocation.visibility = View.GONE
            cvSearch.visibility = View.GONE
            llSearch.visibility = View.GONE
        }

        if (from.equals("meet", true)) {
            tvToolbarTitle.text = "Lets Meet"
        }

        llSearch.setOnClickListener(View.OnClickListener {

            if (!rvSelectLocation.isVisible) {
                rvSelectLocation.visibility = View.GONE
                cvSearch.visibility = View.VISIBLE
                llSendAware.visibility = View.VISIBLE
                rlMap.visibility = View.VISIBLE
            }

        })

        edtSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })

        edtSearch.setOnFocusChangeListener(View.OnFocusChangeListener { view, b ->
            if (b) {
                llSearch.callOnClick()
            } else {

            }
        })
        tvSendAwareLBL.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    private fun setAdapter() {
        rvSelectLocation.layoutManager = LinearLayoutManager(context)
        var list = ArrayList<SelectLocation>()

        list.add(SelectLocation("La Farine Bakery", "Shop # 02, Kings Road", "2.5 miles"))
        list.add(SelectLocation("Meat The Cheese", "Street # 05, Max Apartments", "2.5 miles"))
        list.add(SelectLocation("Delfrio", "First Floor, Kazma Mall", "1.2 miles"))
        list.add(SelectLocation("Lettuce Meat", "Boulevard", "3 miles"))
        list.add(SelectLocation("Burger King", "Street # 02, Jacob Avenue", "2 miles"))
        list.add(SelectLocation("McDonalds", "Street # 02, Jacob Avenue", "2 miles"))
        list.add(SelectLocation("KFC", "Street # 02, Jacob Avenue", "2 miles"))
        list.add(SelectLocation("Hardees", "Street # 02, Jacob Avenue", "2 miles"))

        adapter = AwareSelectLocationAdapter(list, requireContext(), this, rvSelectLocation)
        rvSelectLocation.adapter = adapter



        rvSearchLocation.layoutManager = LinearLayoutManager(context)
        var list2 = ArrayList<SelectLocation>()

        list2.add(SelectLocation("La Farine Bakery", "Shop # 02, Kings Road", "2.5 miles"))
        list2.add(SelectLocation("La Farine Bakery", "Shop # 02, Kings Road", "2.5 miles"))
        list2.add(SelectLocation("La Farine Bakery", "Shop # 02, Kings Road", "2.5 miles"))


        adapterSearch = AwareSearchLocationAdapter(list2, requireContext(), this, rvSearchLocation)
        rvSearchLocation.adapter = adapterSearch
    }

    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }


    public interface OnClickChatPopUp {
        public fun setClickPopUp()
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

        if (view == rvSelectLocation) {
            if (from.equals("meet", true)) {
                baseActivity!!.onBackPressed()
            } else {
                rvSelectLocation.visibility = View.GONE
                llSendAware.visibility = View.VISIBLE
                rlMap.visibility = View.VISIBLE
            }
        } else if (view == rvSearchLocation) {
            rvSelectLocation.visibility = View.GONE
        }

    }


    override fun onMarkerClick(p0: Marker?): Boolean {
        return true
    }
}