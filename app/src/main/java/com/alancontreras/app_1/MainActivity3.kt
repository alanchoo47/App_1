package com.alancontreras.app_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    private lateinit var tvSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tvSaludo = findViewById<TextView>(R.id.tvSaludo)
    }

    fun miClick(view: View) {
        when(view.id){
            R.id.tvSaludo -> {3
                tvSaludo.text = "Hola Alan"
            }
            R.id.btnSaludo-> {
                tvSaludo.text = "Hola mundo"
            }
        }
    }
}