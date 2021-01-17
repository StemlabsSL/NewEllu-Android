package com.stemlabs.ellu.ui.component.loginflow

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ImageDecoder
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.facebook.*
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.remote.service.WebService
import com.stemlabs.ellu.ui.base.BaseActivity
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.SignupCommand
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.Signupmodel
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import com.stemlabs.ellu.utils.hideKeyboard
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_sign_up.*
import org.json.JSONObject
import java.io.IOException
import java.util.*

class LoginFlowActivity : BaseActivity() {

    private lateinit var callbackManager: CallbackManager

    private var googleSignInClient: GoogleSignInClient? = null


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {
    }

    override fun initViewBinding() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_flow)
        replaceWitohutFragment(IntroFragment())
        callbackManager = CallbackManager.Factory.create()
        FacebookSdk.sdkInitialize(getApplicationContext())




        imgFacebook.setOnClickListener(View.OnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(
                    this,
                    Arrays.asList("public_profile", "email")
            )
        })
        imgGoogle.setOnClickListener {
            GoogleSignInUtils.getInstance(this).initialize()
                    ?.signOutIfAlreadySignedIn()?.thenSignIn()
        }
        LoginManager.getInstance().registerCallback(callbackManager, object : FacebookCallback<LoginResult> {
            override fun onSuccess(loginResult: LoginResult) {
                val request = GraphRequest.newMeRequest(
                        loginResult.accessToken
                ) { jObj: JSONObject, response: GraphResponse? ->
                    var email: String? = ""
                    var id = ""
                    var first_name = ""
                    var last_name = ""
                    var profile_img_url = ""

                    LoginManager.getInstance().logOut()
                    AccessToken.setCurrentAccessToken(null)

                    try {

//                        if (!jObj.getString("email").isNullOrEmpty()){
//                            email = jObj.getString("email")
//                        }

//                        email = jObj.getString("email")
                        id = jObj.getString("id")
                        first_name = jObj.getString("first_name")
                        last_name = jObj.getString("last_name")
                        val picture = jObj.getJSONObject("picture")
                        val data = picture.getJSONObject("data")
                        profile_img_url = data.getString("url")
                        Log.e("idqwerwqer", "id ".plus(id))
                    } catch (e: Exception) {
                        e.printStackTrace()
                        Log.e("idqwerwqer", "id " + e.message)

                    }
                    Log.e(
                            "tag",
                            "details: $email/$id/$first_name/$last_name/$profile_img_url".plus(email)
                    )



                    if (id.isNotEmpty()) {
                        ApiSignup(email.toString(), first_name.plus(" ").plus(last_name), id, profile_img_url)

                    }

                    @SuppressLint("HardwareIds") val DEVICE_ID =
                            Settings.Secure.getString(
                                    contentResolver,
                                    Settings.Secure.ANDROID_ID
                            )
                }
                val parameters = Bundle()
                parameters.putString(
                        "fields",
                        "id,name,email,first_name,last_name,picture.width(300).height(300)"
                )
                request.parameters = parameters
                request.executeAsync()
            }

            override fun onCancel() {
                Log.e("tag", "cancel")

            }

            override fun onError(error: FacebookException) {
                Log.e("tag", "err: " + error.localizedMessage)

            }
        })
    }

    fun signUpWithFacebook() {

        val loginmanager = LoginManager.getInstance()
        val accessToken = AccessToken.getCurrentAccessToken()
        if (accessToken != null) {
            loginmanager.logOut()
        }


    }


    fun ApiSignup(email: String, name: String, id: String, image: String) {

//        showBaseProgressDialog(mContext, getString(R.string.please_wait))
        WebService.mInstance.SignUp(name = name, email = email.trim(), socialid = id, image = image, password = "", deviceId = "1", latitude = "0", longitude = "0", command = object : SignupCommand {
            override fun onSuccess(response: Signupmodel) {

                //     hideBaseProgressDialog()
                if (response.success == true) {

                    SharedPref.getInstance(this@LoginFlowActivity).setString(Constants.USER_NAME, name)
                    SharedPref.getInstance(this@LoginFlowActivity).setString(Constants.USER_EMAIL, email)
                    SharedPref.getInstance(this@LoginFlowActivity).setString(Constants.USER_PASSWORD, "")
                    SharedPref.getInstance(this@LoginFlowActivity).setString(Constants.PRO_ID, image)
                    SharedPref.getInstance(this@LoginFlowActivity).setString(Constants.SOCIAL_ID, id)



                    if (response.message.equals("Please process next")) {
                        replaceFragment(ForgotPasswordFragment("signup"), true)
                    } else {
                        SharedPref.getInstance(this@LoginFlowActivity).setString(Constants.USER_ID, response.data.get_id())

                        val nextScreenIntent = Intent(this@LoginFlowActivity, HomeActivity::class.java)
                        startActivity(nextScreenIntent)
                        finish()
                    }


                }
            }

            override fun onError(message: String) {
                //    hideBaseProgressDialog()
                showBaseToast(LL_Layout, message)
                Log.e("error", message)
            }

        })


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                GoogleSignInUtils.RC_SIGN_IN -> {
                    val account = GoogleSignInUtils.getAccountFromIntent(data)
                    Log.e("account", "accountTyope".plus(account))
                    if (account != null) {
                        // nameEt.setText(account.givenName)
                        //  Log.e("account", "accountTyope".plus(nameEt))
                        //  lastNameEt.setText(if (account.familyName == null || account.familyName == "null") "" else account.familyName)
                        //  emailEt.setText(account.email)

                        ApiSignup(email = account.email.toString(), name = account.givenName.toString(), id = account.id.toString(), image = account.photoUrl.toString())
                        Log.e("account", "accountTyope".plus(account.givenName))
                    } else {
                        Log.e("account", "else part")
//                        showSignUpOptionsPopup(this, this)
                    }
                }
            }
        } else {
            Log.e("account", "accountTyopeerror")

        }
    }

    override fun onBackPressed() {

        if (fragment is ResetPasswordSuccessfullyFragment) {
            finish()
        } else {
            super.onBackPressed()
        }
    }
}



