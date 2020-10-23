package com.example.sportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio_sesion.*

class InicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)

        iniciosesion2.setOnClickListener{
            openOpciones()
        }
    }

    fun openOpciones(){
        val intent = Intent(this, Opciones::class.java)
        startActivity(intent)
    }
}