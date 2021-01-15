package com.stemlabs.ellu.ui.component.home

import android.app.KeyguardManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.an.biometric.BiometricCallback
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseActivity
import com.stemlabs.ellu.ui.component.aboutband.fragment.AboutBandFragment
import com.stemlabs.ellu.ui.component.alarm.fragment.AlarmFragment
import com.stemlabs.ellu.ui.component.alert.fragment.AlertFragment
import com.stemlabs.ellu.ui.component.calendar.fragment.CalendarFragment
import com.stemlabs.ellu.ui.component.chat.dialog.PagerDialog
import com.stemlabs.ellu.ui.component.chat.fragment.IndividualChatFragment
import com.stemlabs.ellu.ui.component.home.dialog.TutorialDialog
import com.stemlabs.ellu.ui.component.home.dialog.VideoCallDismissDialog
import com.stemlabs.ellu.ui.component.loginflow.LoginFlowActivity
import com.stemlabs.ellu.ui.component.profile.fragment.ProfileFragment
import com.stemlabs.ellu.ui.component.settings.fragment.SettingsFragment
import com.stemlabs.ellu.utils.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_link.*
import kotlinx.android.synthetic.main.item_navigation_menu.*
import java.util.*
import java.util.concurrent.TimeUnit

class HomeActivity : BaseActivity(), View.OnClickListener, BiometricCallback {
    var oldView: View? = null
    var tutorialdialog: TutorialDialog? = null
    var videoCallDialog: VideoCallDismissDialog? = null
    lateinit var mBiometricManager: com.an.biometric.BiometricManager

    var authIntent: Intent? = null

