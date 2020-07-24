package com.example.myapplication.page2

import com.example.myapplication.page1.list4Model

class ModelPage2{
    constructor(itemType:Int){
        this.type=itemType
    }
    var type:Int=0
    constructor(itemType: Int,list:List<list4Model>){
        this.type=itemType
        this.rvlist=list
    }
    lateinit var rvlist  : List<list4Model>
}