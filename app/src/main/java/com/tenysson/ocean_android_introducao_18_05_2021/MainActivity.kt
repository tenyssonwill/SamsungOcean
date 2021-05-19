package com.tenysson.ocean_android_introducao_18_05_2021

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object{
        const val NEW_SCREEN_REQUEST_CODE = 1
        const val EXTRA_INFO = "EXTRA_INFO"
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == NEW_SCREEN_REQUEST_CODE){
            val tvResults = findViewById<TextView>(R.id.tvResults)
            if(resultCode == Activity.RESULT_OK){
                tvResults.text = data?.getStringExtra(DetailsActivity.DETAILS_RESULT)

            }else if(resultCode == Activity.RESULT_CANCELED){
                tvResults.text = getString(R.string.action_cancelled)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        InitForm()

        val btSendAnotherScreen = findViewById<Button>(R.id.btSendToAnotherScreen)
        val tvResults = this.findViewById<TextView>(R.id.tvResults)

        btSendAnotherScreen.setOnClickListener {
            // Chamada Normal
//            val newScreenIntent = Intent(this, DetailsActivity::class.java)
//            newScreenIntent.putExtra("EXTRA_INFO", tvResults.text.toString())
//            startActivity(newScreenIntent)

            // Chamada Para Volta
              val newScreenIntent = Intent(this, DetailsActivity::class.java)
              newScreenIntent.putExtra(EXTRA_INFO, tvResults.text.toString())
              startActivityForResult(newScreenIntent, NEW_SCREEN_REQUEST_CODE)

//            // Call
//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:988013435")
//            startActivity(intent)

//            SMS
//            val number = 988013435
        //    intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:988013435")
//            startActivity(intent)
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