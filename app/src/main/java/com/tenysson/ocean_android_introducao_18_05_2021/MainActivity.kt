package com.tenysson.ocean_android_introducao_18_05_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        InitForm()

        val btSendAnotherScreen = findViewById<Button>(R.id.btSendToAnotherScreen)

        btSendAnotherScreen.setOnClickListener {
            val newScreenIntent = Intent(this, DetailsActivity::class.java)
            startActivity(newScreenIntent)
        }
    }

    private fun InitForm() {
        val tvResults = this.findViewById<TextView>(R.id.tvResults)
        val btSend = this.findViewById<Button>(R.id.btSend)
        val etName = this.findViewById<EditText>(R.id.etName)
        val etFamilyName = this.findViewById<EditText>(R.id.etFamilyName)
        val etAge = this.findViewById<EditText>(R.id.etAge)


        btSend.setOnClickListener {
            val isNameValid = etName.text.isNotBlank()
            val isFamilyNameValid = etFamilyName.text.isNotBlank()
            val isAgeValid = etAge.text.isNotBlank()


            if (!isNameValid) {
                etName.error = getString(R.string.insert_a_valid_name)
            }

            if (!isFamilyNameValid) {
                etFamilyName.error = getString(R.string.insert_a_valid_familyname)
            }

            if (!isAgeValid) {
                etAge.error = getString(R.string.insert_a_valid_age)
            }

            if (isNameValid && isFamilyNameValid && isAgeValid) {
                tvResults.text =
                    getString(R.string.result_text, etName.text, etFamilyName.text, etAge.text)
            }

        }
    }
}