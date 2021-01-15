package com.stemlabs.ellu.ui.component.alarm.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.AlarmModel
import com.stemlabs.ellu.data.model.DayModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.alarm.adapter.AlarmAdapter
import com.stemlabs.ellu.utils.findPerOf
import kotlinx.android.synthetic.main.fragment_alarm.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList


class AlarmFragment : BaseFragment(), View.OnClickListener {

    lateinit var alarmAdapter: AlarmAdapter
    var alarmList = ArrayList<AlarmModel>()
    var dayList = ArrayList<DayModel>()
    var isAlarmView = true
    var secondList = ArrayList<String>()
    var hourList = ArrayList<String>()
    var minuteList = ArrayList<String>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alarm, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        setHeader()
        setData()
        setLoop()
        imgAddAlarm.setOnClickListener(this)
        imgTimerStop.setOnClickListener(this)
        imgTimerPlay.setOnClickListener(this)
        imgTimerPause.setOnClickListener(this)
        imgAlarm.setOnClickListener(this)
        imgTimer.setOnClickListener(this)
        setRecyclearView()
        manageView(true)

    }

    private fun setLoop() {
        loopSeconds.setDividerColor(ContextCompat.getColor(baseActivity!!, R.color.colorWhite))
        loopHours.setDividerColor(ContextCompat.getColor(baseActivity!!, R.color.colorWhite))
        loopMinutes.setDividerColor(ContextCompat.getColor(baseActivity!!, R.color.colorWhite))
        loopSeconds.setTypeFace(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_regular))
        loopSeconds.setTypeFaceSelected(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopHours.setTypeFace(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_regular))
        loopHours.setTypeFaceSelected(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopMinutes.setTypeFace(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_regular))
        loopMinutes.setTypeFaceSelected(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopSeconds.setCenterTextColor(ContextCompat.getColor(baseActivity!!, R.color.color00446C))
        loopHours.setCenterTextColor(ContextCompat.getColor(baseActivity!!, R.color.color00446C))
        loopMinutes.setCenterTextColor(ContextCompat.getColor(baseActivity!!, R.color.color00446C))

        loopSeconds.setOuterTextColor(ContextCompat.getColor(baseActivity!!, R.color.colorC1C1C1))
        loopHours.setOuterTextColor(ContextCompat.getColor(baseActivity!!, R.color.colorC1C1C1))
        loopMinutes.setOuterTextColor(ContextCompat.getColor(baseActivity!!, R.color.colorC1C1C1))

        loopSeconds.setItems(secondList)
        loopHours.setItems(hourList)
        loopMinutes.setItems(minuteList)


        /*loop_time.setListener(OnItemSelectedListener { index ->
            val date = arrayList_dates[loop_date.getSelectedItem()]
            val time = arrayList_times[index]
            if (index == 0 && loop_date.getSelectedItem() == 0) {
                txt_time.setText("Now")
            } else {
                txt_time.setText("$date at $time")
            }
        })
        loop_date.setListener(OnItemSelectedListener { index ->
            val date = arrayList_dates[index]
            val time = arrayList_times[loop_time.getSelectedItem()]
            txt_time.setText("$date at $time")
        })*/


        loopSeconds.setItemsVisibleCount(4)
        loopHours.setItemsVisibleCount(4)
        loopMinutes.setItemsVisibleCount(4)

        loopSeconds.setCurrentPosition(1)
        loopHours.setCurrentPosition(1)
        loopMinutes.setCurrentPosition(1)

        var seconds = secondList[1]
        var hour = hourList[1]
        var minute = minuteList[1]

        loopSeconds.setAlpha(1.0f)
        loopHours.setAlpha(1.0f)
        loopMinutes.setAlpha(1.0f)


        loopSeconds.setTextSize(baseActivity!!.resources.getDimension(R.dimen._20sdp),
                baseActivity!!.resources.getDimension(R.dimen._20sdp))
        loopHours.setTextSize(baseActivity!!.resources.getDimension(R.dimen._20sdp),
                baseActivity!!.resources.getDimension(R.dimen._20sdp))
        loopMinutes.setTextSize(baseActivity!!.resources.getDimension(R.dimen._20sdp),
                baseActivity!!.resources.getDimension(R.dimen._20sdp))

        loopSeconds.setLineSpacingMultiplier((-4.0).toFloat())
        loopHours.setLineSpacingMultiplier((-4.0).toFloat())
        loopMinutes.setLineSpacingMultiplier((-4.0).toFloat())

        loopSeconds.setNotLoop()
        loopHours.setNotLoop()
        loopMinutes.setNotLoop()
    }

    private fun setRecyclearView() {
        alarmAdapter = AlarmAdapter(mutableListOf())
        alarmAdapter.setAlarmClickListener(object : AlarmAdapter.OnSelectAlarm {
            override fun onSelectAlarmAt(position: Int) {
                var frag = AddAlarmFragment()
                var bundle = Bundle()
                bundle.putString("title", "Edit Alarm")
                frag.arguments = bundle
                replaceFragment(frag, true)
            }

            override fun onSelectSwitchAt(position: Int) {
                alarmList[position].isOnAlarm = !alarmList[position].isOnAlarm
                alarmAdapter.notifyDataSetChanged()
            }

            override fun onSelectDayAt(outerPosition: Int, innerPosition: Int) {

            }

            override fun onDeleteAt(position: Int) {
                alarmAdapter.removeAlarmAt(position)
            }
        })
        rvAlarm.adapter = alarmAdapter
        alarmAdapter.updateList(alarmList)
    }

    private fun setData() {
        hourList.clear()
        minuteList.clear()
        secondList.clear()
        hourList.add("01")
        hourList.add("02")
        hourList.add("03")
        hourList.add("04")
        hourList.add("05")
        hourList.add("06")
        hourList.add("07")
        hourList.add("08")
        hourList.add("09")
        hourList.add("10")
        hourList.add("11")
        hourList.add("12")
        for (i in 0..59) {
            if (i < 10) {
                minuteList.add("0" + i)
            } else {
                minuteList.add("" + i)
            }
        }
        for (i in 0..59) {
            if (i < 10) {
                secondList.add("0" + i)
            } else {
                secondList.add("" + i)
            }
        }

        dayList.clear()
        dayList.add(DayModel("S", true))
        dayList.add(DayModel("M", true))
        dayList.add(DayModel("T", true))
        dayList.add(DayModel("W", true))
        dayList.add(DayModel("T", true))
        dayList.add(DayModel("F", false))
        dayList.add(DayModel("S", false))
        alarmList.clear()
        alarmList.add(AlarmModel("Wake Up", "07:00 AM", dayList, true))
        alarmList.add(AlarmModel("Pick Dad", "09:00 PM", dayList, false))

    }

    private fun manageView(isAlarmView: Boolean) {
        if (isAlarmView) {
            imgAlarm.setImageResource(R.drawable.ic_alarm_blue)
            imgTimer.setImageResource(R.drawable.ic_timer_gray)
            llAlarmView.visibility = View.VISIBLE
            llTimerSelection.visibility = View.GONE
        } else {
            imgAlarm.setImageResource(R.drawable.ic_alarm_gray)
            imgTimer.setImageResource(R.drawable.ic_timer_blue)
            llTimerSelection.visibility = View.VISIBLE
            llAlarmView.visibility = View.GONE
        }
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Alarm"
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
            R.id.imgAlarm -> {
                manageView(true)
            }
            R.id.imgTimer -> {
                manageView(false)
            }
            R.id.imgTimerPlay -> {
                llTimeProgressing.visibility = View.VISIBLE
                llTimerSelection.visibility = View.GONE
                setTimer()
            }
            R.id.imgTimerPause -> {

            }
            R.id.imgTimerStop -> {
                llTimerSelection.visibility = View.VISIBLE
                llTimeProgressing.visibility = View.GONE
            }
            R.id.imgAddAlarm -> {
                var frag = AddAlarmFragment()
                var bundle = Bundle()
                bundle.putString("title", "Add Alarm")
                frag.arguments = bundle
                replaceFragment(frag, true)
            }
        }
    }

    var timer: CountDownTimer? = null
    public fun setTimer() {
        timerProgressBar.max = 100
        if (timer != null) {
            timer!!.cancel()
            timer = null
        }
        timer = object : CountDownTimer(TimeUnit.MINUTES.toMillis(2), TimeUnit.SECONDS.toMillis(1)) {
            override fun onTick(millisUntilFinished: Long) {
                try {


                    val sec = millisUntilFinished / 1000
                    Log.e("Alarmsdasd", "\$asdasdsec")

                    val seconds = sec % 60
                    val minutes = sec / 60 % 60
                    val hours = sec / 3600


                    if (minutes > 9) {
                        Log.v("Alarm", " onTick() minutes > 0  minutes and  -> \${minutes} seconds->\${seconds}")
                        if (seconds < 10) {
                            tvRemaining.text = "00 : $minutes : 0$seconds"
                        } else {
                            tvRemaining.text = "00 : $minutes : $seconds"
                        }

//                    dialogSearchDriver!!.view?.findViewById<TextView>(R.id.)!!.let {
//                        it.text= "$minutes:$seconds"
//                    }
                        // dialogSearchDriver!!.view?.findViewById<TextView>(R.id.timer_tvRemaining)!!.text = "$minutes:$seconds"
                    } else {
                        Log.e("Alarm", " onTick() minutes < 0 seconds -> \$seconds")
                        if (seconds < 10) {
                            tvRemaining.text = "00 : 0$minutes : 0$seconds"
                        } else {
                            tvRemaining.text = "00 : 0$minutes : $seconds"
                        }

//                    dialogSearchDriver!!.view?.findViewById<TextView>(R.id.timer_tvRemaining)!!.let{
//                        it.text = "00:$seconds"
//                    }
                    }

                    //timerProgressBar.progress = ("" + TimeUnit.SECONDS.toMillis(sec)).toDouble().div(TimeUnit.MINUTES.toMillis(2)).toInt()
                    timerProgressBar.progress = TimeUnit.SECONDS.toMillis(sec).toDouble()
                            .findPerOf(TimeUnit.MINUTES.toMillis(2)).toInt()
                } catch (e: Exception) {

                }

            }

            override fun onFinish() {}

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
}