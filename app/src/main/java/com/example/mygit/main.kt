package com.example.mygit

fun main(){
    println("enter the first num:")
    val numOne = readln().toIntOrNull()
    if (numOne == null) {
        println("incorrect number")
        return
    }
    println("enter the second num:")
    val numTwo = readln().toIntOrNull()
    if (numTwo == null) {
        println("incorrect number")
        return
    }

    println("Choose an operation (+, -, *, /):")
    val cin = readln()
    when(cin){
        "+" -> println(addition(numOne,numTwo))
        "-" -> println(removal(numOne,numTwo))
        "*" ->println(multiplication(numOne,numTwo))
        "/" ->println("${division(numOne, numTwo)}")

        else -> println("not cin")
    }

}
fun addition(numOne:Int, numTwo:Int):Int = numOne + numTwo
fun removal(numOne:Int, numTwo:Int):Int = numOne - numTwo
fun multiplication(numOne:Int, numTwo:Int):Int{
    val sum = numOne * numTwo
    return sum
}
fun division(numOne: Int, numTwo: Int): String {
    return if (numTwo != 0) {
        (numOne / numTwo).toString()
    } else {
        "You can't divide by zero!"
    }

}