package com.example.appsencilla

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView
    private lateinit var txtApellido : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        txtApellido = findViewById(R.id.txtApellido)

        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")
        val apellido = intent.getStringExtra("APELLIDO")

        //Construimos el mensaje a mostrar
        txtSaludo.text = "Hola $saludo "
    }
}