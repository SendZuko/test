package com.example.mygit.New

fun main(){
    println("num1 ")
    val num1:Int = readln().toInt()
    println("num21 ")
    val num2:Int = readln().toInt()

   when{
       num1>num2 -> println("num1 win ")
       num1<num2 -> println("num2 win ")
       else -> println("not win ")
   }






println(suma(num1 ,num2))

}

fun suma(num1:Int,num2:Int):Int = num1 + num2
