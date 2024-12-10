package com.example.mygit

fun main(){
    val zxc1 = arrayOf(1,2,4,5,6,123,256,512)
    val zxc = listOf(1,2,4,123,1)
println(zxc.max())
    println(maxNum(zxc1))
    val numbers = arrayOf(3, 5, 1, 9, 7)
    println(numbers.filter {  it == 7  })
    println(findSevens(numbers)) // Должно вывести: 7
    val uniqueArray = arrayOf(1, 2, 3, 4, 5)
    val nonUniqueArray = arrayOf(1, 2, 2, 4, 5)
    println(areElementsUnique(uniqueArray)) // Должно вывести: true
    println(areElementsUnique(nonUniqueArray)) // Должно вывести: false
    val numbers2 = arrayOf(-3, 5, -1, 9, -7, 6)
    val forma = sumPositiveNumbers(numbers2)
    println(forma) // Должно вывести: 20

}


fun sumPositiveNumbers(list:Array<Int>):Int {
    var zxc = 0
    for(i in list){
        if(i > 0){
            zxc += i
        }
    }
    return zxc
}
fun areElementsUnique(arr: Array<Int>): Boolean {
    val uniqueElements = arr.toSet()
    return uniqueElements.size == arr.size
}

fun findSevens(arr: Array<Int>): Pair<Int, Int> {
    var count = 0
    for (i in arr) {
        if (i == 7) {
            count++
        }
    }
    return Pair(7, count)
}

fun maxNum(i:Array<Int>):Int{
    var counter = i[0]
    for (j in i){
        if(j > counter){
            counter = j
        }
    }
    return counter
}
