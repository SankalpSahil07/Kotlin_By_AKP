package LazyKeyword_Kotlin

import Inheritance_Kotlin.Person

class PersonLazy{
    var dn = dName
    fun show(){
        println("Name = $dn")
        println("Name : $name")
    }
}
val dName: String by lazy {
    "Andy Robbins"
}
fun main(){
    val personLazy = PersonLazy()
    personLazy.show()
    println("Class variable nd = ${personLazy.dn}")
}
