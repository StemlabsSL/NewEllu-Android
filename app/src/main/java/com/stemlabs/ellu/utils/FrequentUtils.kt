package com.stemlabs.ellu.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.net.ConnectivityManager
import android.os.Environment
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.stemlabs.ellu.R
import de.hdodenhof.circleimageview.CircleImageView
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*
import kotlin.math.pow
import kotlin.math.roundToInt


object FrequentUtils {


    fun getAddressExceptCountryName(address: String?): String {
        return if (address != null)
            return address.substring(0, address.lastIndexOf(","))
        else
            ""
    }

    fun getCorrectTime(selectedHours: Int, selectedMinute: Int): String {
        var selectedHour = selectedHours
        val formatter = DecimalFormat("00")
        var hour = formatter.format(selectedHour.toLong())
        val minute = formatter.format(selectedMinute.toLong())
        return when {
            selectedHour > 12 -> {
                selectedHour -= 12
                hour = formatter.format(selectedHour.toLong())
                "$hour:$minute PM"
            }
            selectedHour == 12 -> "$hour:$minute PM"
            else -> "$hour:$minute AM"
        }
    }


    fun getRequestBodyFromString(value: String): RequestBody {
        return value.toRequestBody("multipart/form-data".toMediaTypeOrNull())
    }

    fun getRequestBodyFromFile(key: String, file: File?): MultipartBody.Part? {
        var imagePart: MultipartBody.Part? = null
        if (file != null) {
            val imageBody: RequestBody = file.asRequestBody("image/*".toMediaTypeOrNull())
            imagePart = MultipartBody.Part.createFormData(key, file.name, imageBody)
        }
        return imagePart
    }


    fun resizeMapIcons(context: Context, resId: Int, width: Int, height: Int): Bitmap {
        val imageBitmap = BitmapFactory.decodeResource(context.resources, resId)
        val scaledBitmap = Bitmap.createScaledBitmap(imageBitmap, width, height, false)
        val matrix = Matrix()
        matrix.postRotate(0f)
        return Bitmap.createBitmap(scaledBitmap, 0, 0, scaledBitmap.width, scaledBitmap.height, matrix, false)
    }


