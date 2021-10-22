package com.clearsky77.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.clearsky77.recyclerview.R
import com.clearsky77.recyclerview.datas.ProfileData

class ProfileAdapter(val profileList: ArrayList<ProfileData>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{

    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): ProfileAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return profileList.size // 크기가 얼마인지 알려주기
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        holder.gender.setImageResource(profileList.get(position).gender) // ???????? 어떻게 남녀구분한다는 거야?
        holder.name.text = profileList.get(position).name
        holder.age.text = profileList.get(position).age.toString()
        holder.job.text = profileList.get(position).job
    }

    class CustomViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val gender = itemView.findViewById<ImageView>(R.id.profileImg)
        val name = itemView.findViewById<TextView>(R.id.nameTxt)
        val age = itemView.findViewById<TextView>(R.id.ageTxt)
        val job = itemView.findViewById<TextView>(R.id.jobTxt)
    }
}