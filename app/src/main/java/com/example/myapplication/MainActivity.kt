package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val models = ArrayList<ModelClass>()

        models.add(ModelClass(0,0))
        models.add(ModelClass(2,0))
        models.add(ModelClass(2,1))
        models.add(ModelClass(1,0))
        models.add(ModelClass(2,2))
        models.add(ModelClass(2,3))

        recyclerView.adapter = MainAdapter(models)


    }
}