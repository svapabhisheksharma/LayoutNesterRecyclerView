package com.example.myapplication.page1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlin.math.roundToInt

class MainAdapter(private val modelList:List<ModelClass>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        when(modelList[position].itemType){
            0->return 0
            1->return 1
            2->return 2
            3->return 3
            4->return 4
            5->return 5
            6->return 6
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
                var rvhorizLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout1,parent,false)
                return RVlist1layout(rvhorizLayout)
            }
            3->{
                var rvvertLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout1,parent,false)
                return RVlist2layout(rvvertLayout)
            }
            4->{
                var rvhomecooksLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout,parent,false)
                return RVlist3layout(rvhomecooksLayout)
            }
            5->{
                var rvtoppicksLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.parent_recyclerview_layout,parent,false)
                return RVlist4layout(rvtoppicksLayout)
            }
            6->{
                var isloatedLayout :View = LayoutInflater.from(parent.context).inflate(R.layout.isolated_card,parent,false)
                return IsolatedCardLayout(isloatedLayout)
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
                        val viewholder = holder as RVlist1layout
                        viewholder.setRVdata(8)
            }
            3->{
                val viewholder = holder as RVlist2layout
                viewholder.setRVdata(modelList[position].getlist2())
            }
            4->{
                val viewholder = holder as RVlist3layout
                viewholder.setRVdata("Home-Cooks",8)
            }
            5->{
                val viewholder = holder as RVlist4layout
                viewholder.setRVdata("Top Picks For You",modelList[position].getlist4())
            }
            6->{
                val viewholder = holder as IsolatedCardLayout
                viewholder.bindItems()
            }
            else->return
        }

    }

    class IsolatedCardLayout(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(){

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
    class RVlist1layout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val rvHorizontal = itemView.findViewById(R.id.recyclerView1) as RecyclerView

        fun setRVdata(listSize:Int){

            val rvLayoutManager =LinearLayoutManager(rvHorizontal.context,LinearLayoutManager.HORIZONTAL,false)


            rvHorizontal.apply {
                layoutManager=rvLayoutManager
                adapter= innerList1Adapter(listSize)
            }


        }

    }
    class RVlist2layout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val rvVert = itemView.findViewById(R.id.recyclerView1) as RecyclerView

        fun setRVdata(list:List<list2Model>){

            val rvLayoutManager =LinearLayoutManager(rvVert.context,LinearLayoutManager.HORIZONTAL,false)


            rvVert.apply {
                layoutManager=rvLayoutManager
                adapter= innerList2Adapter(list)
            }


        }

    }
    class RVlist3layout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val textviewTitle = itemView.findViewById(R.id.rvtitle) as TextView
        private val rvVert = itemView.findViewById(R.id.rv) as RecyclerView

        fun setRVdata(title:String,listSize:Int){
            textviewTitle.text=title

            val rvLayoutManager =LinearLayoutManager(rvVert.context,LinearLayoutManager.HORIZONTAL,false)


            rvVert.apply {
                layoutManager=rvLayoutManager
                adapter= innerList3Adapter(listSize)
            }


        }

    }
    class RVlist4layout(itemView:View):RecyclerView.ViewHolder(itemView){

        private val textviewTitle = itemView.findViewById(R.id.rvtitle) as TextView
        private val rvgrid = itemView.findViewById(R.id.rv) as RecyclerView

        fun setRVdata(title:String,list:List<list4Model>){
            textviewTitle.text=title


            val rvLayoutManager =GridLayoutManager(rvgrid.context,2)


            rvgrid.apply {
                layoutManager=rvLayoutManager
                adapter= innerList4Adapter(list)
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