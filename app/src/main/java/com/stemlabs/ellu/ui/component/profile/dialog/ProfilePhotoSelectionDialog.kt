package com.stemlabs.ellu.ui.component.profile.dialog

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
import kotlinx.android.synthetic.main.dialog_profile_photo_selection.view.*
import java.io.*
import java.util.*

class ProfilePhotoSelectionDialog(var fromWhere:String) : DialogFragment(), View.OnClickListener {

    lateinit var viewProfilePhotoSelection: View
    var outputFileUri: Uri? = null
    var imgPath: String? = null
    private val CAMERA_REQUEST = 1
    private val STORAGE_REQUEST = 2
    private val CAMERA_PERMISSION_REQUEST = 101
    private val STORAGE_PERMISSION_REQUEST = 102
    private val TAG = "ImagePicker"
    private val EOF = -1
    private val DEFAULT_BUFFER_SIZE = 2048 * 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window!!.setGravity(Gravity.CENTER)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewProfilePhotoSelection = inflater.inflate(R.layout.dialog_profile_photo_selection, container, false)
        initView()
        return viewProfilePhotoSelection
    }

    private fun initView() {

        var llRemovePhoto = viewProfilePhotoSelection.llRemovePhoto
        var llCamera = viewProfilePhotoSelection.llCamera
        var llGallery = viewProfilePhotoSelection.llGallery

        if(fromWhere.equals("chat")){
            viewProfilePhotoSelection.tvProfilePhotoLBL.text = "John Smith"
            viewProfilePhotoSelection.tvRemovePhotoLBL.text = "Delete Chat"
            viewProfilePhotoSelection.tvCameraLBL.text = "Archive Chat"
            viewProfilePhotoSelection.tvGalleryLBL.text = "Mute Notifications"
            viewProfilePhotoSelection.imgArchiveChat.setImageResource(R.drawable.ic_archive_chat)
            viewProfilePhotoSelection.imgGallery.setImageResource(R.drawable.ic_silent_blue)
        }

        llRemovePhoto.setOnClickListener(this)
        llCamera.setOnClickListener(this)
        llGallery.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.llRemovePhoto -> {
                dialog!!.dismiss()
                listener.setRemovePhotoClick()
            }
            R.id.llCamera -> {
                /*dialog!!.dismiss()*/
                if (this@ProfilePhotoSelectionDialog.chkAllPermission(STORAGE_PERMISSION_REQUEST)) this@ProfilePhotoSelectionDialog.fromCamera()
            }
            R.id.llGallery -> {
                if (this@ProfilePhotoSelectionDialog.chkAllPermission(STORAGE_PERMISSION_REQUEST)) this@ProfilePhotoSelectionDialog.callGallery()
            }
        }
    }


    private fun chkAllPermission(requestCode: Int): Boolean {
        var result: Int
        val permissions = arrayOf(
                Manifest.permission.CAMERA,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
        val listPermissionsNeeded: MutableList<String> = ArrayList()
        for (p in permissions) {
            result = ContextCompat.checkSelfPermission(context!!, p)
            if (result != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(p)
            }
        }
        return if (!listPermissionsNeeded.isEmpty()) {
            if (CAMERA_PERMISSION_REQUEST == requestCode) requestPermissions(listPermissionsNeeded.toTypedArray(), CAMERA_PERMISSION_REQUEST) else requestPermissions(listPermissionsNeeded.toTypedArray(), STORAGE_PERMISSION_REQUEST)
            false
        } else {
            true
        }
    }

    private fun chkStoragePermission(): Boolean {
        var result: Int
        val permissions = arrayOf(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
        val listPermissionsNeeded: MutableList<String> = ArrayList()
        for (p in permissions) {
            result = ContextCompat.checkSelfPermission(context!!, p)
            if (result != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(p)
            }
        }
        return if (!listPermissionsNeeded.isEmpty()) {
            requestPermissions(listPermissionsNeeded.toTypedArray(), STORAGE_PERMISSION_REQUEST)
            false
        } else {
            true
        }
    }

    private fun chkCameraPermission(): Boolean {
        var result: Int
        val permissions = arrayOf(Manifest.permission.CAMERA)
        val listPermissionsNeeded: MutableList<String> = ArrayList()
        for (p in permissions) {
            result = ContextCompat.checkSelfPermission(context!!, p)
            if (result != PackageManager.PERMISSION_GRANTED) {
                listPermissionsNeeded.add(p)
            }
        }
        return if (!listPermissionsNeeded.isEmpty()) {
            requestPermissions(listPermissionsNeeded.toTypedArray(), CAMERA_PERMISSION_REQUEST)
            false
        } else {
            true
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            CAMERA_PERMISSION_REQUEST -> {
                if (grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(context, "Camera permission require", Toast.LENGTH_SHORT).show()
                } else {
                    fromCamera()
                }
            }
            STORAGE_PERMISSION_REQUEST -> {
                if (grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(context, "Storgae permission require", Toast.LENGTH_SHORT).show()
                } else {
                    callGallery()
                }
            }
        }
    }

    private fun fromCamera() {
        outputFileUri = getCaptureImageOutputUri()
        val captureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (null != outputFileUri) captureIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputFileUri)
        try {
            startActivityForResult(captureIntent, CAMERA_REQUEST) //ActivityNotFoundException
        } catch (ex: ActivityNotFoundException) {
            ex.printStackTrace()
        }
    }


    private fun getCaptureImageOutputUri(): Uri? {
        val getImage = activity!!.externalCacheDir
        if (getImage != null) {
            outputFileUri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) FileProvider.getUriForFile(activity!!, BuildConfig.APPLICATION_ID.toString() + ".provider",
                    File(getImage.path, "pickImageResult.jpeg")) //IllegalArgumentException
            else Uri.fromFile(File(getImage.path, "pickImageResult.jpeg"))
        }
        return outputFileUri
    }

    private fun callGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_PICK
        startActivityForResult(Intent.createChooser(intent, "Select Source"), STORAGE_REQUEST)
    }

   /* private fun getCaptureImageOutputUri(): Uri? {
        val getImage = activity!!.externalCacheDir
        if (getImage != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) outputFileUri = FileProvider.getUriForFile(activity!!, BuildConfig.APPLICATION_ID.toString() + ".provider",
                    File(getImage.path, "pickImageResult.jpeg")) //IllegalArgumentException
            else outputFileUri = Uri.fromFile(File(getImage.path, "pickImageResult.jpeg"))
        }
        return outputFileUri
    }*/

    fun getRealPathFromUri(context: Context, uri: Uri?): File? {
        try {
            val inputStream = context.contentResolver.openInputStream(uri!!)
            val fileName: String = getFileName(context, uri)!!
            val splitName: Array<String> = splitFileName(fileName)!!
            var tempFile = File.createTempFile(splitName[0], splitName[1])
            tempFile = rename(tempFile, fileName)
            tempFile.deleteOnExit()
            val out = FileOutputStream(tempFile)
            if (inputStream != null) {
                copy(inputStream, out)
                inputStream.close()
            }
            out.close()
            return tempFile
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return null
    }
    private fun splitFileName(fileName: String): Array<String>? {
        var name = fileName
        var extension = ""
        val i = fileName.lastIndexOf(".")
        if (i != -1) {
            name = fileName.substring(0, i)
            extension = fileName.substring(i)
        }
        return arrayOf(name, extension)
    }


     private fun copy(input: InputStream, output: OutputStream)  {
         var n: Int
         val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
         while (EOF != input.read(buffer).also { n = it }) {
             output.write(buffer, 0, n)
         }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e(TAG, "onActivityResult: ")
        if (resultCode == Activity.RESULT_OK) {
            val uri: Uri?
            if (requestCode == STORAGE_REQUEST) {
                if (data != null) {
                    uri = data.data
                    if (uri != null) {
                        Log.e("uriname=>", "" + uri)
                        imgPath = getRealPathFromUri(context!!, uri)!!.absolutePath
                        Log.e(TAG, "Gallery Path: $imgPath")
                        if (listener != null) {
                            listener.set(imgPath)
                        }
                        dismiss()
                    } else {
                        Log.e(TAG, "uri null: ")
                    }
                }
            } else if (requestCode == CAMERA_REQUEST) {
                Log.e("CAMERA_REQUEST", "load 1")
                try {
                    if (outputFileUri != null) {
                        imgPath = getRealPathFromUri(context!!, outputFileUri)!!.absolutePath
                        Log.e(TAG, "Camera Path: $imgPath")
                        if (listener != null) {
                            listener.set(imgPath)
                        }
                        dismiss()
                    } else {
                        Log.e(TAG, "Uri Null")
                    }
                } catch (e: java.lang.Exception) {
                    e.printStackTrace()
                    e.localizedMessage
                    Log.e("CAMERA_REQUEST", "Failed to load", e)
                }
            }
        }
    }
    
    private fun rename(file: File, newName: String): File? {
        val newFile = File(file.parent, newName)
        if (newFile != file) {
            if (newFile.exists() && newFile.delete()) {
                Log.d("FileUtil", "Delete old $newName file")
            }
            if (file.renameTo(newFile)) {
                Log.d("FileUtil", "Rename file to $newName")
            }
        }
        return newFile
    }
    private fun getFileName(context: Context, uri: Uri): String? {
        var result: String? = null
        if (uri.scheme != null && uri.scheme == "content") {
            val cursor = context.contentResolver.query(uri, null, null, null, null)
            try {
                if (cursor != null && cursor.moveToFirst()) {
                    result = cursor.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME))
                }
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
            } finally {
                cursor?.close()
            }
        }
        if (result == null) {
            result = uri.path
            if (result != null) {
                val cut = result.lastIndexOf(File.separator)
                if (cut != -1) {
                    result = result.substring(cut + 1)
                }
            }
        }
        return result
    }

    fun compressImage(filePath: String?): String? {
        var scaledBitmap: Bitmap? = null
        val options = BitmapFactory.Options()

//      by setting this field as true, the actual bitmap pixels are not loaded in the memory. Just the bounds are loaded. If
//      you try the use the bitmap here, you will get null.
        options.inJustDecodeBounds = true
        var bmp = BitmapFactory.decodeFile(filePath, options)
        var actualHeight = options.outHeight
        var actualWidth = options.outWidth

//      max Height and width values of the compressed image is taken as 816x612
        val maxHeight = 1024.0f
        val maxWidth = 1024.0f
        var imgRatio = (actualWidth / actualHeight).toFloat()
        val maxRatio = maxWidth / maxHeight

//      width and height values are set maintaining the aspect ratio of the image
        if (actualHeight > maxHeight || actualWidth > maxWidth) {
            if (imgRatio < maxRatio) {
                imgRatio = maxHeight / actualHeight
                actualWidth = (imgRatio * actualWidth).toInt()
                actualHeight = maxHeight.toInt()
            } else if (imgRatio > maxRatio) {
                imgRatio = maxWidth / actualWidth
                actualHeight = (imgRatio * actualHeight).toInt()
                actualWidth = maxWidth.toInt()
            } else {
                actualHeight = maxHeight.toInt()
                actualWidth = maxWidth.toInt()
            }
        }

//      setting inSampleSize value allows to load a scaled down version of the original image
        options.inSampleSize = calculateInSampleSize(options, actualWidth, actualHeight)

//      inJustDecodeBounds set to false to load the actual bitmap
        options.inJustDecodeBounds = false

//      this options allow android to claim the bitmap memory if it runs low on memory
        options.inPurgeable = true
        options.inInputShareable = true
        options.inTempStorage = ByteArray(16 * 1024)
        try {
//          load the bitmap from its path
            bmp = BitmapFactory.decodeFile(filePath, options)
        } catch (exception: OutOfMemoryError) {
            exception.printStackTrace()
        }
        try {
            scaledBitmap = Bitmap.createBitmap(actualWidth, actualHeight, Bitmap.Config.ARGB_8888)
        } catch (exception: OutOfMemoryError) {
            exception.printStackTrace()
        }
        val ratioX = actualWidth / options.outWidth.toFloat()
        val ratioY = actualHeight / options.outHeight.toFloat()
        val middleX = actualWidth / 2.0f
        val middleY = actualHeight / 2.0f
        val scaleMatrix = Matrix()
        scaleMatrix.setScale(ratioX, ratioY, middleX, middleY)
        val canvas = Canvas(scaledBitmap!!)
        canvas.setMatrix(scaleMatrix)
        canvas.drawBitmap(bmp, middleX - bmp.width / 2, middleY - bmp.height / 2, Paint(Paint.FILTER_BITMAP_FLAG))

//      check the rotation of the image and display it properly
        val exif: ExifInterface
        try {
            exif = ExifInterface(filePath)
            val orientation = exif.getAttributeInt(
                    ExifInterface.TAG_ORIENTATION, 0)
            Log.d("EXIF", "Exif: $orientation")
            val matrix = Matrix()
            if (orientation == 6) {
                matrix.postRotate(90f)
                Log.d("EXIF", "Exif: $orientation")
            } else if (orientation == 3) {
                matrix.postRotate(180f)
                Log.d("EXIF", "Exif: $orientation")
            } else if (orientation == 8) {
                matrix.postRotate(270f)
                Log.d("EXIF", "Exif: $orientation")
            }
            scaledBitmap = Bitmap.createBitmap(scaledBitmap, 0, 0,
                    scaledBitmap.width, scaledBitmap.height, matrix,
                    true)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        val out: FileOutputStream
        val filename = getFilename()
        try {
            out = FileOutputStream(filename)

//          write the compressed bitmap at the destination specified by filename.
            scaledBitmap!!.compress(Bitmap.CompressFormat.JPEG, 70, out)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
        return filename
    }
    
    lateinit var listener: OnClickSetProfilePhoto
    public fun setPhotoSelectionListener(listener: OnClickSetProfilePhoto) {
        this.listener = listener
    }


    public interface OnClickSetProfilePhoto {
        public fun setRemovePhotoClick()
        public fun set(filepath: String?)
    }

    fun getFilename(): String? {
        val file = File(Environment.getExternalStorageDirectory().path, ".spongy/Images")
        if (!file.exists()) {
            file.mkdirs()
        }
        return file.absolutePath + "/" + System.currentTimeMillis() + ".jpg"
    }

    public fun calculateInSampleSize(options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int): Int {
        val height = options.outHeight;
        val width = options.outWidth;
        var inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {
            val heightRatio = Math.round(height.toFloat() / reqHeight.toFloat())
            val widthRatio = Math.round(width.toFloat() / reqWidth.toFloat())
            if(heightRatio < widthRatio){
                inSampleSize =   heightRatio    
            }else{
                inSampleSize =   widthRatio
            }
             
        }
        var totalPixels = width * height;
        var totalReqPixelsCap = reqWidth * reqHeight * 2;
        while (totalPixels / (inSampleSize * inSampleSize) > totalReqPixelsCap) {
            inSampleSize++;
        }

        return inSampleSize;
    }


}