    fun hideSoftKeyBoard(activity: Activity) {
        val view = activity.currentFocus
        if (view != null) {
            val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun showSoftKeyBoard(activity: Activity) {
        val view = activity.currentFocus
        if (view != null) {
            val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(view, 0)
        }
    }

    fun getTwoDigitNumber(i: Int): String = (DecimalFormat("00").format(i))

    fun roundToDigit(values: Float, places: Int): String {
        var value = values
        if (places < 0) throw IllegalArgumentException()
        val factor = 10.0.pow(places.toDouble()).toLong()
        value *= factor
        val tmp = value.roundToInt()
        val result = tmp.toDouble() / factor
        return (DecimalFormat("0.00").format(result))
    }

    fun round(values: Double, places: Int): Double {
        var value = values
        if (places < 0) throw IllegalArgumentException()
        val factor = 10.0.pow(places.toDouble()).toLong()
        value *= factor
        val tmp = value.roundToInt()
        return tmp.toDouble() / factor
    }

    fun roundToOneDigit(values: Float): String {
        var value = values
        val factor = 10.0.pow(1).toLong()
        value *= factor
        val tmp = value.roundToInt()
        val result = tmp.toDouble() / factor
        return (DecimalFormat("0.0").format(result))
    }


    fun getFormat(): NumberFormat {
        val format = NumberFormat.getCurrencyInstance(initFormat())
        format.minimumFractionDigits = 2
        return format
    }


    fun initFormat(): Locale {
        return Locale("en", "IN")
    }


    fun getAge(year: Int, month: Int, day: Int): String? {
        val dob = Calendar.getInstance()
        val today = Calendar.getInstance()
        dob[year, month] = day
        var age = today[Calendar.YEAR] - dob[Calendar.YEAR]
        if (today[Calendar.DAY_OF_YEAR] < dob[Calendar.DAY_OF_YEAR]) {
            age--
        }
        val ageInt = age
        return ageInt.toString()
    }

    fun isNetworkConnected(context: Context): Boolean {
        val manager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = manager.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnected
    }


    fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }


    @SuppressLint("CheckResult")
    fun LoadImage(view: CircleImageView, imageUrl: String?) {
        if (imageUrl != null) {
            val requestOptions = RequestOptions()
            requestOptions.placeholder(R.drawable.ic_profile_ring_avtar)
            requestOptions.error(R.drawable.ic_profile_ring_avtar)
            requestOptions.diskCacheStrategy(DiskCacheStrategy.ALL)
                    .priority(Priority.HIGH)
            if (imageUrl.startsWith("http")) {
                Glide.with(view.context)
                        .setDefaultRequestOptions(requestOptions)
                        .load(imageUrl)
                        .into(view)
            } else {
                Glide.with(view.context)
                        .setDefaultRequestOptions(requestOptions)
                        .load(Constants.IMAGE_BASE_URL.plus(imageUrl))
                        .into(view)
            }
        }
    }

    @SuppressLint("CheckResult")
    fun LoadImage(view: ImageView, imageUrl: String?) {
        if (imageUrl != null) {
            val requestOptions = RequestOptions()
            requestOptions.placeholder(R.drawable.ic_user)
            requestOptions.error(R.drawable.ic_user)
            requestOptions.diskCacheStrategy(DiskCacheStrategy.ALL)
                    .priority(Priority.HIGH)
            Glide.with(view.context)
                    .setDefaultRequestOptions(requestOptions)
                    .load(Constants.IMAGE_BASE_URL.plus(imageUrl))
                    .into(view)
        }
    }

    fun createFileFromBitMap(bitmap: Bitmap): File? {
        val file: File
        val imageFileName = "ClubScene" + "-" + System.currentTimeMillis() + ".jpg"
        val myDirectory = File(Environment.getExternalStorageDirectory(), "ClubScene")
        if (!myDirectory.exists()) {
            myDirectory.mkdir()
        }
        file = File(myDirectory, imageFileName)
        try {
            file.createNewFile()
        } catch (e: IOException) {
            e.printStackTrace()
        }

//Convert bitmap to byte array
        val bos = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bos)
        val bitmapData: ByteArray = bos.toByteArray()

//write the bytes in file
        val fos: FileOutputStream
        try {
            fos = FileOutputStream(file)
            fos.write(bitmapData)
            fos.flush()
            fos.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return file
    }
    fun changeImageOrientation(photoPath: String?, bitmap: Bitmap): Bitmap? {
        var ei: ExifInterface? = null
        try {
            ei = ExifInterface(photoPath)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        var orientation = 0
        if (ei != null) {
            orientation = ei.getAttributeInt(ExifInterface.TAG_ORIENTATION,
                    ExifInterface.ORIENTATION_UNDEFINED)
        }
        val rotatedBitmap: Bitmap
        rotatedBitmap = when (orientation) {
            ExifInterface.ORIENTATION_ROTATE_90 -> rotateImage(bitmap, 90f)
            ExifInterface.ORIENTATION_ROTATE_180 -> rotateImage(bitmap, 180f)
            ExifInterface.ORIENTATION_ROTATE_270 -> rotateImage(bitmap, 270f)
            ExifInterface.ORIENTATION_NORMAL -> bitmap
            else -> bitmap
        }
        return rotatedBitmap
    }

    private fun rotateImage(source: Bitmap, angle: Float): Bitmap {
        val matrix = Matrix()
        matrix.postRotate(angle)
        return Bitmap.createBitmap(source, 0, 0, source.width, source.height,
                matrix, true)
    }

    fun getResizedBitmap(bitmapImage: Bitmap?, bitmapWidth: Int, bitmapHeight: Int): Bitmap? {
// int mHeight = (int) (bitmapImage.getHeight() * (512.0 / bitmapImage.getWidth()));
// return Bitmap.createBitmap(bitmapWidth,bitmapHeight,Bitmap.Config.ARGB_8888);
        return Bitmap.createScaledBitmap(bitmapImage!!, bitmapWidth, bitmapHeight, true)
    }



}