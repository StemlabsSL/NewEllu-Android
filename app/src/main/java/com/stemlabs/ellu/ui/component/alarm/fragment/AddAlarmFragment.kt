package com.stemlabs.ellu.ui.component.alarm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.DayModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.alarm.adapter.AlarmDayAdapter
import com.stemlabs.ellu.ui.component.alarm.adapter.DayCircularAdapter
import com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog
import com.weigan.loopview.OnItemSelectedListener
import kotlinx.android.synthetic.main.fragment_add_alarm.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class AddAlarmFragment : BaseFragment(), View.OnClickListener {

    var title = "Add Alarm"
    var amPmList = ArrayList<String>()
    var hourList = ArrayList<String>()
    var minuteList = ArrayList<String>( )
    var dayList = ArrayList<DayModel>()
    lateinit var dayAdapter: AlarmDayAdapter
    lateinit var dayCircularAdapter: DayCircularAdapter
    var alarmNameDialog: AlarmNameDialog? = null

    var isShowCalender = true

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_alarm, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun setData() {
        amPmList.clear()
        hourList.clear()
        minuteList.clear()
        amPmList.add("AM")
        amPmList.add("PM")
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
        for (i in 1..60) {
            if (i < 10) {
                minuteList.add("0" + i)
            } else {
                minuteList.add("" + i)
            }
        }
    }

    private fun initView() {
        alarmNameDialog = AlarmNameDialog("alarm","alarm")
        arguments.let {
            if (requireArguments().containsKey("title")) {
                title = arguments?.getString("title", "Add Alarm")!!
            }
        }
        llRepeat.setOnClickListener(this)
        imgSaveAlarm.setOnClickListener(this)
        cardViewAlarmName.setOnClickListener(this)
        setRecyclearView()
        setData()
        setHeader()
        setLoop()

    }

    private fun setRecyclearView() {
        dayList.clear()
        dayList.add(DayModel("S", true))
        dayList.add(DayModel("M", true))
        dayList.add(DayModel("T", true))
        dayList.add(DayModel("W", true))
        dayList.add(DayModel("T", true))
        dayList.add(DayModel("F", false))
        dayList.add(DayModel("S", false))
        dayAdapter = AlarmDayAdapter(mutableListOf())
        dayAdapter.setDayListener(object : AlarmDayAdapter.AlarmDaySelect {
            override fun dayClickAt(position: Int) {
                /*dayList.get(position).isClicked = !dayList.get(position).isClicked
                dayAdapter.notifyDataSetChanged()
                dayCircularAdapter.notifyDataSetChanged()*/
            }
        })
        dayCircularAdapter = DayCircularAdapter(mutableListOf())
        dayCircularAdapter.setDayListener(object : DayCircularAdapter.DayCircularSelect {
            override fun dayClickAt(position: Int) {
                dayList.get(position).isClicked = !dayList.get(position).isClicked
                dayAdapter.notifyDataSetChanged()
                dayCircularAdapter.notifyDataSetChanged()
            }
        })
        dayCircularAdapter.updateList(dayList)
        dayAdapter.updateList(dayList)
        rvRepeatCalendar.adapter = dayAdapter

    }

    var amPm = ""
    var hour = ""
    var minute = ""
    private fun setLoop() {

        loopAMPM.setDividerColor(ContextCompat.getColor(baseActivity!!, R.color.colorWhite))
        loopHour.setDividerColor(ContextCompat.getColor(baseActivity!!, R.color.colorWhite))
        loopMinute.setDividerColor(ContextCompat.getColor(baseActivity!!, R.color.colorWhite))
        loopAMPM.setTypeFace(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopAMPM.setTypeFaceSelected(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopHour.setTypeFace(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopHour.setTypeFaceSelected(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopMinute.setTypeFace(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopMinute.setTypeFaceSelected(ResourcesCompat.getFont(baseActivity!!, R.font.roboto_bold))
        loopAMPM.setCenterTextColor(ContextCompat.getColor(baseActivity!!, R.color.color0073B5))
        loopHour.setCenterTextColor(ContextCompat.getColor(baseActivity!!, R.color.color0073B5))
        loopMinute.setCenterTextColor(ContextCompat.getColor(baseActivity!!, R.color.color0073B5))

        loopAMPM.setOuterTextColor(ContextCompat.getColor(baseActivity!!, R.color.colorC1C1C1))
        loopHour.setOuterTextColor(ContextCompat.getColor(baseActivity!!, R.color.colorC1C1C1))
        loopMinute.setOuterTextColor(ContextCompat.getColor(baseActivity!!, R.color.colorC1C1C1))

        loopAMPM.setItems(amPmList)
        loopHour.setItems(hourList)
        loopMinute.setItems(minuteList)


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


        loopAMPM.setItemsVisibleCount(2)
        loopHour.setItemsVisibleCount(4)
        loopMinute.setItemsVisibleCount(4)

        loopAMPM.setCurrentPosition(1)
        loopHour.setCurrentPosition(1)
        loopMinute.setCurrentPosition(1)

        amPm = amPmList[1]
        hour = hourList[1]
        minute = minuteList[1]

        loopAMPM.setAlpha(1.0f)
        loopHour.setAlpha(1.0f)
        loopMinute.setAlpha(1.0f)


        loopAMPM.setTextSize(baseActivity!!.resources.getDimension(R.dimen._20sdp),
                baseActivity!!.resources.getDimension(R.dimen._20sdp))
        loopHour.setTextSize(baseActivity!!.resources.getDimension(R.dimen._20sdp),
                baseActivity!!.resources.getDimension(R.dimen._20sdp))
        loopMinute.setTextSize(baseActivity!!.resources.getDimension(R.dimen._20sdp),
                baseActivity!!.resources.getDimension(R.dimen._20sdp))

        loopAMPM.setLineSpacingMultiplier((-4.0).toFloat())
        loopHour.setLineSpacingMultiplier((-4.0).toFloat())
        loopMinute.setLineSpacingMultiplier((-4.0).toFloat())

        loopAMPM.setNotLoop()
        loopHour.setNotLoop()
        loopMinute.setNotLoop()
    }

    private fun setHeader() {
        tvToolbarTitle.text = "" + title

        imgLeftIcon.setOnClickListener(this)
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.cardViewAlarmName -> {
                if (alarmNameDialog != null && alarmNameDialog!!.isAdded()) {
                    return;
                }
                alarmNameDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                alarmNameDialog!!.setRedeemListener(object : AlarmNameDialog.OnClickSet {
                    override fun setClickSet(name: String) {
                        tvAlarmName.text = name
                    }
                })
            }
            R.id.imgSaveAlarm -> {
                baseActivity!!.onBackPressed()
            }
            R.id.llRepeat -> {
                if (isShowCalender) {
                    isShowCalender = false
                    dayCircularAdapter.updateList(dayList)
                    rvRepeatCalendar.adapter = dayCircularAdapter
                    imgArrow.rotation = -90f

                } else {
                    isShowCalender = true
                    dayAdapter.updateList(dayList)
                    rvRepeatCalendar.adapter = dayAdapter
                    imgArrow.rotation = 90f
                }
            }
        }

    }

}