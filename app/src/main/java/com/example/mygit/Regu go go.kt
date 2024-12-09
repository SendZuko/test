package com.example.mygit

fun main(){
    val zxc = listOf(1,2,3,4,5)
println(stringRevers("Dimon"))
println(sumaZxc(zxc))
    println(filterZxc(zxc))
}

fun filterZxc(zxc:List<Int>):Pair<List<Int>, List<Int>> {
    val evens = zxc.filter { it % 2 == 0 }
    val odds = zxc.filter { it % 2 != 0 }
    return Pair(evens, odds)
}
fun sumaZxc(it:List<Int>)=it.sum()
fun stringRevers(it:String)= it.reversed()





