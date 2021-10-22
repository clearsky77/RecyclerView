package com.clearsky77.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clearsky77.recyclerview.datas.ProfileData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            // 임시 데이터 입력
            ProfileData(R.drawable.woman, "냥냐루", 6, "식방굽기 달인"),
            ProfileData(R.drawable.man, "냐냐루", 1, "아깽이"),
            ProfileData(R.drawable.woman, "냥냐냥", 2, "솜펀치 전문가"),
            ProfileData(R.drawable.man, "리터봇", 5, "AI 집사"),
            ProfileData(R.drawable.man, "김갑갑", 41, "행인 1"),
            ProfileData(R.drawable.woman, "김갑을", 51, "행인 2"),
            ProfileData(R.drawable.man, "김갑병", 31, "행인 3"),
            ProfileData(R.drawable.man, "김갑정", 11, "행인 4"),
            ProfileData(R.drawable.woman, "김을갑", 51, "행인 5"),
            ProfileData(R.drawable.man, "김을을", 71, "행인 6"),
            ProfileData(R.drawable.woman, "김을병", 61, "행인 7"),
            ProfileData(R.drawable.woman, "김을정", 31, "행인 8"),
            ProfileData(R.drawable.woman, "김병갑", 19, "행인 9"),
            ProfileData(R.drawable.woman, "김병을", 25, "행인 10"),
            ProfileData(R.drawable.man, "김병병", 38, "행인 11"),
            ProfileData(R.drawable.man, "김병정", 66, "행인 12"),
            ProfileData(R.drawable.man, "김병정", 66, "행인 12")
        )
    }
}