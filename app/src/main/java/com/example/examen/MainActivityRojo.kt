package com.example.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_rojo.*

class MainActivityRojo : AppCompatActivity() {
    companion object {
        var P : Double = 0.0
        var N : String = ""
        val ENTRA_REPROBADO = "Reprobado"
        private val DEFAULT_DOUBLE: Double = -1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_rojo)
        val recibir = intent
        P = recibir.getDoubleExtra(ENTRA_REPROBADO,DEFAULT_DOUBLE)
        tvRespuesta1.setText("Tu Promedio es de: " +P.toString()+"  Reprobaste")
    }
}
