package com.example.appusuario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appusuario.adapter.ItemProduto01Adapter
import com.example.appusuario.data.Datasource

class ListProdCategActivity01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_prod_categ01)

        // Inicializa os dados.
        val myDataset = Datasource().loadProduto01()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_produto01)

        // Use esta configuração para melhorar o desempenho se você souber que as alterações
        // no conteúdo não altera o tamanho do layout do RecyclerView
        recyclerView.adapter = ItemProduto01Adapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

    }
}