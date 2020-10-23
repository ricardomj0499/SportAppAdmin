package com.example.sportapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    //private val button: Button = TODO()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciosesion1.setOnClickListener {
            openInicioSesion()
        }
        registrarse1.setOnClickListener {
            openRegistro()
        }
    }
    fun openInicioSesion() {
        val intent = Intent(this, InicioSesion::class.java)
        startActivity(intent)
    }
    fun openRegistro() {
        val intent = Intent(this, Registro::class.java)
        startActivity(intent)
    }
}