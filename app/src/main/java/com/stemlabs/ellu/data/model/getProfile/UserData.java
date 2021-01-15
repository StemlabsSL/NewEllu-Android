
package com.stemlabs.ellu.data.model.getProfile;


import com.google.gson.annotations.SerializedName;


public class UserData {

    @SerializedName("avatar")
    private String mAvatar;
    @SerializedName("createdAt")
    private String mCreatedAt;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @SerializedName("deviceId")
    private String mDeviceId;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("latitude")
    private Long mLatitude;
    @SerializedName("loggedIn")
    private Boolean mLoggedIn;
    @SerializedName("longitude")
    private Long mLongitude;
    @SerializedName("name")
    private String mName;
    @SerializedName("phone")
    private String mPhone;
    @SerializedName("dob")
    private String dob;
    @SerializedName("statusMessage")
    private String status;
    @SerializedName("updatedAt")
    private String mUpdatedAt;
    @SerializedName("_id")
    private String m_id;

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getDeviceId() {
        return mDeviceId;
    }

    public void setDeviceId(String deviceId) {
        mDeviceId = deviceId;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Long getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Long latitude) {
        mLatitude = latitude;
    }

    public Boolean getLoggedIn() {
        return mLoggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        mLoggedIn = loggedIn;
    }

    public Long getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Long longitude) {
        mLongitude = longitude;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public String get_id() {
        return m_id;
    }

    public void set_id(String _id) {
        m_id = _id;
    }

}
