package HelloWorld_Kotlin

object Main {

    @JvmStatic
    fun main(args:Array<String>){
        println("Hello World from Main Object class")
        demoShowMain()
        outSideFun()
    }
   private fun demoShowMain(){
        println("Demo to show inside Object function")
    }
}
 fun outSideFun(){
     println("Demo to show the outside function")
 }