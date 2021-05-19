package com.tenysson.ocean_android_introducao_18_05_2021

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val extraInfo = intent.getStringExtra("EXTRA_INFO")

        var tvInfo = findViewById<TextView>(R.id.tvInfo)
        tvInfo.text = extraInfo

        val btOk =  findViewById<Button>(R.id.btOk)
        val btCancel =  findViewById<Button>(R.id.btCancel)

        btOk.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("DETAILS_RESULT", "Info na DetailsActivity")
            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }

        btCancel.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }
    }
}