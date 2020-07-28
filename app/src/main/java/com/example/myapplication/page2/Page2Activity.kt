package com.example.myapplication.page2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.page1.ModelClass
import com.example.myapplication.page1.list4Model

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        var list4Model = ArrayList<list4Model>()
        list4Model.add(list4Model(R.drawable.no_path_copy))
        list4Model.add(list4Model(R.drawable.no_path_copy_3))
        list4Model.add(list4Model(R.drawable.no_path_copy_4))
        list4Model.add(list4Model(R.drawable.no_path_copy_5))
        list4Model.add(list4Model(R.drawable.no_path_copy_6))
        list4Model.add(list4Model(R.drawable.no_path_copy_5))


        val recyclerView: RecyclerView = findViewById(R.id.recyclerviewpage2main)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var modelpage2 = ArrayList<ModelPage2>()

        modelpage2.add(ModelPage2(0))
        modelpage2.add(ModelPage2(1,list4Model))

        recyclerView.adapter= MainPage2Adapter(modelpage2)

    }
}
