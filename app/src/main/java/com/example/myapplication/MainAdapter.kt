package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val modelList:List<ModelClass>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        when(modelList[position].itemType){
            0->return 0
            1->return 1
            2->return 2
            3->return 3
            4->return 4
            5->return 5
            else->return -1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        when(viewType){
            0->{
                var headerLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.header_layout,parent,false)
                return HeaderLayout(headerLayout)
            }
            1->{
                var popularLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.popular_layout,parent,false)
                return PopularLayout(popularLayout)
            }
            2->{
                var rvhorizLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout,parent,false)
                return RVhorizLayout(rvhorizLayout)
            }
            3->{
                var rvvertLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout,parent,false)
                return RVvertLayout(rvvertLayout)
            }
            4->{
                var rvhomecooksLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout,parent,false)
                return RVvertLayout(rvhomecooksLayout)
            }
            5->{
                var rvtoppicksLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout,parent,false)
                return RVgridLayout(rvtoppicksLayout)
            }
            else->{
                var elseLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.popular_layout,parent,false)
                return PopularLayout(elseLayout)
            }
        }
    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(modelList[position].itemType){
            0->{
                val viewholder = holder as HeaderLayout
                viewholder.setHeaderData(modelList[position].getCity(),modelList[position].getAdress())
            }
            1->{
                val viewHolder =holder as PopularLayout
                viewHolder.setPopularData(modelList[position].getPopular())
            }
            2->{
                        val viewholder = holder as RVhorizLayout
                        viewholder.setRVdata("",modelList[position].getList())
            }
            3->{
                val viewholder = holder as RVvertLayout
                viewholder.setRVdata("",modelList[position].getList())
            }
            4->{
                val viewholder = holder as RVvertLayout
                viewholder.setRVdata("Home-Cooks",modelList[position].getList())
            }
            5->{
                val viewholder = holder as RVgridLayout
                viewholder.setRVdata("Top Picks For You",modelList[position].getList())
            }
            else->return
        }

    }

    class HeaderLayout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val textViewCity = itemView.findViewById(R.id.city_name) as TextView
        private val textViewAddress = itemView.findViewById(R.id.address) as TextView

        fun setHeaderData(city:String,address:String){
            textViewCity.text=city
            textViewAddress.text=address
        }

    }
    class PopularLayout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val textViewPopular = itemView.findViewById(R.id.popular) as TextView

        fun setPopularData(popular:String){
            textViewPopular.text=popular
        }

    }
    class RVhorizLayout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val textviewTitle = itemView.findViewById(R.id.rvtitle) as TextView
        private val rvHorizontal = itemView.findViewById(R.id.rv) as RecyclerView

        fun setRVdata(title:String,list:List<String>){
            textviewTitle.text=title

            val rvLayoutManager =LinearLayoutManager(rvHorizontal.context,LinearLayoutManager.HORIZONTAL,false)

            rvLayoutManager.initialPrefetchItemCount=4

            rvHorizontal.apply {
                layoutManager=rvLayoutManager
                adapter=innerRecyclerViewAdapterHorizontal(list)
            }


        }

    }
    class RVvertLayout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val textviewTitle = itemView.findViewById(R.id.rvtitle) as TextView
        private val rvVert = itemView.findViewById(R.id.rv) as RecyclerView

        fun setRVdata(title:String,list:List<String>){
            textviewTitle.text=title

            val rvLayoutManager =LinearLayoutManager(rvVert.context,LinearLayoutManager.HORIZONTAL,false)

            rvLayoutManager.initialPrefetchItemCount=4

            rvVert.apply {
                layoutManager=rvLayoutManager
                adapter=innerRecyclerViewAdapterVertical(list)
            }


        }

    }
    class RVgridLayout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val textviewTitle = itemView.findViewById(R.id.rvtitle) as TextView
        private val rvgrid = itemView.findViewById(R.id.rv) as RecyclerView

        fun setRVdata(title:String,list:List<String>){
            textviewTitle.text=title

            val rvLayoutManager =GridLayoutManager(rvgrid.context,2)

            rvLayoutManager.initialPrefetchItemCount=4

            rvgrid.apply {
                layoutManager=rvLayoutManager
                adapter=innerRecyclerViewAdapterVertical(list)
            }


        }

    }

}