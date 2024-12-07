package com.example.mygit

import java.util.concurrent.locks.Condition

data class User(val name:String,val age:Int)
fun main(){
    val user1 = User("Dima" ,18)
    val user2 = User("Kostya" ,12)
    val user3 = User("Dinis" ,26)
    val user4 = User("Dana" ,22)
    val user5 = User("Oler" ,52)
    val user6 = User("Hataha" ,19)
    var Users = listOf(user1,user2,user3,user4,user5,user6)

var zxc = conditionFun(Users){it.age > 18}
    var zxc1 = conditionFun(Users){it.name[0] == 'D'}
    var zxc2 = conditionFun(Users){it.age == 18}
    var zxc3 = conditionFun(Users){it.name.length == 6}

println("age > 19  $zxc")
    println("name = D $zxc1")
    println("age = 18 $zxc2")
    println("name length 6$zxc3")



}

fun conditionFun(users:List<User>,condition:(User)->Boolean):List<User>{
    val zxc = mutableListOf<User>()
  for(i in users){
      if(condition(i))
          zxc.add(i)

  }
    return zxc
}