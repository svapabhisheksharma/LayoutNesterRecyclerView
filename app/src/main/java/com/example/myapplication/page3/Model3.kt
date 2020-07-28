package com.example.myapplication.page3

import com.example.myapplication.page1.list4Model

class Model3{
    var itemType:Int = 0

    constructor(itemType:Int){
        this.itemType=itemType
    }

    var listSize:Int = 2

    constructor(itemType: Int,listSize:Int){
        this.itemType=itemType
        this.listSize=listSize
    }

    lateinit var list : List<list4Model>

    constructor(itemType: Int,list:List<list4Model>){
        this.itemType=itemType
        this.list=list
    }
}