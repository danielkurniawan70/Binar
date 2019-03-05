package com.android.binar.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.android.binar.BinarApp
import com.android.binar.R
import com.android.binar.adapter.AndroidAdapter
import com.android.binar.common.toast
import com.android.binar.model.AndroidType
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val androidList = mutableListOf<AndroidType>()
    private val androidAdapter = AndroidAdapter(androidList, this::onItemClick, this::onLongClick)
    private fun onLongClick(androidType: AndroidType) {
        toast("(Long Click)Anda memilih Android ${androidType.codename}")
    }

    private fun onItemClick(androidType: AndroidType) {
        toast("Anda memilih Android : ${androidType.codename}")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvList.layoutManager = LinearLayoutManager(this)
        rvList.adapter = androidAdapter

        initData()

        androidAdapter.notifyDataSetChanged()

    }


    private fun initData() {
        androidList.add(AndroidType("Pie", 9.0, 28))
        androidList.add(AndroidType("Oreo", 8.1, 27))
        androidList.add(AndroidType("Oreo", 8.0, 26))
        androidList.add(AndroidType("Nougat", 7.1, 25))
        androidList.add(AndroidType("Nougat", 7.0, 24))
        androidList.add(AndroidType("Marshmallow", 6.0, 23))
        androidList.add(AndroidType("Lollipop", 5.0, 21))
        androidList.add(AndroidType("Jelly Bean", 4.3, 18))
        androidList.add(AndroidType("Jelly Bean", 4.2, 17))
        androidList.add(AndroidType("Jelly Bean", 4.1, 16))
        androidList.add(AndroidType("Ice Cream Sandwich", 4.0, 15))
        androidList.add(AndroidType("Ice Cream Sandwich", 4.0, 14))
        androidList.add(AndroidType("Honeycomb", 3.2, 13))
        androidList.add(AndroidType("Honeycomb", 3.1, 12))
        androidList.add(AndroidType("Honeycomb", 3.0, 11))
        androidList.add(AndroidType("Gingerbread", 2.3, 10))
        androidList.add(AndroidType("Gingerbread", 2.3, 9))
        androidList.add(AndroidType("Froyo", 2.2, 8))
        androidList.add(AndroidType("Eclair", 2.1, 7))
        androidList.add(AndroidType("Eclair", 2.0, 6))
        androidList.add(AndroidType("Eclair", 2.0, 5))
        androidList.add(AndroidType("Donut", 1.6, 4))
        androidList.add(AndroidType("Cupcake", 1.5, 3))
        androidList.add(AndroidType("Beta", 1.1, 2))
        androidList.add(AndroidType("Alpha", 1.0, 1))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_logout, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId==R.id.menuLogout){

            BinarApp.sp.login=false

            val i = Intent(this, FrontPage::class.java)
            startActivity(i)

            finish()


        }

        return super.onOptionsItemSelected(item)
    }
}
