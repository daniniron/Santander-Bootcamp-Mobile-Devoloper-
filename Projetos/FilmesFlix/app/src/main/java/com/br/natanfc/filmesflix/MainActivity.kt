package com.br.natanfc.filmesflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val listOfMovies = arrayListOf(
        Movie(
            id = 0,
            titulo = "titanic",
            descricao = null,
            imagem = null,
            dataLancamento = null
        ),
        Movie(
            id = 0,
            titulo = "Central do Brasil",
            descricao = null,
            imagem = null,
            dataLancamento = null
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun populateList() {
        movieesList.apply{

        }
    }
}