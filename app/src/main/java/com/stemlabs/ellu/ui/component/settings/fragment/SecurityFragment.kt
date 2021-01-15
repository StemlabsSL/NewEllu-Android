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
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import kotlinx.android.synthetic.main.fragment_security.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class SecurityFragment : BaseFragment(), View.OnClickListener, BiometricCallback {

    var currentStatus = "facedetection"

    lateinit var mcontext: Context

    lateinit var mBiometricManager: com.an.biometric.BiometricManager

    var authIntent: Intent? = null

    val keyguardManager: KeyguardManager? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_security, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext = context
    }

    private fun initView() {
        setHeader()
        if (SharedPref.getInstance(mcontext).getString(Constants.FINGER_KEY).equals("1")) {
            tvAddFingerPrintLBL.setText("REMOVE FINGER PRINT")

        }
        tvUseIdentificationLBL.setOnClickListener(this)
        tvAddFingerPrintLBL.setOnClickListener(this)
    }

    private fun setHeader() {
        tvToolbarTitle.text = "Security"
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
            R.id.tvUseIdentificationLBL -> {
                if (currentStatus.equals("fingerprint")) {
                    currentStatus = "facedetection"
                    tvStartUsingYourLBL.text = "Start Using Your\nFinger Print"
                    tvAddFingerPrintLBL.text = "ADD FINGER PRINT"
                    tvUseIdentificationLBL.text = "USE FACE IDENTIFICATION INSTEAD"
                    imgFaceDetection.setImageResource(R.drawable.ic_finger_print_blue)
                } else {
                    currentStatus = "fingerprint"
                    tvStartUsingYourLBL.text = "Start Using Your\nFace Detection"
                    tvAddFingerPrintLBL.text = "ADD FACE DETECTION"
                    tvUseIdentificationLBL.text = "USE FINGERPRINT INSTEAD"
                    imgFaceDetection.setImageResource(R.drawable.ic_face_detection)

                }
            }
            R.id.tvAddFingerPrintLBL -> {

                if (SharedPref.getInstance(mcontext).getString(Constants.FINGER_KEY).equals("1")) {

                    showBaseToast(LLFinger, "Finger print remove successfully")
                    SharedPref.getInstance(mcontext).setString(Constants.FINGER_KEY, "0")
                    activity?.onBackPressed()


                } else {
                    auth()
                }


            }


        }
    }


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
        showBaseToast(LLFinger, getString(R.string.biometric_error_hardware_not_supported))
    }

    override fun onBiometricAuthenticationNotAvailable() {
        showBaseToast(LLFinger, "Go to setting and set the finger first on your device")

    }

    override fun onBiometricAuthenticationPermissionNotGranted() {
        showBaseToast(LLFinger, getString(R.string.biometric_error_permission_not_granted))
    }

    override fun onBiometricAuthenticationInternalError(error: String?) {
        showBaseToast(LLFinger, error.toString())
    }

    override fun onAuthenticationFailed() {
        showBaseToast(LLFinger, getString(R.string.biometric_failure))
    }

    override fun onAuthenticationCancelled() {
        mBiometricManager.cancelAuthentication()
    }

    override fun onAuthenticationSuccessful() {
//        val month: String = DateFunctions.getInstance().getMonth(textViewExpirationDate.getText().toString())
//        val year: String = DateFunctions.getInstance().getYear(textViewExpirationDate.getText().toString())
//        //mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), Integer.parseInt(month), Integer.parseInt(year), editTextCvv.getText().toString());
//        mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), month.toInt(), year.toInt(), "")

        Toast.makeText(context, "Finger add successfully", Toast.LENGTH_LONG).show()
        SharedPref.getInstance(mcontext).setString(Constants.FINGER_KEY, "1")
        activity?.onBackPressed()


    }

    override fun onAuthenticationHelp(helpCode: Int, helpString: CharSequence?) {
        Toast.makeText(mcontext, helpString, Toast.LENGTH_LONG).show();
    }

    override fun onAuthenticationError(errorCode: Int, errString: CharSequence?) {
        showBaseToast(LLFinger, errString.toString())
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
                    showBaseToast(LLFinger, "Go to setting and set the phone lock on your device")
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


}