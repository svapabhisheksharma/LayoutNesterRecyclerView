package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class innerRecyclerViewAdapterHorizontal(val list:List<String>) : RecyclerView.Adapter<innerRecyclerViewAdapterHorizontal.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.card_horizontal,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }


    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(name:String){
            val title = itemView.findViewById(R.id.horizontalTitle) as TextView
            title.text = name
        }
    }

}

class innerRecyclerViewAdapterVertical(val list:List<String>) : RecyclerView.Adapter<innerRecyclerViewAdapterVertical.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.card_vertical,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }


    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(name:String){
            val title = itemView.findViewById(R.id.titleVertical) as TextView
            title.text = name
        }
    }

}