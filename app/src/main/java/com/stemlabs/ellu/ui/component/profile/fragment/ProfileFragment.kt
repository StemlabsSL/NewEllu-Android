package com.stemlabs.ellu.ui.component.profile.fragment

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.bumptech.glide.Glide
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.getProfile.GetProfileResponse
import com.stemlabs.ellu.data.model.request.ApiRequest
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog
import com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog
import com.stemlabs.ellu.ui.component.profile.fragment.presenter.ProfileFragmentPresenter
import com.stemlabs.ellu.ui.component.profile.fragment.view.ProfileFragmentView
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.FrequentUtils
import com.stemlabs.ellu.utils.GlobalMethods
import com.stemlabs.ellu.utils.SharedPref
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.io.File
import java.util.*


class ProfileFragment : BaseFragment(), View.OnClickListener, DatePickerDialog.OnDateSetListener, ProfileFragmentView {

    lateinit var dialogPhotoSelection: ProfilePhotoSelectionDialog
    lateinit var userNameDialog: AlarmNameDialog
    lateinit var userStatusDialog: AlarmNameDialog

    lateinit var mPresenter: ProfileFragmentPresenter

    lateinit var mContext: Context

    var file: File? = null

    var userid = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        userid = SharedPref.getInstance(mContext).getString(Constants.USER_ID)
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.getWindow()?.setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        initView()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    private fun initView() {
        mPresenter = ProfileFragmentPresenter(mContext, this)
        val request = ApiRequest()
        request.userId = userid
        mPresenter.getProfile(request)
        dialogPhotoSelection = ProfilePhotoSelectionDialog("profile")
        frameUserProfilePicture.setOnClickListener(this)
        imgDateOfBirthEdit.setOnClickListener(this)
        imgNameEdit.setOnClickListener(this)
        imgStatusMessageEdit.setOnClickListener(this)
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Profile"
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgDateOfBirthEdit -> {
                openDatePicker()
            }

            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }

