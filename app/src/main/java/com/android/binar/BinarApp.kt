package com.android.binar

import android.app.Application
import com.android.binar.data.PreferenceHelper

class BinarApp : Application() {

    companion object {
        lateinit var sp: PreferenceHelper
    }

    override fun onCreate() {
        super.onCreate()
        sp = PreferenceHelper(this)
    }
}