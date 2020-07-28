package com.example.myapplication.page3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.page1.list4Model

class innerrvfoodtraypage3(private val list:List<list4Model>) : RecyclerView.Adapter<innerrvfoodtraypage3.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list4_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position].imageResource)
    }


    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        private val image = itemView.findViewById(R.id.imageView5) as ImageView
        fun bindItems(imageResource:Int){
            image.setImageResource(imageResource)
        }
    }

}



class innerrvmealreviewpage3(private val listSize:Int) : RecyclerView.Adapter<innerrvmealreviewpage3.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.review_tile_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listSize
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems()
    }


    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        // private val textView = itemView.findViewById(R.id.rvtitle) as TextView
        fun bindItems(){
            //textView.visibility = View.GONE
        }
    }

}