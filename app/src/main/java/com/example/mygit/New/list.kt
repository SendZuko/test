package com.example.mygit.New

fun main(){


    val array = arrayOf(1,2,3,4,5,6)
    for (i in array){
        println(i)
    }


    var lostOne = mutableListOf<String>(
        "Maria", "Igor", "Dima","Kostya","Kit"
    )

    var lost = mutableListOf<String>()
    lost.add("dima")
    lost.add("Igor")

    println(lost)
    println(lost.size)




}