package HelloWorld_Kotlin

 class HelloWorld{

     companion object{
         @JvmStatic
         fun main(args:Array<String>){
             println("Hello World from Companion Object")
              HelloWorld().demoCompanionObject() // non companion object function called using HelloWorld().
              demoMethod()  // companion object function so called directly
         }
        private fun demoMethod(){
             println("Demonstration Method")
         }
     }
     fun demoCompanionObject(){
         println("Demonstration of Companion Object")
     }
 }