package com.example.mygit

fun main() {
    // TODO: Виведіть парні числа від 0 до 10 включно
    // for(i in 0..10 step 2){
    //      println(i)
    //  }
    // TODO: Виведіть фрукти, назва яких має більше 5 символів


    // val fruits = listOf("apple", "banana", "cherry", "date")
    //  var counter =0
    //  for (i in fruits){
    //     if (i.length == 5){
    //         println(i)
    //}
    //    }

  // TODO: Створіть range чисел від 10 до 1 з кроком 2
    // та виведіть числа, які діляться на 3

   // for(i in 10 downTo 1 step 2){
   // if(i % 3 ==0){
  //      println(i)
   // }
//}
    // TODO: Допрацюйте функцію fibonacci(), щоб вона виводила
    // числа Фібоначчі менші за 100


    for ((index, num) in fibonacci(0, 1).withIndex()) {
        if (index >= 10) break // Останавливаем цикл после 10 чисел
        print("$num ")
    }


}
fun fibonacci(a:Int, b:Int) = sequence {
    var x = a
    var y = b
    while (true) {
        yield(x) // Возвращаем текущее значение x
        x = y.also { y += x } // Обновляем значения x и y
    }
}