package com.example.proyectofinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.proyectofinal.utils.showImageWhitProgresBar
import kotlinx.android.synthetic.main.activity_detail_libro.*


class Detail_LibroActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_libro)



        val bundle = intent.extras
        val nombreLibro = bundle?.get("nombre").toString()
        val contenido = bundle?.get("contenido").toString()
        val urlImagelibro = bundle?.get("urlImagelibro").toString()
        val urlImagelibro1 = bundle?.get("urlImagelibro1").toString()
        val urlImagelibro2 = bundle?.get("urlImagelibro2").toString()
        val urlImagelibro3 = bundle?.get("urlImagelibro3").toString()
        val urlImagelibro4 = bundle?.get("urlImagelibro4").toString()
        val urlImagelibro5 = bundle?.get("urlImagelibro5").toString()
        val urlImagelibro6 = bundle?.get("urlImagelibro6").toString()
        val urlImagelibro7 = bundle?.get("urlImagelibro7").toString()
        val urlImagelibro8 = bundle?.get("urlImagelibro8").toString()
        val urlImagelibro9 = bundle?.get("urlImagelibro9").toString()
        val urlImagelibro10 = bundle?.get("urlImagelibro10").toString()
        val urlImagelibro11 = bundle?.get("urlImagelibro11").toString()




        contenido_libro.text= contenido
        titulo_libro.text = nombreLibro


        Glide.with(this).load(urlImagelibro).into(imglibro)
        Glide.with(this).load(urlImagelibro1).into(imglibro1)
        Glide.with(this).load(urlImagelibro2).into(imglibro2)
        Glide.with(this).load(urlImagelibro3).into(imglibro3)
        Glide.with(this).load(urlImagelibro4).into(imglibro4)
        Glide.with(this).load(urlImagelibro5).into(imglibro5)
        Glide.with(this).load(urlImagelibro6).into(imglibro6)
        Glide.with(this).load(urlImagelibro7).into(imglibro7)
        Glide.with(this).load(urlImagelibro8).into(imglibro8)
        Glide.with(this).load(urlImagelibro9).into(imglibro9)
        Glide.with(this).load(urlImagelibro10).into(imglibr10)
        Glide.with(this).load(urlImagelibro11).into(imglibro11)






    }

}