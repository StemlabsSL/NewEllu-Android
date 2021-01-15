package com.stemlabs.ellu.ui.component.proximity.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ChatActionModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.proximity.adapter.NearByUserAdapter
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.findPerOf
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_proximity.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.concurrent.TimeUnit


class ProximityFragment(var fromStatus: String) : BaseFragment(), View.OnClickListener {
    val chatActionList = ArrayList<ChatActionModel>()
    val adapter = NearByUserAdapter(mutableListOf())
    val proximityDialog = ProximityBottomDialog()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_proximity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        setHeader()
        tvActivateLBL.setOnClickListener(this)

        if (fromStatus.equals("search")) {
            startAnimationView()
        }
        adapter.setChatItemPopupClickEventListener(object : NearByUserAdapter.OnSelectChatAction {
            override fun getClickAt(innerposition: Int) {
                /*if (proximityDialog != null && proximityDialog!!.isAdded()) {
                    return;
                }
                proximityDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")*/
                /* proximityDialog!!.setRedeemListener(object : AlarmNameDialog.OnClickSet {
                     override fun setClickSet(name: String) {
                     }
                 })*/
            }

        })
        rvNearByUser.adapter = adapter

    }

    var timer: CountDownTimer? = null

    private fun startAnimationView() {
        radarView.makeVisible()
        tvActivateLBL.makeGone()
        radarView.startAnimation()
        rvNearByUser.makeVisible()
        chatActionList.clear()
        chatActionList.add(ChatActionModel(R.drawable.ic_women_sample_one, "Angelina"))
        chatActionList.add(ChatActionModel(R.drawable.ic_men_sample_one, "Eric"))
        chatActionList.add(ChatActionModel(R.drawable.ic_women_sample_two, "Jane Doe"))
        adapter.updateList(chatActionList)
        timer = object : CountDownTimer(TimeUnit.MILLISECONDS.toMillis(5000), TimeUnit.SECONDS.toMillis(1)) {
            override fun onTick(millisUntilFinished: Long) {
                try {
                } catch (e: Exception) {
                }
            }

            override fun onFinish() {
                replaceFragment(ProximityMapFragment(), true,true)
            }
        }
        timer!!.start()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (timer != null) {
            timer!!.cancel()
            timer = null
        }
    }


    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Proximity"
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
            R.id.tvActivateLBL -> {
                startAnimationView()
            }
        }
    }
}