package com.example.myapplication.page1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.page2.Page2Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list2_model =ArrayList<list2Model>()

        list2_model.add(
            list2Model(
                R.drawable.mask_group_1,
                "Food Trays"
            )
        )
        list2_model.add(
            list2Model(
                R.drawable.group_2,
                "International Cuisine"
            )
        )
        list2_model.add(
            list2Model(
                R.drawable.mask_group_1,
                "Food Trays"
            )
        )
        list2_model.add(
            list2Model(
                R.drawable.group_2,
                "International Cuisine"
            )
        )
        list2_model.add(
            list2Model(
                R.drawable.mask_group_1,
                "Food Trays"
            )
        )
        list2_model.add(
            list2Model(
                R.drawable.group_2,
                "International Cuisine"
            )
        )
        list2_model.add(
            list2Model(
                R.drawable.mask_group_1,
                "Food Trays"
            )
        )
        list2_model.add(
            list2Model(
                R.drawable.group_2,
                "International Cuisine"
            )
        )

        val list4_model =ArrayList<list4Model>()

        list4_model.add(list4Model(R.drawable.no_path_copy_4))
        list4_model.add(list4Model(R.drawable.no_path_copy_5))
        list4_model.add(list4Model(R.drawable.no_path_copy_4))
        list4_model.add(list4Model(R.drawable.no_path_copy_5))
        list4_model.add(list4Model(R.drawable.no_path_copy_4))
        list4_model.add(list4Model(R.drawable.no_path_copy_5))
        list4_model.add(list4Model(R.drawable.no_path_copy_4))
        list4_model.add(list4Model(R.drawable.no_path_copy_5))



        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val models = ArrayList<ModelClass>()
        models.add(ModelClass(0))
        models.add(ModelClass(2))
        models.add(ModelClass(3, list2_model))
        models.add(ModelClass(1))
        models.add(ModelClass(4))
        models.add(ModelClass(5, list4_model, 1))
        models.add(ModelClass(6))



        recyclerView.adapter = MainAdapter(models,this::itemClickHandler)


    }

    private fun itemClickHandler(position: Int) {

        startActivity(Intent(this@MainActivity,Page2Activity::class.java))

    }
}
