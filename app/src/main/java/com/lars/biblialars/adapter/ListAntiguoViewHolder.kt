package com.lars.biblialars.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lars.biblialars.ListAntiguo
import com.lars.biblialars.R

class ListAntiguoViewHolder (view:View): RecyclerView.ViewHolder(view) {

    val antiguoTesta = view.findViewById<TextView>(R.id.tvNombreLibro)

    fun render(listAntiguoModel: ListAntiguo){
        antiguoTesta.text = listAntiguoModel.libroAntiguo
    }
}