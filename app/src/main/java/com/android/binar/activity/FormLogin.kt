package com.android.binar.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.android.binar.BinarApp
import com.android.binar.R
import com.android.binar.common.toast
import kotlinx.android.synthetic.main.activity_formlogin.*

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formlogin)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setTitle("Login")
        login()


    }

    private fun login() {
        btnUserLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email == BinarApp.sp.email && password == BinarApp.sp.password) {
                BinarApp.sp.login = true
                startActivity(Intent(this, MainActivity::class.java))

                finish()
            } else {

                toast("Login Gagal! Username atau Password yang anda masukkan salah")
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId==android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

}