package com.stemlabs.ellu.ui.component.settings.fragment

import android.app.KeyguardManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.an.biometric.BiometricCallback
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.SettingsModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.settings.adapter.SettingListAdapter
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_security.*
import kotlinx.android.synthetic.main.fragment_settings.*
import kotlinx.android.synthetic.main.listrow_settings.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class SettingsFragment : BaseFragment(), View.OnClickListener, SettingListAdapter.switchClick, BiometricCallback {

    var settingList = ArrayList<SettingsModel>()
    lateinit var settingListAdapter: SettingListAdapter

    var currentStatus = "facedetection"

    lateinit var mcontext: Context

    lateinit var mBiometricManager: com.an.biometric.BiometricManager

    var authIntent: Intent? = null

    val keyguardManager: KeyguardManager? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        //(baseActivity as HomeActivity).bottomNavigation.visibility = View.VISIBLE
        setHeader()
        setData()
        setRecyclearView()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.setText("Settings & Privacy")
    }

    private fun setData() {
        settingList.clear()
        settingList.add(SettingsModel(R.drawable.ic_change_password_icon_gray, "Change Password"))
        settingList.add(SettingsModel(R.drawable.ic_security_icon_gray, "Finger Print"))
        settingList.add(SettingsModel(R.drawable.ic_faq_icon_gray, "FAQs"))
        settingList.add(SettingsModel(R.drawable.ic_terms_icon_gray, "Terms & Conditions"))
        settingList.add(SettingsModel(R.drawable.ic_privacy_icon_gray, "Privacy Policy"))
    }

    private fun setRecyclearView() {
        settingListAdapter = SettingListAdapter(mutableListOf())
        settingListAdapter.onClickSwitch(this)
        settingListAdapter.setSettingsClickListener(object : SettingListAdapter.OnSelectSetting {
            override fun selectedServiceAt(position: Int) {
                when (position) {
                    0 -> {
                        replaceFragment(ChangePasswordFragment(), true)
                    }
                    1 -> {


//                        if(switchAlarmOnOff.textOn){
//

//                        }
                    }
                    2 -> {
                        replaceFragment(FaqFragment(), true)
                    }
                    3 -> {
                        replaceFragment(TermsConditionFragment(), true)
                    }
                    4 -> {
                        replaceFragment(PrivacyPolicyFragment(), true)
                    }
                }
            }
        })
        settingListAdapter.updateList(settingList)
        rvSettings.adapter = settingListAdapter
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()

        }
    }

    override fun onDestroyView() {
        //(baseActivity as HomeActivity).bottomNavigation.visibility = View.GONE
        super.onDestroyView()
    }

    override fun oncick(value: Boolean) {
        if (value == true) {
            auth()

        } else {
            Toast.makeText(mcontext, "Finger print remove successfully", Toast.LENGTH_LONG).show()
            // showBaseToast(rootView, "Finger print remove successfully")
            SharedPref.getInstance(mcontext).setString(Constants.FINGER_KEY, "0")
            activity?.onBackPressed()
        }


    }

//    override fun oncick(value: String) {
//
//        Toast.makeText(context, "posi".plus(value), Toast.LENGTH_LONG).show()
//
//    }


    fun auth() {
        mBiometricManager = com.an.biometric.BiometricManager.BiometricBuilder(mcontext)
                .setTitle("Add finger print")
                .setSubtitle("")
                .setDescription(getString(R.string.biometric_description))
                .setNegativeButtonText(getString(R.string.biometric_negative_button_text))
                .build()

        //start authentication
        mBiometricManager.authenticate(this)
    }


    override fun onSdkVersionNotSupported() {
        //    checkLock()
        //  Toast.makeText(getApplicationContext(), getString(R.string.biometric_error_sdk_not_supported), Toast.LENGTH_LONG).show();
    }

    override fun onBiometricAuthenticationNotSupported() {
        // checkLock()
        Toast.makeText(mcontext, "".plus(getString(R.string.biometric_error_hardware_not_supported)), Toast.LENGTH_LONG).show()

        // showBaseToast(rootView, getString(R.string.biometric_error_hardware_not_supported))
    }

    override fun onBiometricAuthenticationNotAvailable() {
        Toast.makeText(mcontext, "Go to setting and set the finger first on your device", Toast.LENGTH_LONG).show()

        // showBaseToast(rootView, "Go to setting and set the finger first on your device")

    }

    override fun onBiometricAuthenticationPermissionNotGranted() {

        Toast.makeText(mcontext, "".plus(getString(R.string.biometric_error_permission_not_granted)), Toast.LENGTH_LONG).show()

        //showBaseToast(rootView, getString(R.string.biometric_error_permission_not_granted))
    }

    override fun onBiometricAuthenticationInternalError(error: String?) {
        Toast.makeText(mcontext, "".plus(error.toString()), Toast.LENGTH_LONG).show()

        // showBaseToast(rootView, error.toString())
    }

    override fun onAuthenticationFailed() {
        Toast.makeText(mcontext, "".plus(getString(R.string.biometric_failure)), Toast.LENGTH_LONG).show()


        //  showBaseToast(rootView, getString(R.string.biometric_failure))
    }

    override fun onAuthenticationCancelled() {
        mBiometricManager.cancelAuthentication()
    }

    override fun onAuthenticationSuccessful() {
//        val month: String = DateFunctions.getInstance().getMonth(textViewExpirationDate.getText().toString())
//        val year: String = DateFunctions.getInstance().getYear(textViewExpirationDate.getText().toString())
//        //mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), Integer.parseInt(month), Integer.parseInt(year), editTextCvv.getText().toString());
//        mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), month.toInt(), year.toInt(), "")

        Toast.makeText(mcontext, "Finger add successfully", Toast.LENGTH_LONG).show()
        SharedPref.getInstance(mcontext).setString(Constants.FINGER_KEY, "1")
        activity?.onBackPressed()


    }

    override fun onAuthenticationHelp(helpCode: Int, helpString: CharSequence?) {
        Toast.makeText(mcontext, helpString, Toast.LENGTH_LONG).show();
    }

    override fun onAuthenticationError(errorCode: Int, errString: CharSequence?) {

        Toast.makeText(mcontext, "".plus(errString.toString()), Toast.LENGTH_LONG).show()

        // showBaseToast(rootView, errString.toString())
    }


    fun checkLock() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (keyguardManager != null) {
                if (keyguardManager.isKeyguardSecure()) {
                    authIntent = keyguardManager.createConfirmDeviceCredentialIntent(
                            "",
                            ""
                    )
                    startActivityForResult(authIntent, 1)
                } else {


                    Toast.makeText(mcontext, "Go to setting and set the phone lock on your device", Toast.LENGTH_LONG).show()
                    //   showBaseToast(rootView, "Go to setting and set the phone lock on your device")
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e("resultActigit", "result===")

        if (resultCode == -1) {

            Log.e("resultActigit", "result" + resultCode.toString())
            SharedPref.getInstance(mcontext).setString(Constants.FINGER_KEY, "1")

//            val month: String = DateFunctions.getInstance().getMonth(textViewExpirationDate.getText().toString())
//            val year: String = DateFunctions.getInstance().getYear(textViewExpirationDate.getText().toString())
//            //mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), Integer.parseInt(month), Integer.parseInt(year), editTextCvv.getText().toString());
//            mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), month.toInt(), year.toInt(), "")
        } else {
            Log.e("resultActigit", "not found")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext = context
    }


}

