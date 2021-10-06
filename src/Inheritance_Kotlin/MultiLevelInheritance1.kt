package Inheritance_Kotlin

open class MultiLevelInheritance1(private var title: String) {
    fun getWork(): String = title
}
open class User(private var gender: String, work: String): MultiLevelInheritance1(work){
    fun  gender(): String = gender
}
class Teacher(private var name: String, private var qualification: String, gender: String, work: String): User(gender, work){
    fun show(){
        println("Work: ${getWork()}")
        println("Gender: ${gender()}")
        println("Name: $name")
        println("Qualification: $qualification")
    }
}
fun main(){
    val teacher = Teacher("Danny Roseate", "IT","Male", "Android Developer")
    teacher.show()
}