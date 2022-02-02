package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val textInput = findViewById<EditText>(R.id.editTextTextPersonName)

        button.setOnClickListener{
            if(textInput.text.isNotEmpty()){
                textView.text = textInput.text
            }else{
                textInput.error = "Insira o texto"
            }
        }
    }
}