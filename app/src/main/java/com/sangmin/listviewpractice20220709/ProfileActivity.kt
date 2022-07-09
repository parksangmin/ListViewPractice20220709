package com.sangmin.listviewpractice20220709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra("name")
        val birthYear = intent.getIntExtra("birthYear", 0)
        val address = intent.getStringExtra("address")

        nameTxt.text = name
        ageTxt.text = birthYear.toString()
        addressTxt.text = address



    }
}