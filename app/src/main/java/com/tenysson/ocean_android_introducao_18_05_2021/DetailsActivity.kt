package com.tenysson.ocean_android_introducao_18_05_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val extraInfo = intent.getStringExtra("EXTRA_INFO")
        var tvInfo = findViewById<TextView>(R.id.tvInfo)
        tvInfo.text = extraInfo
    }
}