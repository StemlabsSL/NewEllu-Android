package com.stemlabs.ellu.ui.component.aboutband.fragment

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.TipsModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.aboutband.adapter.TipsAdapter
import com.stemlabs.ellu.ui.component.aboutband.adapter.TipsViewpagerAdapter
import kotlinx.android.synthetic.main.fragment_tips_detail.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class TipsDetailFragment : BaseFragment(), View.OnClickListener {


    lateinit var tipsAdapterOne: TipsViewpagerAdapter
    lateinit var tipsAdapterTwo: TipsViewpagerAdapter
    lateinit var tipsAdapterThird: TipsViewpagerAdapter
    lateinit var tipsAdapterFourth: TipsViewpagerAdapter

    var tipsListOne = ArrayList<TipsModel>()
    var tipsListTwo = ArrayList<TipsModel>()
    var tipsListThree = ArrayList<TipsModel>()
    var tipsListFour = ArrayList<TipsModel>()

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tips_detail, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Tips"
    }

    private fun initView() {
        /*tipsAdapterOne = TipsAdapter(mutableListOf())
        rvTipsDetailFirst.adapter = tipsAdapterOne
        tipsAdapterTwo = TipsAdapter(mutableListOf())
        rvTipsDetailSecond.adapter = tipsAdapterTwo
        tipsAdapterThird = TipsAdapter(mutableListOf())
        rvTipsDetailThree.adapter = tipsAdapterThird
        tipsAdapterFourth = TipsAdapter(mutableListOf())
        rvTipsDetailFour.adapter = tipsAdapterFourth*/
        updateData()
    }


    private fun updateData() {
        tipsListOne.clear()
        tipsListTwo.clear()
        tipsListThree.clear()
        tipsListFour.clear()
        tipsListOne.add(TipsModel("Send an SOS Alert",R.drawable.ic_tips_alert_one,"If you are in danger or any situation that requires help, send an SOS alert by: \n• Holding both buttons for 2 seconds"))
        tipsListOne.add(TipsModel("Send an SOS Alert",R.drawable.ic_tips_alert_two,"Once you hold both buttons for 2 seconds. you will feel a vibration and the red LED will blink."))
        tipsListOne.add(TipsModel("Respond when receiving SOS Alerts",R.drawable.ic_tips_alert_three,"When you feel a strong vibration and the LED remains blinking. enter the ellu app and respond to the SOS alert"))
        tipsListOne.add(TipsModel("End SOS Alerts",R.drawable.ic_tips_alert_four,"Once you have responded to the SOS. you can end the SOS alert by:\n• Pressing End SOS in your ellu app" ))

        tipsListTwo.add(TipsModel("Alerts",R.drawable.ic_tip_led_one,"Your band will notify you through LED blinks and vibrations every time you have alerts in your ēllu app."))
        tipsListTwo.add(TipsModel("Pager",R.drawable.ic_tip_led_two,"When you receive a pager. your band will notify you through vibrations and three green LED blinks."))
        tipsListTwo.add(TipsModel("Alarm",R.drawable.ic_tip_led_three,"You can configure alarm and timer on your ellu app. The band will notify you with a blinking white LED and vibration."))
        tipsListTwo.add(TipsModel("Customize",R.drawable.ic_tip_led_four,"Once you have responded to the SOS. you can end the SOS alert by:\n• Pressing End SOS in your ellu app" ))


        tipsListThree.add(TipsModel("Checking Battery Life",R.drawable.ic_tip_battery_one,"To check battery life: \n• Short Press any button"))
        tipsListThree.add(TipsModel("",R.drawable.ic_tip_battery_two,"Green LED\nFull Charge (80% ~ 100%)"))
        tipsListThree.add(TipsModel("",R.drawable.ic_tip_battery_three,"Yellow LED\nHalf Charge (30% ~ 70%)" ))
        tipsListThree.add(TipsModel("",R.drawable.ic_tip_battery_four,"Red LED\nLow Charge (15% ~ 30%)" ))
        tipsListThree.add(TipsModel("Low Battery Notification",R.drawable.ic_tip_battery_five,"The band will automatically notify you when your battery is below 15% charge. How? You will feel three soft vibrations and see three red LED blinks."))

        tipsListFour.add(TipsModel("Lost connection with your ēllu band",R.drawable.ic_tip_lost_connection_one,"If you get too far from your phone you may lose the connection with your band. The band will notify you by vibrations and a blinking blue LED. To re-connect: Get close to your phone"))
        setAdapter()

    }

    private fun setAdapter() {
        tipsAdapterOne =
                TipsViewpagerAdapter(baseActivity!!, tipsListOne)
        viewPagerAlert.adapter = tipsAdapterOne
        viewPagerAlert.clipChildren = false
        viewPagerAlert.currentItem =0

        tabLayoutAlert.setViewPager(viewPagerAlert)

        tipsAdapterTwo =
                TipsViewpagerAdapter(baseActivity!!, tipsListTwo)
        viewPagerLED.adapter = tipsAdapterTwo
        viewPagerLED.clipChildren = false
        viewPagerLED.currentItem =0

        tabLayoutLED.setViewPager(viewPagerLED)

        tipsAdapterThird =
                TipsViewpagerAdapter(baseActivity!!, tipsListThree)
        viewPagerBattery.adapter = tipsAdapterThird
        viewPagerBattery.clipChildren = false
        viewPagerBattery.currentItem =0
        tabLayoutBattery.setViewPager(viewPagerBattery)

        tipsAdapterFourth =
                TipsViewpagerAdapter(baseActivity!!, tipsListFour)
        viewPagerLostConnection.adapter = tipsAdapterFourth
        viewPagerLostConnection.clipChildren = false
        viewPagerLostConnection.currentItem =0
        tabLayoutLostConnection.setViewPager(viewPagerLostConnection)

       /* tipsAdapterOne.updateList(tipsListOne)
        tipsAdapterTwo.updateList(tipsListTwo)
        tipsAdapterThird.updateList(tipsListThree)
        tipsAdapterFourth.updateList(tipsListFour)*/
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
        }
    }
}