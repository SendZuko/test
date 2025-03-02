package com.example.mygit



fun main(){
    //println("Name ")
   // val name = readLine()?.trim() ?: ""
    //println("Age ")
     //val age = readln().toIntOrNull() ?: 0  // Перевіряємо на валідність числа

    //println("Hello $name you $age age")



    val num:Int = readLine()!!.toInt()
    if(num % 2 == 0)
      println("numdet yes even $num")


    print("Введіть текст: ")
    val str = readln().trim()
    println(str.reversed())

}
