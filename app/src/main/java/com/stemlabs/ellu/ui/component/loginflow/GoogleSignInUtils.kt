package com.stemlabs.ellu.ui.component.loginflow

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.provider.Settings.Global.getString
import android.util.Log
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.stemlabs.ellu.R

class GoogleSignInUtils {


    private var googleSignInClient: GoogleSignInClient? = null

    fun initialize(): GoogleSignInUtils? {
        val gso =
                GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                        .requestIdToken(getString(R.string.default_web_client_id))
                        .requestEmail()
                        .build()
        googleSignInClient = GoogleSignIn.getClient(context, gso)
        return instance
    }

    fun signOutIfAlreadySignedIn(): GoogleSignInUtils? {
        val account = GoogleSignIn.getLastSignedInAccount(context)
        if (account != null) googleSignInClient?.signOut()
        return instance
    }

    fun thenSignIn() {
        val signInIntent: Intent? = googleSignInClient?.signInIntent
        (context as Activity).startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    companion object {
        const val RC_SIGN_IN: Int = 600
        private const val TAG: String = "GoogleSignInUtils: "

        private var instance: GoogleSignInUtils? = null
        private lateinit var context: Context

        fun getInstance(context: Context): GoogleSignInUtils {
            this.context = context
            if (instance == null) instance = GoogleSignInUtils()
            return instance!!
        }

        fun getAccountFromIntent(data: Intent?): GoogleSignInAccount? {
            // The Task returned from this call is always completed, no need to attach a listener.
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            Log.e(TAG, "task" + task)

            return try {
                task.getResult(ApiException::class.java)
            } catch (e: ApiException) {
                // The ApiException status code indicates the detailed failure reason.
                // Please refer to the GoogleSignInStatusCodes class reference for more information.
                Log.e(TAG, "" + e.localizedMessage)
                Log.e(TAG, "signInResult:failed code=" + e.statusCode)
                null
            }
        }
    }

}
