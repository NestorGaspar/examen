package com.example.afwgwef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val boton1 = findViewById<Button>(R.id.button2)
        val boton2 = findViewById<Button>(R.id.button3)
        val boton3 = findViewById<Button>(R.id.button4)

        boton1.setOnClickListener() {

        }
        boton2.setOnClickListener(){

        }
        boton3.setOnClickListener(){

        }

    }
}