package com.example.afwgwef

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.plain_text_input)
        val buttonComenzar = findViewById<Button>(R.id.button)


        buttonComenzar.doAfterTextChanged() {
            if (editText.toString().length() > 4 ){
                buttonComenzar.setEnabled(true);
            }else{
                buttonComenzar.setEnabled(false)
            }

            buttonComenzar.setOnClickListener(){
                val intent = Intent(this, MainActivity2.class)
                        startActivity(intent)
            }

            }
        }

    }


private operator fun Unit.compareTo(i: Int) {}

private fun String.length() {}