    val keyguardManager: KeyguardManager? = null

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun initViewBinding() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setBottomVisibility()
        //curvedBottomNavigationView.inflateMenu(R.menu.bottom_menu);
        LocalBroadcastManager.getInstance(this).registerReceiver(
                mMessageReceiver,
                IntentFilter("video")
        )
        manageBottomView("chat")
        tutorialdialog = TutorialDialog()
        oldView = imgChatBottomSelected
        llCallBottom.setOnClickListener(this)
        llAlertBottom.setOnClickListener(this)
        llChatBottom.setOnClickListener(this)
        llCalendarBottom.setOnClickListener(this)
        llWatchBottom.setOnClickListener(this)
        tvSettingsPrivacy.setOnClickListener(this)
        llSideMenuEClick.setOnClickListener(this)
        llTutorial.setOnClickListener(this)
        imgSideMenuUserProfile.setOnClickListener(this)
        imgLogout.setOnClickListener(this)
        /*bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_call))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_siren))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_chat))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ic_calendar))
        bottomNavigation.add(MeowBottomNavigation.Model(5, R.drawable.ic_watch))
        bottomNavigation.setOnClickMenuListener {
            // your codes
            when(it.id){
                1->{
                    replaceFragment(CallLogFragment())
                }
                2->{
                    replaceFragment(SettingsFragment())
                }
                3->{
                    replaceFragment(Main())
                }
                4->{

                }
                5->{
                    replaceFragment(AboutBandFragment())
                }
            }
        }

        bottomNavigation.setOnShowListener {
            // your codes
        }

        bottomNavigation.setOnReselectListener {
            // your codes
        }

        bottomNavigation.show(3, false)*/
        //replaceFragment(AboutBandFragment())
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.llCallBottom -> {
                translate(oldView!!, imgCallBottomSelected)
                manageBottomView("call")
            }
            R.id.llAlertBottom -> {
                translate(oldView!!, imgSirenBottomSelected)
                manageBottomView("alert")
            }
            R.id.llChatBottom -> {
                translate(oldView!!, imgChatBottomSelected)
                manageBottomView("chat")
            }
            R.id.llCalendarBottom -> {
                translate(oldView!!, imgCalendarBottomSelected)
                manageBottomView("calendar")
            }
            R.id.llWatchBottom -> {
                translate(oldView!!, imgWatchBottomSelected)
                manageBottomView("watch")
            }
            R.id.tvSettingsPrivacy -> {
                drawerClose()
                replaceFragment(SettingsFragment(), true)
            }
            R.id.llSideMenuEClick -> {
                drawerClose()
                replaceFragment(AlarmFragment(), true)
            }
            R.id.imgSideMenuUserProfile -> {
                drawerClose()
                replaceFragment(ProfileFragment(), true)
            }
            R.id.llTutorial -> {
                drawerClose()
                if (tutorialdialog != null || tutorialdialog!!.isAdded) {
                    //   return;
                }
                replaceFragment(CallLogFragment(), false, false)
                tutorialdialog!!.show(supportFragmentManager, "Dialog Fragment")

                tutorialdialog!!.setTutorialClickListener(object : TutorialDialog.OnClickTutorial {

                    override fun setClickOnNext(currentCount: Int) {
                        if (currentCount == 18)
                            manageBottomView("chat")
                    }

                    override fun setClickOnSkip(currentCount: Int) {
                        //if (currentCount == 18)
                        manageBottomView("chat")
                    }
                })
            }
            R.id.imgLogout -> {
                drawerClose()
                SharedPref.getInstance(this).clearAllPreferences()
                val nextScreenIntent = Intent(this@HomeActivity, LoginFlowActivity::class.java)
                startActivity(nextScreenIntent)
                finish()
            }
        }
    }

    private fun setViewForTutorial(currentCount: Int) {
        Log.e("currentCount", "currentCount==>" + currentCount)
        setBottomVisibility()
        when (currentCount) {
            1 -> {
                manageBottomView("call")
            }
            2 -> {
                manageBottomView("alert")
            }
            3 -> {
                manageBottomView("chat")
            }
            4 -> {
                manageBottomView("calendar")
            }
            5 -> {
                manageBottomView("watch")
            }
            6 -> {
                manageBottomView("watch")

            }
            7 -> {
                manageBottomView("watch")

            }
            8 -> {
                manageBottomView("watch")
            }
            9 -> {
                manageBottomView("watch")

            }
            10 -> {
                manageBottomView("chat")

            }
            11 -> {
                manageBottomView("chat")

            }
            12 -> {
                manageBottomView("chat")
                setBottomVisibility(false)
                replaceFragment(IndividualChatFragment("Individual Chat"), true)
            }
            13 -> {
                manageBottomView("chat")
                setBottomVisibility(false)
                replaceFragment(IndividualChatFragment("Individual Chat OpenBottomSheet"), true)
            }
            14 -> {
                manageBottomView("chat")
                setBottomVisibility(false)
                replaceFragment(IndividualChatFragment("Individual Chat OpenBottomSheet"), true)
            }
            15 -> {
                manageBottomView("chat")
                setBottomVisibility(false)
                replaceFragment(IndividualChatFragment("Individual Chat OpenBottomSheet"), true)
            }
            16 -> {
                manageBottomView("chat")
                setBottomVisibility(false)
                replaceFragment(IndividualChatFragment("Individual Chat OpenBottomSheet"), true)
            }
            17 -> {
                manageBottomView("chat")
                drawerOpen()
            }
        }
    }

    public fun setBottomVisibility(isVisible: Boolean = true) {
        if (isVisible) {
            bottomNavigation.makeVisible()
            llSelectedLayout.makeVisible()
        } else {
            if (getVisibleFragment() != null) {
                if (getVisibleFragment() is CalendarFragment || getVisibleFragment() is CallLogFragment || getVisibleFragment() is MainChatFragment || getVisibleFragment() is AboutBandFragment || getVisibleFragment() is AlertFragment) {
                    bottomNavigation.makeVisible()
                    llSelectedLayout.makeVisible()
                } else {
                    bottomNavigation.makeGone()
                    llSelectedLayout.makeGone()
                }
            }
        }

    }

    private fun getVisibleFragment(): Fragment? {
        val fragmentManager: FragmentManager = this@HomeActivity.supportFragmentManager
        val fragments: List<Fragment> = fragmentManager.fragments
        for (fragment in fragments) {
            if (fragment.isVisible) return fragment
        }
        return null
    }


    fun drawerOpen() {

        drawer_layout.openDrawer(GravityCompat.START)

    }

    fun drawerClose() {
        drawer_layout.closeDrawer(GravityCompat.START)
    }

    public fun manageBottomView(clickStatus: String) {
        when (clickStatus) {
            "call" -> {
                bgBottomImage.background = ContextCompat.getDrawable(baseContext!!, R.drawable.ic_tab_bg_one)
                defaultClick()
                imgCallBottomSelected.makeVisible()
                imgCallBottomUnSelected.makeInvisible()
                replaceFragment(CallLogFragment(), false, false)

            }
            "alert" -> {
                bgBottomImage.background = ContextCompat.getDrawable(baseContext!!, R.drawable.ic_tab_bg_two)
                defaultClick()
                imgSirenBottomSelected.makeVisible()
                imgSirenBottomUnSelected.makeInvisible()
                replaceFragment(AlertFragment(), false, false)
            }
            "chat" -> {
                bgBottomImage.background = ContextCompat.getDrawable(baseContext!!, R.drawable.ic_tab_bg_three)
                defaultClick()
                imgChatBottomSelected.makeVisible()
                imgChatBottomUnSelected.makeInvisible()
                replaceFragment(MainChatFragment(), false, false)
            }
            "calendar" -> {
                bgBottomImage.background = ContextCompat.getDrawable(baseContext!!, R.drawable.ic_tab_bg_four)
                defaultClick()
                imgCalendarBottomSelected.makeVisible()
                imgCalendarBottomUnSelected.makeInvisible()
                replaceFragment(CalendarFragment(), false, false)
//                 replaceFragment(AwareFragment(), false, false)
            }
            "watch" -> {
                bgBottomImage.background = ContextCompat.getDrawable(baseContext!!, R.drawable.ic_tab_bg_five)
                defaultClick()
                imgWatchBottomSelected.makeVisible()
                imgWatchBottomUnSelected.makeInvisible()
                replaceFragment(AboutBandFragment(), false, false)
            }
        }
    }

    private fun defaultClick() {
        imgCallBottomSelected.makeInvisible()
        imgSirenBottomSelected.makeInvisible()
        imgChatBottomSelected.makeInvisible()
        imgCalendarBottomSelected.makeInvisible()
        imgWatchBottomSelected.makeInvisible()

        imgCallBottomUnSelected.makeVisible()
        imgSirenBottomUnSelected.makeVisible()
        imgChatBottomUnSelected.makeVisible()
        imgCalendarBottomUnSelected.makeVisible()
        imgWatchBottomUnSelected.makeVisible()
    }


    private fun translate(viewToMove: View, target: View) {
        /* viewToMove.animate()
                 .x(target.x)
                 .y(target.y)
                 .setDuration(1000)
                 .start()
         oldView = target*/
    }

    public fun onBradCast() {
        videoCallDialog = VideoCallDismissDialog()
        if (videoCallDialog != null || videoCallDialog!!.isAdded) {
            //   return;
        }

        videoCallDialog!!.show(supportFragmentManager, "Dialog Fragment")
    }


    override fun onDestroy() {
        super.onDestroy()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mMessageReceiver);
    }

    private val mMessageReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(
                context: Context?,
                intent: Intent
        ) {
            val message = intent.getStringExtra("message")
            if (message.equals("video")) {
                onBradCast()
            }
        }
    }

    override fun onResume() {
        if (SharedPref.getInstance(this).getString(Constants.APPSTATUS).equals("1")) {
            if (SharedPref.getInstance(this).getString(Constants.FINGER_KEY).equals("1")) {

                auth()
            }
        }

        super.onResume()

    }

    override fun onPause() {
        SharedPref.getInstance(this).setString(Constants.APPSTATUS, "1")
        super.onPause()
    }


    override fun onSdkVersionNotSupported() {

    }

    override fun onBiometricAuthenticationPermissionNotGranted() {
        Toast.makeText(this@HomeActivity, getString(R.string.biometric_error_permission_not_granted), Toast.LENGTH_LONG).show()
    }

    override fun onAuthenticationCancelled() {

        mBiometricManager.cancelAuthentication()
        finish()

    }

    override fun onBiometricAuthenticationInternalError(error: String?) {

    }

    override fun onBiometricAuthenticationNotSupported() {

    }

    override fun onAuthenticationError(errorCode: Int, errString: CharSequence?) {


    }

    override fun onAuthenticationHelp(helpCode: Int, helpString: CharSequence?) {

    }

    override fun onAuthenticationSuccessful() {
        SharedPref.getInstance(this).setString(Constants.APPSTATUS, "0")

    }

    override fun onAuthenticationFailed() {
        //  Toast.makeText(this@SplashActivity, getString(R.string.biometric_failed), Toast.LENGTH_LONG).show()


    }

    override fun onBiometricAuthenticationNotAvailable() {

    }

    fun auth() {
        mBiometricManager = com.an.biometric.BiometricManager.BiometricBuilder(this@HomeActivity)
                .setTitle(getString(R.string.biometric_title))
                .setSubtitle(getString(R.string.biometric_subtitle))
                .setDescription(getString(R.string.biometric_description))
                .setNegativeButtonText(getString(R.string.biometric_negative_button_text))
                .build()

        //start authentication
        mBiometricManager.authenticate(this@HomeActivity)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e("resultActigit", "result===")

        if (resultCode == -1) {


//            val month: String = DateFunctions.getInstance().getMonth(textViewExpirationDate.getText().toString())
//            val year: String = DateFunctions.getInstance().getYear(textViewExpirationDate.getText().toString())
//            //mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), Integer.parseInt(month), Integer.parseInt(year), editTextCvv.getText().toString());
//            mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), month.toInt(), year.toInt(), "")
        } else {
            Log.e("resultActigit", "not found")
        }
    }
}