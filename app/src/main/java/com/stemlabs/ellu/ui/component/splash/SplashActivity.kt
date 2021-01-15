package com.stemlabs.ellu.ui.component.splash

import android.app.KeyguardManager
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.util.Base64
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.an.biometric.BiometricCallback
import com.stemlabs.ellu.R
import com.stemlabs.ellu.databinding.SplashLayoutBinding
import com.stemlabs.ellu.ui.ViewModelFactory
import com.stemlabs.ellu.ui.base.BaseActivity
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.loginflow.LoginFlowActivity
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.splash_layout.*
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import javax.inject.Inject

class SplashActivity : BaseActivity(), BiometricCallback {
    private var slideFromLeft: Animation? = null
    private var slideFromRight: Animation? = null
    private var larger_zoom: Animation? = null
    private var slide_to_top_anim: Animation? = null

    lateinit var mBiometricManager: com.an.biometric.BiometricManager

    var authIntent: Intent? = null

    val keyguardManager: KeyguardManager? = null


    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var splashViewModel: SplashViewModel

    private lateinit var binding: SplashLayoutBinding

    override fun initViewBinding() {
        binding = SplashLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun initializeViewModel() {
        splashViewModel = viewModelFactory.create(splashViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val info: PackageInfo = packageManager.getPackageInfo(
                    packageName,
                    PackageManager.GET_SIGNATURES)
            for (signature in info.signatures) {
                val md: MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                Log.i("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
            }
        } catch (e: PackageManager.NameNotFoundException) {
            Log.e("name not found", e.toString())
        } catch (e: NoSuchAlgorithmException) {
            Log.e("no such an algorithm", e.toString())
        }


        navigateToMainScreen()

    }

    override fun observeViewModel() {

    }

    private fun navigateToMainScreen() {
        SharedPref.getInstance(this).setString(Constants.APPSTATUS, "0")
        slideFromLeft = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.slide_in_from_left_anim)
        slideFromRight = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.slide_in_from_right_anim)
        larger_zoom = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.larger_zoom)
        slide_to_top_anim = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.slide_to_top_anim)
        imgHeader.startAnimation(slideFromLeft)
        imgElluSplash.startAnimation(slideFromRight)

        slideFromLeft!!.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                imgWhiteCircular.makeVisible()
                imgWhiteCircular.startAnimation(larger_zoom)


            }

            override fun onAnimationRepeat(animation: Animation?) {
            }
        })

        larger_zoom!!.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                imgWhiteCircular.makeGone()
                imgElluSplash.setColorFilter(ContextCompat.getColor(this@SplashActivity, R.color.color73C5F3))
                mainContainer.background = ContextCompat.getDrawable(this@SplashActivity, R.color.colorWhite)

                Handler().postDelayed({
                    llcenterlayout.startAnimation(slide_to_top_anim)
                }, Constants.SPLASH_DELAY.toLong())
            }

            override fun onAnimationRepeat(animation: Animation?) {


            }
        })
        slide_to_top_anim!!.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                if (SharedPref.getInstance(this@SplashActivity).getString(Constants.FINGER_KEY).equals("1")) {

                    auth()
                } else if (SharedPref.getInstance(this@SplashActivity).getString(Constants.USER_ID).isNotEmpty()) {
                    val nextScreenIntent = Intent(this@SplashActivity, HomeActivity::class.java)
                    startActivity(nextScreenIntent)
                    finish()
                } else {
                    val nextScreenIntent = Intent(this@SplashActivity, LoginFlowActivity::class.java)
                    startActivity(nextScreenIntent)
                    finish()
                }
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })


    }

    override fun onSdkVersionNotSupported() {
    }

    override fun onBiometricAuthenticationPermissionNotGranted() {
        Toast.makeText(this@SplashActivity, getString(R.string.biometric_error_permission_not_granted), Toast.LENGTH_LONG).show()
    }

    override fun onAuthenticationCancelled() {


        mBiometricManager.cancelAuthentication()
        finish()

    }

    override fun onBiometricAuthenticationInternalError(error: String?) {
        Toast.makeText(this@SplashActivity, getString(R.string.biometric_failed), Toast.LENGTH_LONG).show()

    }

    override fun onBiometricAuthenticationNotSupported() {

    }

    override fun onAuthenticationError(errorCode: Int, errString: CharSequence?) {
        Toast.makeText(this@SplashActivity, errString, Toast.LENGTH_LONG).show()

    }

    override fun onAuthenticationHelp(helpCode: Int, helpString: CharSequence?) {

    }

    override fun onAuthenticationSuccessful() {

        val nextScreenIntent = Intent(this@SplashActivity, HomeActivity::class.java)
        startActivity(nextScreenIntent)
        finish()

    }

    override fun onAuthenticationFailed() {
        Toast.makeText(this@SplashActivity, getString(R.string.biometric_failed), Toast.LENGTH_LONG).show()


    }

    override fun onBiometricAuthenticationNotAvailable() {

    }

    fun auth() {
        mBiometricManager = com.an.biometric.BiometricManager.BiometricBuilder(this@SplashActivity)
                .setTitle(getString(R.string.biometric_title))
                .setSubtitle(getString(R.string.biometric_subtitle))
                .setDescription(getString(R.string.biometric_description))
                .setNegativeButtonText(getString(R.string.biometric_negative_button_text))
                .build()

        //start authentication
        mBiometricManager.authenticate(this@SplashActivity)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e("resultActigit", "result===")
        Toast.makeText(this@SplashActivity, getString(R.string.biometric_failed), Toast.LENGTH_LONG).show()

        if (resultCode == -1) {


//            val month: String = DateFunctions.getInstance().getMonth(textViewExpirationDate.getText().toString())
//            val year: String = DateFunctions.getInstance().getYear(textViewExpirationDate.getText().toString())
//            //mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), Integer.parseInt(month), Integer.parseInt(year), editTextCvv.getText().toString());
//            mPresenter.generateStripeToken(editTextCardNumber.getText().toString(), month.toInt(), year.toInt(), "")
        } else {
            Log.e("resultActigit", "not found")
        }
    }


    /**/
}