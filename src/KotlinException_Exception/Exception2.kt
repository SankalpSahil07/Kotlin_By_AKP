package KotlinException_Exception

 fun main() {
     try{
         val x = 10 / 0
         println("this statement not executes $x")
     }finally{
         println("This  is finally block")
     }
}

/* Exception in thread "main" java.lang.ArithmeticException: / by zero
	at KotlinException_Exception.Exception2Kt.main(Exception2.kt:5)
	at KotlinException_Exception.Exception2Kt.main(Exception2.kt)
	*/