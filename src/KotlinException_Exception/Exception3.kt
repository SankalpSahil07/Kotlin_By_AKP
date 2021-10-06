package KotlinException_Exception

 fun main(){
     try {
         val x = 10 / 0
         println("This statement not executes $x")
     }catch (e: ArithmeticException){
         println("Could not divide by zero")
         println(e)
     } finally {
         println("This is finally Block")
     }
}