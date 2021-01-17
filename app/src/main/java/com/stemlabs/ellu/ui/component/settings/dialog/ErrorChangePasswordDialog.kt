package com.stemlabs.ellu.ui.component.settings.dialog

import android.Manifest
import android.app.Activity
import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.*
import android.media.ExifInterface
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.provider.OpenableColumns
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.fragment.app.DialogFragment
import com.stemlabs.ellu.BuildConfig
import com.stemlabs.ellu.R
import kotlinx.android.synthetic.main.dialog_error_change_password.view.*
import kotlinx.android.synthetic.main.dialog_profile_photo_selection.view.*
import kotlinx.android.synthetic.main.dialog_profile_photo_selection.view.llRemovePhoto
import java.io.*
import java.util.*

class ErrorChangePasswordDialog() : DialogFragment(), View.OnClickListener {

    lateinit var viewErrorPassword: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.window!!.setGravity(Gravity.CENTER)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewErrorPassword = inflater.inflate(R.layout.dialog_error_change_password, container, false)
        initView()
        return viewErrorPassword
    }

    private fun initView() {

        var ivClose = viewErrorPassword.ivClose
        ivClose.setOnClickListener(this)
        
    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.ivClose -> {
                dialog!!.dismiss()
            }
        }
    }




}