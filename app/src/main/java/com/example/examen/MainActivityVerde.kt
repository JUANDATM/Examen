package com.example.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_verde.*

class MainActivityVerde : AppCompatActivity() {

    companion object {
        var P : Double = 0.0
        var N : String = ""
        val ENTRA_APROBADO = "aprobado"
        private val DEFAULT_DOUBLE: Double = -1.0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_verde)
        val recibir = intent
        P = recibir.getDoubleExtra(ENTRA_APROBADO,DEFAULT_DOUBLE)
        N = recibir.getStringExtra("nombre")
        tvRespuesta1.setText(N+"Tu Promedio es de:" +P.toString()+"Aprobaste")

    }
}
