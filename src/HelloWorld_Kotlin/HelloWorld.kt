package HelloWorld_Kotlin

/*
fun main(){
    println("Hello World!")
}*/

class DemoHelloWorld{

    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            println("DemoHelloWorld")
            nonMain()
            DemoHelloWorld().thirdMainMethod()
        }

       private fun nonMain(){
            println("Non Main Method")
        }
    }
       fun thirdMainMethod(){
           println("Third Main Method")
       }
}

object DemoObject{
    @JvmStatic
    fun main(args:Array<String>){
        println("This is Demo Object")
        demoMain()
    }
}
   fun demoMain(){
       println("This is demo Main function")
   }