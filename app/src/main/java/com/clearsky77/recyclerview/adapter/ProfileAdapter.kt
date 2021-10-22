package com.clearsky77.recyclerview.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.clearsky77.recyclerview.datas.ProfileData

class ProfileAdapter(val profileList: ArrayList<ProfileData>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter.CustomViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class CustomViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {

    }
}