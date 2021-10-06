package KotlinException_Exception

import java.lang.NumberFormatException

fun main() {
  val numb = requestNmb("1231")
    println(numb)

 }
 fun requestNmb(sName: String): Int{
     return try {
         Integer.parseInt(sName)
     } catch (e: NumberFormatException){
         0
     }
 }