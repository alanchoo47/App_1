package com.alancontreras.app_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView




class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSaludo:Button
    private lateinit var  tvSaludo:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnSaludo = findViewById<Button>(R.id.btnSaludo)
        tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        btnSaludo.setOnClickListener(this)
        tvSaludo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnSaludo -> {
                tvSaludo.text = "Hola mundo"

            }
            R.id.tvSaludo -> {
                tvSaludo.text = "Hola Alan"
            }
        }
    }
}