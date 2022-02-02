package com.example.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val textInput = findViewById<EditText>(R.id.etPersonName)

        button.setOnClickListener{
            if(textInput.text.isNotBlank()){
                textView.text = textInput.text.toString()
            }else{
                textInput.error = "Insira o texto"
            }
        }

        val btAbrirNovaTela = findViewById<Button>(R.id.btAbrirNovaTela)

        btAbrirNovaTela.setOnClickListener {
            // Abrir nova tela
            // Criar intent
            val intentAbrirNovaTela = Intent(this, ResultadoActivity::class.java)

            intentAbrirNovaTela.putExtra("NOME_DIGITADO", textInput.text.toString())

            // Registrar intent
            startActivity(intentAbrirNovaTela)
        }
    }
}