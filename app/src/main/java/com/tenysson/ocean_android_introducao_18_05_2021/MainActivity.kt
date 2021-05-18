package com.tenysson.ocean_android_introducao_18_05_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

        val tvName = this.findViewById<TextView>(R.id.tvName)
        val btSend = this.findViewById<Button>(R.id.btSend)
        val etName = this.findViewById<EditText>(R.id.etName)

        btSend.setOnClickListener {
            val nome = etName.text.toString()
            if(etName.text.isNotBlank()){
                tvName.text = nome
            }else {
                etName.error = getString(R.string.insert_a_valid_name)
            }
            //savedInstanceState.toString() para salvar dados
        }
    }
}