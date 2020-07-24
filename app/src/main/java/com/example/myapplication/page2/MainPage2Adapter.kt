package com.example.myapplication.page2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.page1.GridDecoration
import com.example.myapplication.page1.innerList4Adapter
import com.example.myapplication.page1.list4Model
import kotlin.math.roundToInt

class MainPage2Adapter(private val modelList:List<ModelPage2>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        when(modelList[position].type){
            0->return 0
            1->return 1
            else->return -1
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            0->{
                var searchbar :View= LayoutInflater.from(parent.context).inflate(R.layout.page2_search_layout,parent,false)
                return SearchBar(searchbar)
            }
            1->{
                var recyclerViewList :View= LayoutInflater.from(parent.context).inflate(R.layout.rv_list_page2,parent,false)
                return RecyclerViewList(recyclerViewList)
            }
            else->{
                var searchbar :View= LayoutInflater.from(parent.context).inflate(R.layout.page2_search_layout,parent,false)
                return SearchBar(searchbar)
            }
        }
    }

    override fun getItemCount(): Int {
        return  modelList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(modelList[position].type){
            0->{
                (holder as SearchBar).bindItems()
            }
            1->{
                (holder as RecyclerViewList).bindItems(modelList[position].rvlist)
            }
        }
    }



    class SearchBar(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(){

        }

    }

    class RecyclerViewList(itemView:View):RecyclerView.ViewHolder(itemView){
        private val rvgrid = itemView.findViewById(R.id.page2rv) as RecyclerView
        fun bindItems(rvlist:List<list4Model>){
            val rvLayoutManager = GridLayoutManager(rvgrid.context,2)


            rvgrid.apply {
                layoutManager=rvLayoutManager
                adapter= innerList4Adapter(rvlist)
                addItemDecoration(
                    GridDecoration(
                        2,
                        (12 * resources.displayMetrics.density).roundToInt(),
                        true
                    )
                )
            }

        }

    }
}