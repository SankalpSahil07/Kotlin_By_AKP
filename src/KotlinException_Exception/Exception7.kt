package KotlinException_Exception

 fun main(){
     try {
         val age: Int = 15
         if (age < 18)
             throw ArithmeticException("Age is under 18")
          else
              println("Successfully can vote")
     }catch (e: ArithmeticException){
         print(e)
     }
}