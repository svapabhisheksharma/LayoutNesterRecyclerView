package com.example.myapplication.page1

class ModelClass{

    constructor(itemType:Int)
    {
        this.itemType=itemType
    }

    var itemType:Int = 0

    constructor(itemType: Int,list2:List<list2Model>)
    {
        this.itemType=itemType
        this.list2 = list2
    }
    private lateinit var list2:List<list2Model>
    constructor(itemType: Int, list4:List<list4Model>, randomint:Int)
    {
        this.itemType=itemType
        this.list4 = list4
    }
    private lateinit var list4 : List<list4Model>
    fun getlist2():List<list2Model>{
        return this.list2
    }
    fun getlist4():List<list4Model>{
        return this.list4
    }


    //Header layout
    private var city: String = "Manila"
    private var address: String = "100 Tanque Street Paco 1007"

    fun getCity(): String {
         return this.city
    }

    fun getAdress(): String {
        return this.address
    }



    //Popular layout
    private var popular: String = "Popular"

    fun getPopular(): String {
        return this.popular
    }









}