package com.example.proyectofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectofinal.adapters.LibroSectionAdapter
import com.example.proyectofinal.models.LibroSection
import com.example.proyectofinal.repository.LibroRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapterLibroSection: LibroSectionAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dataLibroSectionRepository = LibroRepository()
        var libroSectionArray = dataLibroSectionRepository.getAllLibroSection(this)

        adapterLibroSection = LibroSectionAdapter(this, libroSectionArray)
        list_secciones.adapter = adapterLibroSection

        list_secciones.setOnItemClickListener { adapterView, view, index, l ->

            val intent = Intent(this, Detail_LibroActivity::class.java)
            intent.putExtra("nombre",libroSectionArray.get(index).name)
            intent.putExtra("urlImagelibro",libroSectionArray.get(index).urlImagelibro)
            intent.putExtra("contenido",libroSectionArray.get(index).contenido)
            intent.putExtra("urlImagelibro1",libroSectionArray.get(index).urlImagelibro1)
            intent.putExtra("urlImagelibro2",libroSectionArray.get(index).urlImagelibro2)
            intent.putExtra("urlImagelibro3",libroSectionArray.get(index).urlImagelibro3)
            intent.putExtra("urlImagelibro4",libroSectionArray.get(index).urlImagelibro4)
            intent.putExtra("urlImagelibro5",libroSectionArray.get(index).urlImagelibro5)
            intent.putExtra("urlImagelibro6",libroSectionArray.get(index).urlImagelibro6)
            intent.putExtra("urlImagelibro7",libroSectionArray.get(index).urlImagelibro7)
            intent.putExtra("urlImagelibro8",libroSectionArray.get(index).urlImagelibro8)
            intent.putExtra("urlImagelibro9",libroSectionArray.get(index).urlImagelibro9)
            intent.putExtra("urlImagelibro10",libroSectionArray.get(index).urlImagelibro10)
            intent.putExtra("urlImagelibro11",libroSectionArray.get(index).urlImagelibro11)






            startActivity(intent)


        }
    }
}