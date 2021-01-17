package com.stemlabs.ellu.data

import android.content.Context
import com.stemlabs.ellu.data.preference.LabelManager
import com.stemlabs.ellu.data.preference.SessionManager

class RepoModel(context: Context) {

    var pref: SessionManager = SessionManager(context)
    var labelPref: LabelManager = LabelManager(context)
    //var api = ApiService.create(pref)
}