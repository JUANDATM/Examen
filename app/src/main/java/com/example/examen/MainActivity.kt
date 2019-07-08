package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var Cal1: Double = 0.0
    var Cal2: Double = 0.0
    var Cal3: Double = 0.0
    var Cal4: Double = 0.0
    var Promedio: Double = 0.0
    var Nombre: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calular(v: View) {
        if (etNoControl.text.isEmpty() or etNombre.text.isEmpty() or etCal1.text.isEmpty() or etCal2.text.isEmpty() or etCal3.text.isEmpty() or etCal4.text.isEmpty() ) {
            Toast.makeText(this, "Faltan Datos", Toast.LENGTH_LONG).show()
            etNoControl.requestFocus()
        } else {
            Cal1 = etCal1.text.toString().toDouble()
            Cal2 = etCal2.text.toString().toDouble()
            Cal3 = etCal3.text.toString().toDouble()
            Cal4 = etCal4.text.toString().toDouble()
            Nombre = etNombre.text.toString()
            Promedio = (Cal1 + Cal2 + Cal3 + Cal4) / 4.0
            when {
                Promedio >= 70-> {
                    val intent = Intent(this, MainActivityVerde::class.java)
                    intent.putExtra(MainActivityVerde.ENTRA_APROBADO, Promedio)
                    intent.putExtra("nombre",Nombre)
                    startActivity(intent)

                }
                Promedio < 70 -> {
                    val intent = Intent(this, MainActivityRojo::class.java)
                    intent.putExtra(MainActivityRojo.ENTRA_REPROBADO, Promedio)
                    startActivity(intent)
                }
            }
        }


    }
}
