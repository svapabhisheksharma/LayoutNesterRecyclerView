package com.example.myapplication.page3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.page1.list4Model

class Page3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        var list4Model = ArrayList<list4Model>()
        list4Model.add(list4Model(R.drawable.no_path_copy))
        list4Model.add(list4Model(R.drawable.no_path_copy_3))
        list4Model.add(list4Model(R.drawable.no_path_copy_4))
        list4Model.add(list4Model(R.drawable.no_path_copy_5))
        list4Model.add(list4Model(R.drawable.no_path_copy_6))
        list4Model.add(list4Model(R.drawable.no_path_copy_5))

        val rvpage3 = findViewById<RecyclerView>(R.id.page3rv)
        rvpage3.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        var modelList = ArrayList<Model3>()

        modelList.add(Model3(0))
        modelList.add(Model3(1))
        modelList.add(Model3(2,list4Model))
        modelList.add(Model3(3,3))

        rvpage3.adapter = AdapterPage3(modelList)
    }
}
