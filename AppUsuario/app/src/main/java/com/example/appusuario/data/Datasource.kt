package com.example.appusuario.data

import com.example.appusuario.R
import com.example.appusuario.model.Produto01

// #2
class Datasource {
    //#3
    fun loadProduto01(): List<Produto01> {
        // #4
        return listOf<Produto01>(
            Produto01(R.string.titulo1),
            Produto01(R.string.titulo2),
            Produto01(R.string.titulo3),
            Produto01(R.string.titulo4),
            Produto01(R.string.titulo5),
            Produto01(R.string.titulo6),
            Produto01(R.string.titulo7),
            Produto01(R.string.titulo8),
            Produto01(R.string.titulo9),
            Produto01(R.string.titulo10),
        )
    }
}