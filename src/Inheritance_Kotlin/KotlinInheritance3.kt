package Inheritance_Kotlin

open class KotlinInheritance3(college: String) {

    var school: String = college
}
class Sub3(college: String, name: String, age: Int): KotlinInheritance3(college){
        var name : String = name
        var age : Int = age
    fun show(){
        println("School: $school\n Name: $name\n Age: $age")
    }
}
fun main(){
    val s = Sub3("Berkley", "John", 25)
    s.show()
}