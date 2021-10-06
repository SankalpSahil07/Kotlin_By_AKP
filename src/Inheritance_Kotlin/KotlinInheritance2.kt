package Inheritance_Kotlin

open class KotlinInheritance2 {

    constructor(){
        println("Main class")
    }
  }
class Sub2: KotlinInheritance2{

    constructor(){
        println("Sub2 Class")
    }
}
fun main(){
    Sub2()
}