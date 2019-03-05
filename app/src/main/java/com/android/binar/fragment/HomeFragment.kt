/*
package com.android.hola.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.android.hola.R
import com.android.hola.adapter.AndroidAdapter
import com.android.hola.common.toast
import com.android.hola.model.AndroidType
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.item_android.*


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val androidList = mutableListOf<AndroidType>()
    private val androidAdapter = AndroidAdapter(androidList, this::onItemClick, this::onLongClick)

    private fun onLongClick(androidType: AndroidType) {
        toast("Long Click : Anda memilih Android ${androidType.codename}")
    }

    private fun onItemClick(androidType: AndroidType) {
        toast("Click : ${androidType.codename}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        */
/*getAndroid()*//*


    }

    private fun setupView() = view?.run {
        rvAndroid?.layoutManager = LinearLayoutManager(context)
        rvAndroid?.adapter = androidAdapter
    }



    private fun getAndroid() {

            val androidType = AndroidType("Android $tvAndroid", "Version $tvVersion"toString)
            androidList.add(androidType)

        androidAdapter.notifyDataSetChanged()
    }


}
*/
