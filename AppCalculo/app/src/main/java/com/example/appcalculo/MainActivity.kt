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
        Toast.makeText(this, "analisado", Toast.LENGTH_SHORT).show()

        val pets = ed_pets.text.toString().toInt()
        val moradores = ed_campo1.text.toString().toInt()
        val salario = ed_campo2.text.toString().toInt()
        val custoPets = pets * 200
        var aluguel = 1000
        val valorFinal = salario - (custoPets + aluguel)

        if (moradores <= 0){
            ed_campo1.hint = "Valor invalido"
            campo_1.setTextColor(Color.RED)
        } else {
            if (valorFinal <= 200){
                resposta.visibility = View.VISIBLE
                resposta.text = "Vai sobrar ${valorFinal} para a comida"
                resposta.setTextColor(Color.RED)
            }
            if (valorFinal <= 400){
                resposta.visibility = View.VISIBLE
                resposta.text = "Vai sobrar ${valorFinal} para a comida é pra um agrado"
                resposta.setTextColor(Color.YELLOW)
            }
            if (valorFinal < 400){
                resposta.visibility = View.VISIBLE
                resposta.text = "Sobro ${valorFinal}, Da para a comida é ir pra festas final de semana"
                resposta.setTextColor(Color.GREEN)
            }
        }

    }
}