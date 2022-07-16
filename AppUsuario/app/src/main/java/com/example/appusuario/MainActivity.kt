package com.example.appusuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appusuario.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        // Chamada dos métodos: Ação de click cardView
        irListProdCateg01()
        irListProdCateg02()
        irListProdCateg03()
        irListProdCateg04()
        irListProdCateg05()
        irListProdCateg06()
        irListProdCateg07()
        irListProdCateg08()
        irListProdCateg09()
        irListProdCateg10()
        irListProdCateg11()

        // Chamada dos métodos: Ação de click banner
        irListProdBanner01()
        irListProdBanner02()
        irListProdBanner03()

        setContentView(binding.root)
    }

    /*
        * Métodos: Ir para ListProdCategActivity
        * onClickListener dos cardViews da horizontalScrollView_tela_inicio
    */
    // cardView 01
    private fun irListProdCateg01() {
        binding.cardViewCategoria01TelaInicio.setOnClickListener {
            val listProdCateg01 = Intent(this, ListProdCategActivity01::class.java)
            startActivity(listProdCateg01)
        }
    }

    // cardView 02
    private fun irListProdCateg02() {
        binding.cardViewCategoria02TelaInicio.setOnClickListener {
            val listProdCateg02 = Intent(this, ListProdCategActivity02::class.java)
            startActivity(listProdCateg02)
        }
    }

    // cardView 03
    private fun irListProdCateg03() {
        binding.cardViewCategoria03TelaInicio.setOnClickListener {
            val listProdCateg03 = Intent(this, ListProdCategActivity03::class.java)
            startActivity(listProdCateg03)
        }
    }

    // cardView 04
    private fun irListProdCateg04() {
        binding.cardViewCategoria04TelaInicio.setOnClickListener {
            val listProdCateg04 = Intent(this, ListProdCategActivity04::class.java)
            startActivity(listProdCateg04)
        }
    }

    // cardView 05
    private fun irListProdCateg05() {
        binding.cardViewCategoria05TelaInicio.setOnClickListener {
            val listProdCateg05 = Intent(this, ListProdCategActivity05::class.java)
            startActivity(listProdCateg05)
        }
    }

    // cardView 06
    private fun irListProdCateg06() {
        binding.cardViewCategoria06TelaInicio.setOnClickListener {
            val listProdCateg06 = Intent(this, ListProdCategActivity06::class.java)
            startActivity(listProdCateg06)
        }
    }

    // cardView 07
    private fun irListProdCateg07() {
        binding.cardViewCategoria07TelaInicio.setOnClickListener {
            val listProdCateg07 = Intent(this, ListProdCategActivity07::class.java)
            startActivity(listProdCateg07)
        }
    }

    // cardView 08
    private fun irListProdCateg08() {
        binding.cardViewCategoria08TelaInicio.setOnClickListener {
            val listProdCateg08 = Intent(this, ListProdCategActivity08::class.java)
            startActivity(listProdCateg08)
        }
    }

    // cardView 09
    private fun irListProdCateg09() {
        binding.cardViewCategoria09TelaInicio.setOnClickListener {
            val listProdCateg09 = Intent(this, ListProdCategActivity09::class.java)
            startActivity(listProdCateg09)
        }
    }

    // cardView 10
    private fun irListProdCateg10() {
        binding.cardViewCategoria10TelaInicio.setOnClickListener {
            val listProdCateg10 = Intent(this, ListProdCategActivity10::class.java)
            startActivity(listProdCateg10)
        }
    }

    // cardView 11
    private fun irListProdCateg11() {
        binding.cardViewCategoria11TelaInicio.setOnClickListener {
            val listProdCateg11 = Intent(this, ListProdCategActivity11::class.java)
            startActivity(listProdCateg11)
        }
    }

    /*
        * Métodos: Ir para ListProdBannerActivity
        * onClickListener dos Banners
    */
    // banner 01
    private fun irListProdBanner01(){
        binding.banner1TelaInicio.setOnClickListener {
            val listProdBanner01 = Intent(this, ListProdBannerActivity01::class.java)
            startActivity(listProdBanner01)
        }
    }

    // banner 02
    private fun irListProdBanner02(){
        binding.banner2TelaInicio.setOnClickListener {
            val listProdBanner02 = Intent(this, ListProdBannerActivity02::class.java)
            startActivity(listProdBanner02)
        }
    }

    // banner 03
    private fun irListProdBanner03(){
        binding.banner3TelaInicio.setOnClickListener {
            val listProdBanner03 = Intent(this, ListProdBannerActivity03::class.java)
            startActivity(listProdBanner03)
        }
    }
}