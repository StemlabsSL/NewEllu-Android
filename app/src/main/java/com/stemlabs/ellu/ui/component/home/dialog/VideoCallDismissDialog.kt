package com.stemlabs.ellu.ui.component.home.dialog

import android.app.Dialog
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.stemlabs.ellu.R
import kotlinx.android.synthetic.main.dialog_video_call.view.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.concurrent.TimeUnit


class VideoCallDismissDialog : DialogFragment() {

    lateinit var viewVideoCallDismiss: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheetTransparent)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window!!.setGravity(Gravity.TOP)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewVideoCallDismiss = inflater.inflate(R.layout.dialog_video_call, container, false)
        initView()
        return viewVideoCallDismiss
    }

    private fun initView() {

        startCounter()
        viewVideoCallDismiss.tvEndCallLBL.setOnClickListener(View.OnClickListener {
            if (timer != null) {
                timer!!.cancel()
                timer == null
            }
            dialog!!.dismiss()
        })

    }


    override fun onDestroyView() {
        if (timer != null) {
            timer!!.cancel()
            timer == null
        }
        super.onDestroyView()

    }
    var timer: CountDownTimer? = null
    private fun startCounter() {
        timer = object : CountDownTimer(TimeUnit.MILLISECONDS.toMillis(5000), TimeUnit.SECONDS.toMillis(1)) {
            override fun onTick(millisUntilFinished: Long) {
                try {


                } catch (e: Exception) {


                }

            }

            override fun onFinish() {
                if (timer != null) {
                    timer!!.cancel()
                    timer == null
                }
                if (dialog != null) {
                    if (dialog!!.isShowing) {
                        dialog!!.dismiss()
                    }
                }

            }

        }
        timer!!.start()
    }

}