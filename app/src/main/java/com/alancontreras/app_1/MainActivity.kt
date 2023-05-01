package com.alancontreras.app_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSaludo = findViewById<Button>(R.id.btnSaludo)
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)


        //val lambda: (View) -> Unit = {Log.d("LOGTAG", "Hola mundo")}

        //btnSaludo.setOnClickListener(lambda)
        btnSaludo.setOnClickListener{
            Log.d("LOGTAG","Hola Mundo")
            tvSaludo.text = "Hola mundo"
        }

        tvSaludo.setOnClickListener{
            tvSaludo.text ="Hola Alan"
        }

    }
}