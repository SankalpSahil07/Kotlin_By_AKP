package LambdasExpression_Kotlin

     val toUp: (String) -> String = {
         string: String -> string.uppercase()
     }
     val sizeOf: (String) -> Int = {
           it.length
     }
     val lowCase: (String) -> String = {
         lowData: String -> lowData.lowercase()
     }

fun main(){
    println(toUp("india"))
    println(sizeOf("HelloWorld!"))
    println(lowCase("KOTLIN COURSE"))
}

