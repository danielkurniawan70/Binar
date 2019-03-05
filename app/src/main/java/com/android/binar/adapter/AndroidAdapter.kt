package com.android.binar.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.binar.R
import com.android.binar.model.AndroidType
import kotlinx.android.synthetic.main.item_android.view.*

class AndroidAdapter(
    private val androidList: List<AndroidType>,
    private val onClick: (android: AndroidType) -> Unit,
    private val onLongClick: (android: AndroidType) -> Unit
) : RecyclerView.Adapter<AndroidAdapter.Holder>() {

    override fun onCreateViewHolder(group: ViewGroup, type: Int): Holder {
        val layoutInflater = LayoutInflater.from(group.context)
        val view: View = layoutInflater.inflate(R.layout.item_android, group, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = androidList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val android = androidList[position]
        holder.bind(android)
        holder.itemView.run {
            setOnClickListener {
                onClick(android)
            }
            setOnLongClickListener {
                onLongClick(android)
                return@setOnLongClickListener false
            }
        }
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(android: AndroidType) = itemView.run {
            tvAndroid.text = android.codename
            tvVersion.text = "Android "+android.version.toString()
            tvAPI.text ="API "+android.API.toString()
        }
    }

}