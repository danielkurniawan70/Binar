package com.android.binar.data

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.android.binar.common.Constant

class PreferenceHelper(app: Application) {
    private val sp: SharedPreferences by lazy {
        app.getSharedPreferences("my_binar_app", Context.MODE_PRIVATE)
    }
    private val spe: SharedPreferences.Editor by lazy {
        sp.edit()
    }

    //Kotlin Style
    var nama: String
        set(value) {
            spe.putString(Constant.NAMA, value).apply()
        }
        get() = sp.getString(Constant.NAMA, "") ?:""
    var email: String
        set(value) {
            spe.putString(Constant.EMAIL, value).apply()
        }
        get() = sp.getString(Constant.EMAIL, "") ?:""
    var organization: String
        set(value) {
            spe.putString(Constant.ORGANIZATION, value).apply()
        }
        get() = sp.getString(Constant.ORGANIZATION, "") ?:""
    var password: String
        set(value) {
            spe.putString(Constant.PASSWORD, value).apply()
        }
        get() = sp.getString(Constant.PASSWORD, "") ?:""

    var login: Boolean
        set(value) {
            spe.putBoolean(Constant.LOGIN, value).apply()
        }
        get() = sp.getBoolean(Constant.LOGIN, false)
}