            R.id.imgNameEdit -> {
                userNameDialog = AlarmNameDialog("profilename", tvName.text.toString())


                if (userNameDialog != null && userNameDialog!!.isAdded()) {
                    return;
                }
                userNameDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                userNameDialog!!.setRedeemListener(object : AlarmNameDialog.OnClickSet {
                    override fun setClickSet(name: String) {
                        FrequentUtils.hideSoftKeyBoard(mContext as Activity)
                        if (name.isNotEmpty()) {
                            tvName.text = name
                            var request = ApiRequest()
                            request.name = name
                            updateProfile(request)
                        }
                    }
                })
            }
            R.id.imgStatusMessageEdit -> {
                userStatusDialog = AlarmNameDialog("profilestatus", tvStatusMessage.text.toString())

                if (userStatusDialog != null && userStatusDialog!!.isAdded()) {
                    return;
                }
                userStatusDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                userStatusDialog!!.setRedeemListener(object : AlarmNameDialog.OnClickSet {
                    override fun setClickSet(name: String) {
                        FrequentUtils.hideSoftKeyBoard(mContext as Activity)

                        tvStatusMessage.text = name
                        var request = ApiRequest()
                        request.status = name
                        updateProfile(request)

                    }
                })
            }
            R.id.frameUserProfilePicture -> {
                if (dialogPhotoSelection != null && dialogPhotoSelection!!.isAdded()) {
                    return;
                }
                dialogPhotoSelection!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                dialogPhotoSelection!!.setPhotoSelectionListener(object : ProfilePhotoSelectionDialog.OnClickSetProfilePhoto {


                    override fun setRemovePhotoClick() {
                        val request = ApiRequest();
                        request.remove_pic = "0"
                        updatImage(request)
//                        updateProfile(request)
                        imgUserProfilePicture.setImageResource(R.drawable.ic_profile_ring_avtar)
                    }

                    override fun set(filepath: String?) {
                        val bitmap: Bitmap = BitmapFactory.decodeFile(filepath)
                        val newBitMap: Bitmap = FrequentUtils.changeImageOrientation(filepath, bitmap)!!
                        val resizedBitMap: Bitmap? = FrequentUtils.getResizedBitmap(newBitMap, 500, 700)
                        val newImage: File = FrequentUtils.createFileFromBitMap(resizedBitMap!!)!!
                        file = newImage
                      //  file = File(filepath)
                        Glide.with(context!!).load(File(filepath)).into(imgUserProfilePicture)
                        val request = ApiRequest();
                        request.remove_pic = "1"
//                        updateProfile(request)
                        updatImage(request)

                    }
                })

            }
        }
    }

    private fun openDatePicker() {
        val now = Calendar.getInstance()
        val dpd =
                DatePickerDialog.newInstance(
                        this@ProfileFragment as DatePickerDialog.OnDateSetListener?, now
                )

        dpd.maxDate = now

        /* run {
             var loopdate: Calendar = startCalender
             while (startCalender.before(endCalender)) {
                 val dayOfWeek = loopdate[Calendar.DAY_OF_WEEK]
                 if (payload!!.time_slots.contains(getDay(dayOfWeek))) {
                     val disabledDays = arrayOfNulls<Calendar>(1)
                     disabledDays[0] = loopdate
                     dpd.setDisabledDays(disabledDays)
                 }
                 startCalender.add(Calendar.DATE, 1)
                 loopdate = startCalender
             }
         }*/
        dpd.setOnCancelListener { Log.d("DatePicker", "Dialog was cancelled") }
        dpd.show(baseActivity!!.fragmentManager, "Datepickerdialog")
    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        var date_selected: String
        date_selected = if (monthOfYear == 10 || monthOfYear == 11 || monthOfYear == 9) {
            if (dayOfMonth < 10) {
                year.toString() + "-" + (monthOfYear + 1) + "-0" + dayOfMonth
            } else {
                year.toString() + "-" + (monthOfYear + 1) + "-" + dayOfMonth
            }
        } else {
            if (dayOfMonth < 10) {
                year.toString() + "-" + "0" + (monthOfYear + 1) + "-" + "0" + dayOfMonth
            } else {
                year.toString() + "-" + "0" + (monthOfYear + 1) + "-" + dayOfMonth
            }
        }
        var apidate = date_selected
        date_selected = GlobalMethods.changeDateForDateFormat(date_selected)
        tvDateOfBirth.setText("" + date_selected)
        Log.e("date_selected ", "date_selected===$date_selected")
        var request = ApiRequest()
        request.dob = date_selected
        updateProfile(request)

    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onSuccessfullyGetProfile(response: GetProfileResponse) {
        setData(response)
    }

    override fun onSuccessfullyUpdateProfile(response: GetProfileResponse) {
        tvName.text = response.data.name ?: ""
        tvDateOfBirth.text = response.data.dob ?: ""
        tvPhoneNumber.text = response.data.phone ?: ""
        tvStatusMessage.text = response.data.status ?: ""
        file = null
        // FrequentUtils.LoadImage(imgUserProfilePicture,response.data.avatar)
    }

    override fun showMessage(message: String) {
        showBaseToast(rootView, message)
    }

    override fun hideProgressBar() {
        hideBaseProgressDialog()
    }

    override fun showProgressBar(message: String) {
        showBaseProgressDialog(mContext, message)
    }

    fun setData(response: GetProfileResponse) {

        if (response.data != null) {
            tvName.text = response.data.name ?: ""
            tvDateOfBirth.text = response.data.dob ?: ""
            tvPhoneNumber.text = response.data.phone ?: ""
            tvStatusMessage.text = response.data.status ?: ""
            file = null
            FrequentUtils.LoadImage(imgUserProfilePicture, response.data.avatar)
        }

    }

    fun updateProfile(request: ApiRequest) {
        request.userId = userid
        mPresenter.updateProfile(request, file)
    }
    fun updatImage(request: ApiRequest){
        request.userId = userid
        mPresenter.updateProfileImage(request, file)
    }
}