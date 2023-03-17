package com.lars.biblialars.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.lars.biblialars.ListAntiguo
import com.lars.biblialars.R

class ListAntiguoViewHolder (view:View):RecyclerView.ViewHolder(view) {

    val antiguoTesta = view.findViewById<TextView>(R.id.tvNombreLibro)

    fun render(listAntiguoModel: ListAntiguo){
        antiguoTesta.text = listAntiguoModel.libroAntiguo
    }
}