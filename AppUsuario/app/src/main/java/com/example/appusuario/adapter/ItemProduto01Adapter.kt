package com.example.appusuario.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appusuario.R
import com.example.appusuario.model.Produto01

class ItemProduto01Adapter(
    private val context: Context,
    private val dataset: List<Produto01>
) : RecyclerView.Adapter<ItemProduto01Adapter.ItemProduto01ViewHolder>() {
    class ItemProduto01ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.card_layout_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemProduto01ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemProduto01ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}