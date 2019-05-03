package com.example.emma.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class AdaptadorCustom(items:ArrayList<Persoa>):RecyclerView.Adapter<AdaptadorCustom.ViewHolder>(){

     var items:ArrayList<Persoa>? = null
    var viewHolder:ViewHolder? = null

    init {
        this.items = items
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdaptadorCustom.ViewHolder {
        //AQUI MATCHEAMOS LA INFORMACIÓN CON EL TEMPLATE
        //CREAMOS LA VISTA CON EL PATRON DE DISEÑO QUE SE ENCUENTRA EN ViewHolder
        val vista = LayoutInflater.from(p0?.context).inflate(R.layout.plantilla,p0,false)
        viewHolder = ViewHolder(vista)
        return viewHolder!!
    }

    override fun getItemCount(): Int {
        //RETORNAMOS EL NUMERO DE ELEMENTOS QUE TIENE LA LISTA DE DATOS
        return this.items?.count()!!
    }

    override fun onBindViewHolder(holder: AdaptadorCustom.ViewHolder, p1: Int) {
        val item = items?.get(p1)
        holder.nombre?.text= item?.nombre
        holder.foto?.setImageResource(item?.foto!!)
    }

    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista)
    {
        var vista = vista //variable vista con referencia a vista
        var foto:ImageView? = null
        var nombre:TextView? = null

        init {
            foto = vista.findViewById(R.id.fotoId)
            nombre = vista.findViewById(R.id.tv1)
        }
    }
}
