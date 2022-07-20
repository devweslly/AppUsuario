package com.example.appusuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appusuario.adapter.ItemProduto01Adapter
import com.example.appusuario.data.Datasource
import com.example.appusuario.databinding.ActivityListProdCateg01Binding

private lateinit var binding: ActivityListProdCateg01Binding

class ListProdCategActivity01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListProdCateg01Binding.inflate(layoutInflater)

        setContentView(binding.root)

        // Inicializa os dados.
        val myDataset = Datasource().loadProduto01()


        //Configurando o RecyclerView

        // Use esta configuração para melhorar o desempenho se você souber que as alterações
        // no conteúdo não altera o tamanho do layout do RecyclerView

        val adapter = ItemProduto01Adapter(this, myDataset)

        binding.recyclerViewProduto01.adapter = adapter
        binding.recyclerViewProduto01.setHasFixedSize(true)
    }
}