package com.example.myapplication

class ModelClass( type:Int , listT:Int){

    val itemType = type
    val listType = listT


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


    //Nested RecyclerView layout
    private val list : List<String> = listOf("Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello")
    fun getList():List<String> {
        return this.list
    }



}