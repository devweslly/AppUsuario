package com.example.appusuario.data

import com.example.appusuario.R
import com.example.appusuario.model.Produto01

// #2
class Datasource {
    //#3
    fun loadProduto01(): List<Produto01> {
        // #4
        return listOf<Produto01>(
            Produto01(
                stringResourceId = "Produto 01",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 01"
            ),
            Produto01(
                stringResourceId = "Produto 02",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 02"
            ),
            Produto01(
                stringResourceId = "Produto 03",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 03"
            ),
            Produto01(
                stringResourceId = "Produto 04",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 04"
            ),
            Produto01(
                stringResourceId = "Produto 05",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 05"
            ),
            Produto01(
                stringResourceId = "Produto 06",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 06"
            ),
            Produto01(
                stringResourceId = "Produto 07",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 07"
            ),
            Produto01(
                stringResourceId = "Produto 08",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 08"
            ),
            Produto01(
                stringResourceId = "Produto 09",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 09"
            ),
            Produto01(
                stringResourceId = "Produto 10",
                imageResourceId = R.drawable.ic_baseline_image_24,
                descriptionResourceId = "Produto XPTO",
                adressResourceId = "Endereço 10"
            ),
        )
    }
}