package com.stemlabs.ellu.ui.component.aboutband.fragment

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.findPerOf
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_update_band.*
import kotlinx.android.synthetic.main.fragment_update_band.timerProgressBar
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.concurrent.TimeUnit

class UpdateBandFragment(var fromStatus: String) : BaseFragment(), View.OnClickListener {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_update_band, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Link to Band"
    }

    private fun initView() {
        llBattery.setOnClickListener(this)
        tvContinueLBL.setOnClickListener(this)
        if (fromStatus.equals("Link")) {
            tvContinueLBL.text = "FORGET BAND"
            tvContinueLBL.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.cancel_meeting_bg)
            llSuccessFullConnectBandView.makeVisible()
            llUpdateBandView.makeGone()
            timerProgressBar.makeGone()
            imgTick.makeGone()
            tvContinueLBL.makeVisible()
            tvPreparingLBL.makeVisible()
            tvPreparingLBL.text = "Connected!"
        } else {
            Handler().postDelayed({
                try {
                    tvPreparingLBL.text = "Updating..."
                    timerProgressBar.makeVisible()
                    setTimerAnimation()
                } catch (e: Exception) {

                }

            }, Constants.DELAY.toLong())
        }
    }

    var timer: CountDownTimer? = null

    private fun setTimerAnimation() {
        timerProgressBar.max = 100

        timer = object : CountDownTimer(TimeUnit.MILLISECONDS.toMillis(3500), TimeUnit.SECONDS.toMillis(1)) {
            override fun onTick(millisUntilFinished: Long) {
                try {


                    val sec = millisUntilFinished / 1000
                    Log.e("Alarmsdasd", "\$asdasdsec")

                    val seconds = sec % 60
                    val minutes = sec / 60 % 60
                    val hours = sec / 3600


                    /*if (minutes > 0) {
                        Log.v("Alarm", " onTick() minutes > 0  minutes and  -> \${minutes} seconds->\${seconds}")
                        tvRemaining.text = "00:$minutes:$seconds"

//                    dialogSearchDriver!!.view?.findViewById<TextView>(R.id.)!!.let {
//                        it.text= "$minutes:$seconds"
//                    }
                        // dialogSearchDriver!!.view?.findViewById<TextView>(R.id.timer_tvRemaining)!!.text = "$minutes:$seconds"
                    } else {
                        Log.e("Alarm", " onTick() minutes < 0 seconds -> \$seconds")
                        tvRemaining.text = "00:0$minutes:0$seconds"
//                    dialogSearchDriver!!.view?.findViewById<TextView>(R.id.timer_tvRemaining)!!.let{
//                        it.text = "00:$seconds"
//                    }
                    }*/

                    //timerProgressBar.progress = ("" + TimeUnit.SECONDS.toMillis(sec)).toDouble().div(TimeUnit.MINUTES.toMillis(2)).toInt()
                    timerProgressBar.progress = TimeUnit.SECONDS.toMillis(sec).toDouble()
                            .findPerOf(TimeUnit.MILLISECONDS.toMillis(3500)).toInt()
                } catch (e: Exception) {


                }

            }

            override fun onFinish() {
                timerProgressBar.progressDrawable = ContextCompat.getDrawable(baseActivity!!, R.drawable.progress_drawable_update_band_green)
                llSuccessFullConnectBandView.makeGone()
                llUpdateBandView.makeVisible()
                imgTick.makeVisible()
                tvContinueLBL.makeVisible()
                tvPreparingLBL.makeGone()
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

    fun ProgressBar.setIndeterminateTintCompat(@ColorInt color: Int) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            val wrapDrawable = DrawableCompat.wrap(indeterminateDrawable)
            DrawableCompat.setTint(wrapDrawable, color)
            indeterminateDrawable = DrawableCompat.unwrap(wrapDrawable)
        } else {
            indeterminateTintList = ColorStateList.valueOf(color)
        }
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
            R.id.llBattery -> replaceFragment(BatteryFragment(), true)
            R.id.tvContinueLBL -> {
                if (tvContinueLBL.text.toString().equals("FORGET BAND")) {
                    baseActivity!!.onBackPressed()
                } else {
                    baseActivity!!.onBackPressed()
                    /* tvContinueLBL.text = "FORGET BAND"
                     tvContinueLBL.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.cancel_meeting_bg)
                     llSuccessFullConnectBandView.makeVisible()
                     llUpdateBandView.makeGone()
                     timerProgressBar.makeGone()
                     imgTick.makeGone()
                     tvContinueLBL.makeVisible()
                     tvPreparingLBL.makeVisible()
                     tvPreparingLBL.text = "Connected!"*/

                }
            }
        }
    }


}