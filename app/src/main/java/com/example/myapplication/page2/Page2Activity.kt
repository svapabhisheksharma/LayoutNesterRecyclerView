package com.example.myapplication.page2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.filterpage.FilterActivity
import com.example.myapplication.page1.ModelClass
import com.example.myapplication.page1.list4Model
import com.example.myapplication.page3.Page3Activity

class Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        var list4Model = ArrayList<list4Model>()
        list4Model.add(list4Model(R.drawable.no_path))
        list4Model.add(list4Model(R.drawable.no_path_copy))
        list4Model.add(list4Model(R.drawable.no_path_copy_3))
        list4Model.add(list4Model(R.drawable.no_path_copy_4))
        list4Model.add(list4Model(R.drawable.no_path_copy_5))
        list4Model.add(list4Model(R.drawable.no_path_copy_6))
        list4Model.add(list4Model(R.drawable.no_path_copy))
        list4Model.add(list4Model(R.drawable.no_path_copy_5))


        val recyclerView: RecyclerView = findViewById(R.id.recyclerviewpage2main)

        val buttonView : TextView = findViewById(R.id.button_text)

        buttonView.setOnClickListener {
            startActivity(Intent(this@Page2Activity,FilterActivity::class.java))
        }

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var modelpage2 = ArrayList<ModelPage2>()

        modelpage2.add(ModelPage2(0))
        modelpage2.add(ModelPage2(1,list4Model))

        recyclerView.adapter= MainPage2Adapter(modelpage2,this@Page2Activity::itemClickHandler)

    }
    private fun itemClickHandler(position: Int) {

        startActivity(Intent(this@Page2Activity,Page3Activity::class.java))

    }
}
