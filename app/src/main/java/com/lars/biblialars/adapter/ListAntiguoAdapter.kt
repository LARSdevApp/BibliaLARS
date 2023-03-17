package com.lars.biblialars.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.lars.biblialars.ListAntiguo
import com.lars.biblialars.R

class ListAntiguoAdapter (private val librosAntiguoTestamento: List<ListAntiguo>) : RecyclerView.Adapter<ListAntiguoViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListAntiguoViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        return ListAntiguoViewHolder(layoutInflater.inflate(R.layout.item_layout_libros, p0,false))
    }

    override fun onBindViewHolder(p0: ListAntiguoViewHolder, p1: Int) {
        val item = librosAntiguoTestamento[p1]
        p0.render(item)
    }

    override fun getItemCount(): Int {
        return librosAntiguoTestamento.size
    }
}