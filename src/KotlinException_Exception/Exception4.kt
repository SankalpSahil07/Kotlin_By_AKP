package KotlinException_Exception

import java.lang.NumberFormatException

fun main() {
 val num = requestNumbs("123")
    print(num)
}
 fun requestNumbs(s: String): Int = try {
     Integer.parseInt(s)
 } catch (e: NumberFormatException){
     0
 }