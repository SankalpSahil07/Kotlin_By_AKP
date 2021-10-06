package KotlinException_Exception

import java.lang.Exception

fun main(){
     val arr = arrayOf(1,2,3,4,5,6,7)
     try {
         arr[6] = 10/0
     } catch (firstEx: ArrayIndexOutOfBoundsException){
         println("array size is ${arr.size}")
     } catch (secondSize: ArrayIndexOutOfBoundsException){
         println("/ by zero")
     } catch (e: Exception){
         println("Parent Class Exception")
     } finally {
         println("This is finally block")
     }
}