
package com.stemlabs.ellu.data.model.getProfile;

import com.google.gson.annotations.SerializedName;


public class GetProfileResponse {

    @SerializedName("data")
    private UserData mData;
    @SerializedName("success")
    private Boolean mSuccess;

    public UserData getData() {
        return mData;
    }

    public void setData(UserData data) {
        mData = data;
    }

    public Boolean getSuccess() {
        return mSuccess;
    }

    public void setSuccess(Boolean success) {
        mSuccess = success;
    }

}
