package com.example.myapplication.filterpage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class FilterAdapter (val list: List<MainModelFilterPage>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemViewType(position: Int): Int {
        when(list[position].itemType){
            0->return 0
            1->return 1
            2->return 2
            else->return -1
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            0->{
               val v = LayoutInflater.from(parent.context).inflate(R.layout.textheading_filter,parent,false)
                return HeaderLayout(v)
            }
            1->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.innerrvrow,parent,false)
                return RVLayoutFilter(v)
            }
            2->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.filter_header,parent,false)
                return TopLayout(v)
            }
            else->{
            val v = LayoutInflater.from(parent.context).inflate(R.layout.innerrvrow,parent,false)
            return HeaderLayout(v)
        }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)){
            0->{
                val vhtitle = holder as HeaderLayout
                vhtitle.titleView.text = list[position].title
            }
            1->{
                val vhcheckbox = holder as RVLayoutFilter
                vhcheckbox.checkBox.text = list[position].title
                vhcheckbox.checkBox.isChecked = list[position].checked
                vhcheckbox.checkBox.setOnClickListener {
                    val newcheck = !list[position].checked
                    vhcheckbox.checkBox.isChecked=newcheck
                    list[position].checked = newcheck
                    notifyDataSetChanged()
                }

            }
            2-> (holder as TopLayout).bindItems()
        }

    }

    class HeaderLayout(itemView:View):RecyclerView.ViewHolder(itemView){
        val titleView = itemView.findViewById<TextView>(R.id.filter_title_header)
    }

    class RVLayoutFilter(itemView:View):RecyclerView.ViewHolder(itemView){
        val checkBox = itemView.findViewById<CheckBox>(R.id.checkBox)
    }

    class TopLayout(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindItems(){}
    }

}