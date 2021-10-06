package Condition_ForLoop_In_Kotlin

fun main(){
    val numb = 1..20
    for(a in numb){
        println(a)
    }
    println("Count total in a is ${numb.count()}")
}