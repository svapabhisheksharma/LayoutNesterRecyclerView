package com.example.myapplication.filterpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class FilterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerviewfilterpage)

        var listtype  = ArrayList<checkboxItem>()
        listtype.add(checkboxItem("Food",false))
        listtype.add(checkboxItem("Food",false))

        var listmealtype  = ArrayList<checkboxItem>()
        listmealtype.add(checkboxItem("Bulk Meals",false))
        listmealtype.add(checkboxItem("Bulk Meals",false))
        listmealtype.add(checkboxItem("Bulk Meals",false))
        listmealtype.add(checkboxItem("Bulk Meals",false))
        listmealtype.add(checkboxItem("Bulk Meals",false))
        listmealtype.add(checkboxItem("Bulk Meals",false))
        listmealtype.add(checkboxItem("Bulk Meals",false))
        listmealtype.add(checkboxItem("Bulk Meals",false))

        var listcusinetype  = ArrayList<checkboxItem>()
        listcusinetype.add(checkboxItem("American",false))
        listcusinetype.add(checkboxItem("American",false))
        listcusinetype.add(checkboxItem("American",false))
        listcusinetype.add(checkboxItem("American",false))
        listcusinetype.add(checkboxItem("American",false))
        listcusinetype.add(checkboxItem("American",false))

        var mainlist = ArrayList<MainModelFilterPage>()
        mainlist.add(MainModelFilterPage(2,"",false))
        mainlist.add(MainModelFilterPage(0,"Select type",false))
        mainlist.add(MainModelFilterPage(1,"Food",false))
        mainlist.add(MainModelFilterPage(1,"Food",false))
        mainlist.add(MainModelFilterPage(1,"Food",false))
        mainlist.add(MainModelFilterPage(1,"Food",false))
        mainlist.add(MainModelFilterPage(1,"Food",false))
        mainlist.add(MainModelFilterPage(1,"Food",false))
        mainlist.add(MainModelFilterPage(0,"Select meal type",false))
        mainlist.add(MainModelFilterPage(1,"Bulk Meals",false))
        mainlist.add(MainModelFilterPage(1,"Bulk Meals",false))
        mainlist.add(MainModelFilterPage(1,"Bulk Meals",false))
        mainlist.add(MainModelFilterPage(1,"Bulk Meals",false))
        mainlist.add(MainModelFilterPage(1,"Bulk Meals",false))
        mainlist.add(MainModelFilterPage(1,"Bulk Meals",false))
        mainlist.add(MainModelFilterPage(0,"Select Cuisine type",false))
        mainlist.add(MainModelFilterPage(1,"American",false))
        mainlist.add(MainModelFilterPage(1,"American",false))
        mainlist.add(MainModelFilterPage(1,"American",false))
        mainlist.add(MainModelFilterPage(1,"American",false))
        mainlist.add(MainModelFilterPage(1,"American",false))
        mainlist.add(MainModelFilterPage(1,"American",false))

        recyclerView.adapter = FilterAdapter(mainlist)
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context,LinearLayoutManager.VERTICAL,false)

    }
}
