package com.stemlabs.ellu.ui.component.chat.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_video_call.*


class VideoCallFragment(var statusFrom: String = "call") : BaseFragment(), View.OnClickListener {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video_call, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imgLeftIcon.setOnClickListener(this)
        if (statusFrom.equals("video")) {
            imgVideoCallUser.makeVisible()
        } else {
            imgVideoCallUser.makeGone()
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                sendBroadcastForVideo()
                baseActivity!!.onBackPressed()
            }
        }
    }

    private fun sendBroadcastForVideo() {
        Log.d("sender", "Broadcasting message")
        var intent = Intent("video")
        intent.putExtra("message", "video")
        LocalBroadcastManager.getInstance(baseActivity!!).sendBroadcast(intent)
    }

    override fun onDestroyView() {
        sendBroadcastForVideo()
        super.onDestroyView()
    }

}