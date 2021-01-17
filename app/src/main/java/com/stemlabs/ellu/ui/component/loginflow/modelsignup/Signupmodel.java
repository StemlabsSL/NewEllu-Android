
package com.stemlabs.ellu.ui.component.loginflow.modelsignup;


import com.google.gson.annotations.SerializedName;


public class Signupmodel {

    @SerializedName("data")
    private ForgotData mData;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("success")
    private Boolean mSuccess;

    public ForgotData getData() {
        return mData;
    }

    public void setData(ForgotData data) {
        mData = data;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public Boolean getSuccess() {
        return mSuccess;
    }

    public void setSuccess(Boolean success) {
        mSuccess = success;
    }

}
