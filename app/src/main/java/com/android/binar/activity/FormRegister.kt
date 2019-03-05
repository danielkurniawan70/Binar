package com.android.binar.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.android.binar.BinarApp
import com.android.binar.R
import com.android.binar.common.toast
import kotlinx.android.synthetic.main.activity_formregister.*

class FormRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formregister)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setTitle("Register")
        setupUser()
    }

    private fun setupUser() {
        btnUserRegister.setOnClickListener {

            val fullname = etFullname.text
            val email = etEmail.text
            val organization = etUniversity.text
            val password = etPassword.text

            if (fullname.isEmpty()) {
                toast("Fullname Cannot Empty")
            } else if (email.isEmpty()) {
                toast("Email Cannot Empty")
            } else if (organization.isEmpty()) {
                toast("Organization Cannot Empty")
            } else if (password.isEmpty()) {
                toast("Password Cannot Empty")
            } else {
                if (etPassword.text.toString() == etConfirmation.text.toString()) {

                    BinarApp.sp.nama = etFullname.text.toString()
                    BinarApp.sp.email = etEmail.text.toString()
                    BinarApp.sp.organization = etUniversity.text.toString()
                    BinarApp.sp.password = etPassword.text.toString()

                    val l = Intent(this, FormLogin::class.java)
                    startActivity(l)

                    //destroy
                    finish()

                } else {
                    toast("Password Mismatch")
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}