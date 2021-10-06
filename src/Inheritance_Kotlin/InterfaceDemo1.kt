package Inheritance_Kotlin

interface Person{
    var name : String
    var age: Int
    var gender : String
}

class InterfaceDemo1(override var name: String,override var age: Int, override var gender: String): Person {
     fun show(){
        println("$name | $age | $gender")
    }
}
fun main(){
    InterfaceDemo1("Jonas", 25, "Male").show()
}