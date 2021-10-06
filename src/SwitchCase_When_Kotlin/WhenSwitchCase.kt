package SwitchCase_When_Kotlin

import java.lang.Integer.sum

fun main(){
   val x: Int = 4
   when(x){
       1,10 -> {
              print("One")
              print("Two")
              print("Three")
       }
       2 -> {
           val sum = sum( 5, 8)
            print(sum)
       }
       3 -> print("Three")
       4 -> {
            print("Four")
            val nested: Int = 2
            when(nested){
              1 -> print("Nested One")
              2 -> print("Nested Two")
              3 -> print("Nested Three")
            }
       }
       in 10..12 ->{
            print("Between 10 to 12")
       }
       else -> {
            print("default in switch case")
       }
   }
 }
fun sum(x: Int, y:Int) : Int{
   return x+y
}