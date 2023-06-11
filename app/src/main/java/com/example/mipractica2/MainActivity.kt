package com.example.mipractica2
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter:ArrayAdapter<*>

        val listview = findViewById<ListView>(R.id.listView)
        val planetas = arrayOf("Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno")
        val dato = arrayOf ("es el primer planeta", "es el numero dos", "es nuestro planeta", "es conocido como planeta rojo", "es precedido por el sol", "tiene anillos", " esta formado por helio", " es compuesto de roca fundida")

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, planetas);


        listview.adapter = arrayAdapter


            listview.setOnItemClickListener { adapterView, view, position , id ->

               val planetasseleccionado = planetas[position]
                val datoseleccionado = dato.get(position)
                val mensaje: String = planetasseleccionado + ": " + datoseleccionado
                Toast.makeText(this, mensaje , Toast.LENGTH_LONG).show()
        }





    }
}


