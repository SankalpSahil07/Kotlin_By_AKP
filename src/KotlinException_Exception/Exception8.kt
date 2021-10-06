package KotlinException_Exception


class ExceptionDemo: RuntimeException {
  constructor(exString: String): super(exString)
 }
 fun main(){
     val age: Int =  18
     if (age > 15)
         throw ExceptionDemo("Age is under 18")
    else
        println("You can understand Advance Science")
 }

  /*Exception in thread "main" KotlinException_Exception.ExceptionDemo: Age is under 18
	at KotlinException_Exception.Exception8Kt.main(Exception8.kt:10)
	at KotlinException_Exception.Exception8Kt.main(Exception8.kt)*/