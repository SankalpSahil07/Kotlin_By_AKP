package Condition_If_Else_In_Kotlin

fun main(){
    val age = 27
    if(age < 18){
      println("You are under 18, can't registered")
    }else if(age >18){
        println("You can register now")
    } else if (age > 25){
        println("You are good to go...!!!")
    } else{
        println("You must register")
    }
}