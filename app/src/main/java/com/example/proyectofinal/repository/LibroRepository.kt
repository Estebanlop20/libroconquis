package com.example.proyectofinal.repository

import android.content.Context
import com.example.proyectofinal.models.LibroSection
import com.example.proyectofinal.utils.readJSON
import org.json.JSONObject

class LibroRepository {

    fun getAllLibroSection(context: Context): ArrayList<LibroSection> {
        val libroSectionObject = JSONObject(readJSON(context, "sectionlibro.json"))
        return parseSectionLibroJsonToResult(libroSectionObject)
    }

    private fun parseSectionLibroJsonToResult(libroSectionObject: JSONObject): ArrayList<LibroSection> {
        val libroSectionJsonArray = libroSectionObject.getJSONArray("sectionlibro")
        val responseLibroSectionList: ArrayList<LibroSection> = ArrayList()

        for (index in 0 until libroSectionJsonArray.length()) {
            val libroSectionObject_ = libroSectionJsonArray[index] as JSONObject
            val id: String = libroSectionObject_.getString("id")
            val name: String = libroSectionObject_.getString("nombre")
            val urlImage: String = libroSectionObject_.getString("urlImage")
            val contenido: String = libroSectionObject_.getString("contenido")
            val urlImagelibro: String = libroSectionObject_.getString("urlImagelibro")
            val urlImagelibro1: String = libroSectionObject_.getString("urlImagelibro1")
            val urlImagelibro2: String = libroSectionObject_.getString("urlImagelibro2")
            val urlImagelibro3: String = libroSectionObject_.getString("urlImagelibro3")
            val urlImagelibro4: String = libroSectionObject_.getString("urlImagelibro4")
            val urlImagelibro5: String = libroSectionObject_.getString("urlImagelibro5")
            val urlImagelibro6: String = libroSectionObject_.getString("urlImagelibro6")
            val urlImagelibro7: String = libroSectionObject_.getString("urlImagelibro7")
            val urlImagelibro8: String = libroSectionObject_.getString("urlImagelibro8")
            val urlImagelibro9: String = libroSectionObject_.getString("urlImagelibro9")
            val urlImagelibro10: String = libroSectionObject_.getString("urlImagelibro10")
            val urlImagelibro11: String = libroSectionObject_.getString("urlImagelibro11")

            val libroSection_ = LibroSection(id, name, urlImage, contenido,urlImagelibro,urlImagelibro1,urlImagelibro2,urlImagelibro3,urlImagelibro4,urlImagelibro5,urlImagelibro6,urlImagelibro7,urlImagelibro8,urlImagelibro9,urlImagelibro10,urlImagelibro11)
            responseLibroSectionList.add(libroSection_)
        }
        return responseLibroSectionList
    }

}