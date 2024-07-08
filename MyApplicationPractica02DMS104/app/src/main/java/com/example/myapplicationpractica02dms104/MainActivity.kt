package com.example.myapplicationpractica02dms104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
lateinit var operador1 : EditText
lateinit var operador2 : EditText
lateinit var enviar : Button
lateinit var resultado: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operador1 = findViewById(R.id.TxtOperador1)
        operador2 = findViewById(R.id.TxtOperador2)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LlbResultado)
        enviar.setOnClickListener{
            val num1= operador1.text.toString().toFloat()
            val num2= operador2.text.toString().toFloat()
            val operacion = num1 + num2
            resultado.text = operacion.toString()
        }
    }
}