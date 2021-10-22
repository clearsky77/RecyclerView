package com.clearsky77.recyclerview.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.clearsky77.recyclerview.R
import com.clearsky77.recyclerview.datas.ProfileData

class ProfileAdapter(val profileList: ArrayList<ProfileData>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): ProfileAdapter.CustomViewHolder {
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
    }

    class CustomViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val gender = itemView.findViewById<ImageView>(R.id.profileImg)
        val name = itemView.findViewById<ImageView>(R.id.nameTxt)
        val age = itemView.findViewById<ImageView>(R.id.ageTxt)
        val job = itemView.findViewById<ImageView>(R.id.jobTxt)
    }
}