package com.example.myapplication.page3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.page1.GridDecoration
import com.example.myapplication.page1.innerList4Adapter
import com.example.myapplication.page1.list4Model
import kotlin.math.roundToInt

class AdapterPage3 (var modelList:List<Model3>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    override fun getItemViewType(position: Int): Int {
        when(modelList[position].itemType){
            0->return 0
            1->return 1
            2->return 2
            3->return 3
            else->return -1
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            0-> {
                var detailsLayout =LayoutInflater.from(parent.context).inflate(R.layout.food_details_layout,parent,false)
                return detailsHolder(detailsLayout)
            }
            1-> {
                var nameAndReviewLayout =LayoutInflater.from(parent.context).inflate(R.layout.resto_name_layout,parent,false)
                return nameAndReviewHolder(nameAndReviewLayout)
            }
            2-> {
                var foodTrayLayout =LayoutInflater.from(parent.context).inflate(R.layout.page3_rv_inner,parent,false)
                return foodTrayHolder(foodTrayLayout)
            }
            3-> {
                var reviewLayout =LayoutInflater.from(parent.context).inflate(R.layout.page3_rv_inner,parent,false)
                return reviewHolder(reviewLayout)
            }
            else->{
                var nameAndReviewLayout =LayoutInflater.from(parent.context).inflate(R.layout.resto_name_layout,parent,false)
                return nameAndReviewHolder(nameAndReviewLayout)
            }
        }
    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(modelList[position].itemType){
            0->(holder as detailsHolder).bindItems()
            1->(holder as nameAndReviewHolder).bindItems()
            2->(holder as foodTrayHolder).bindItems(modelList[position].list,"Food Trays")
            3->(holder as reviewHolder).bindItems(modelList[position].listSize,"Meal Reviews")
        }
    }



    class detailsHolder( itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(){

        }
    }

    class nameAndReviewHolder( itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindItems(){

        }
    }

    class foodTrayHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById(R.id.titleinnerrv3) as TextView
        private val rvgrid = itemView.findViewById(R.id.mealreviewrv) as RecyclerView
        fun bindItems(rvlist:List<list4Model>,foodtray:String){
            val rvLayoutManager = GridLayoutManager(rvgrid.context,2)
            title.text= foodtray


            rvgrid.apply {
                layoutManager=rvLayoutManager
                adapter= innerrvfoodtraypage3(rvlist)
                addItemDecoration(
                    GridDecoration(
                        2,
                        (10 * resources.displayMetrics.density).roundToInt(),
                        true
                    )
                )
            }

        }
    }

    class reviewHolder( itemView: View):RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById(R.id.titleinnerrv3) as TextView
        private val rv = itemView.findViewById(R.id.mealreviewrv) as RecyclerView
        fun bindItems(listSize:Int,review:String){

            val rvLayoutManager = LinearLayoutManager(rv.context,LinearLayoutManager.VERTICAL,false)
            val adapter1 = innerrvmealreviewpage3(listSize)
            title.text=review

            rv.apply {
                layoutManager=rvLayoutManager
                adapter=adapter1
            }
        }
    }

}