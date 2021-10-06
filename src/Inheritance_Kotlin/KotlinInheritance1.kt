package Inheritance_Kotlin

open class KotlinInheritance1 {

     init {
         println("Main class")
     }
  }
class Sub: KotlinInheritance1(){
    init {
        println("Sub Class")
    }
}
fun main(){
   Sub()
}
