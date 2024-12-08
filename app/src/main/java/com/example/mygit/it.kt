package com.example.mygit

fun main(){
    val string = listOf("apple","banana","cherry")
     val numbers = listOf(22,19,33,42,51,62,71,82,93,12)
var zxc = numbers.filter {it % 2 ==0 }
    println(zxc)

var zxc1 = string.find { it.startsWith("c") }
    println(zxc1)

    var zxc2 = numbers.map { it * it-10  }
println(zxc2)
    var zxc3 = string.flatMap { it.toList() }
    println(zxc3)

    var zxc4 = numbers.all { it >= 18 }
    println(zxc4)
}