package com.android.binar.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.binar.BinarApp
import com.android.binar.R
import kotlinx.android.synthetic.main.activity_frontpage.*

class FrontPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frontpage)

        if(BinarApp.sp.login)  {
            val l = Intent(this, MainActivity::class.java)
            startActivity(l)

            finish()
        }

        initLogin()

        testPref()

    }


    private fun testPref() {
        /*val sp:PreferenceHelper= BinarApp.sp*/

        //Java Style
        /*sp.putString(Constant.NAMA, "daniel")
        sp.putString(Constant.ORGANIZATION, "danielkurniawan__")
        sp.putString(Constant.EMAIL, "pacman1770@gmail.com")

        val nama:String = sp.getString(Constant.NAMA)
        val ig:String = sp.getString(Constant.ORGANIZATION)
        val email:String = sp.getString(Constant.EMAIL)*/

        /*Kotlin Style
                to Save Data*/
        /*sp.nama="Daniel"
        sp.ig="danielkurniawan__"
        sp.email="pacman1770@gmail.com"
*/
        /*to read or get data from SP, ex : ${sp.nama}*/
        /*println("Nama: ${sp.nama}")
        println("Instagram: ${sp.ig}")
        println("E-Mail: ${sp.email}")*/
    }


    private fun initLogin() {
        btnLogin.setOnClickListener {
            val l = Intent(this, FormLogin::class.java)
            startActivity(l)

        }

        btnRegister.setOnClickListener {
            val r = Intent(this, FormRegister::class.java)
            startActivity(r)
        }
    }


    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
