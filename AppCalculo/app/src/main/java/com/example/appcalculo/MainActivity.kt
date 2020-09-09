package com.example.appcalculo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verificarResposta(componente:View){
        Toast.makeText(this, "teste", Toast.LENGTH_SHORT).show()

        resposta.visibility = View.VISIBLE

        val pets = ed_pets.text.toString().toInt()
        val numeroInteiro = ed_campo1.text.toString().toInt()
        val valor = ed_campo2.text.toString()

        if (numeroInteiro <= 0){
            ed_campo1.hint = "Valor invalido"
            campo_1.setTextColor(Color.RED)
        }

        if (pets == 0){
            
        }
    }
}