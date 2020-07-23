package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.solver.widgets.ConstraintWidget.GONE
import androidx.recyclerview.widget.RecyclerView

class innerList1Adapter(private val listSize:Int) : RecyclerView.Adapter<innerList1Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list1_layout,parent,false)
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

class innerList2Adapter(private val list:List<list2Model>) : RecyclerView.Adapter<innerList2Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list2_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position].heading,list[position].imageResource)
    }


    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        private val title = itemView.findViewById(R.id.list2_heading) as TextView
        private val image = itemView.findViewById(R.id.list2_image) as ImageView

        fun bindItems(name:String,imageResource:Int){
            title.text = name
            image.setImageResource(imageResource)
        }
    }

}

class innerList3Adapter(private val listSize:Int) : RecyclerView.Adapter<innerList3Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list3_layout,parent,false)
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

class innerList4Adapter(private val list:List<list4Model>) : RecyclerView.Adapter<innerList4Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.list4_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position].imageResource)
    }


    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        private val image = itemView.findViewById(R.id.imageView5) as ImageView
        fun bindItems(imageResource:Int){
            image.setImageResource(imageResource)
        }
    }

}