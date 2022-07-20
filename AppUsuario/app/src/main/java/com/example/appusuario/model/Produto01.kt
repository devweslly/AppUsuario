package com.example.appusuario.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// # 1
data class Produto01(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val descriptionResourceId: Int,
    val adressResourceId: Int
) {
}