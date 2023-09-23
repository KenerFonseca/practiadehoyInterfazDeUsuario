package com.example.practiadehoyinterfazdeusuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSeleccionados = findViewById<TextView>(R.id.txtSeleccionados)
        val res = findViewById<CheckBox>(R.id.ch2)
        val bar = findViewById<CheckBox>(R.id.ch3)
        val vida = findViewById<CheckBox>(R.id.ch4)
        val com = findViewById<CheckBox>(R.id.ch5)


    }
}