package KotlinException_Exception

 fun main() {
     try {
         val x = 10 / 0
         println("this statement not executes $x")
     } catch (e: ArithmeticException) {
         println("could not divide by zero")
     }
 }
