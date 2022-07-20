package com.example.appusuario.data

import com.example.appusuario.R
import com.example.appusuario.model.Produto01

// #2
class Datasource {
    //#3
    fun loadProduto01(): List<Produto01> {
        // #4
        return listOf<Produto01>(
            Produto01(R.string.titulo1, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo2, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo3, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo4, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo5, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo6, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo7, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo8, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo9, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
            Produto01(R.string.titulo10, R.drawable.ic_baseline_image_24, R.id.item_card_layout_description_categ1, R.id.item_card_layout_adress_categ1),
        )
    }
}