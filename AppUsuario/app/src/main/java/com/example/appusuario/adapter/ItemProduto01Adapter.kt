package com.example.appusuario.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appusuario.R
import com.example.appusuario.model.Produto01

/*
 * Adapter para o [RecyclerView] in [ListProdCategActivity01]. Exibe [Produto01] data object.
 */
class ItemProduto01Adapter(
    private val context: Context,
    private val dataset: List<Produto01>
) : RecyclerView.Adapter<ItemProduto01Adapter.ItemProduto01ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Produto01 object.
    class ItemProduto01ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.card_layout_title)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    // # 7
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemProduto01ViewHolder {
        // cria uma nova view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout_produto01, parent, false)

        return ItemProduto01ViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    // # 8
    override fun onBindViewHolder(holder: ItemProduto01ViewHolder, position: Int) {
        val itemProduto01 = dataset[position]
        holder.textView.text = context.resources.getString(itemProduto01.stringResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {
        return dataset.size
    }
}