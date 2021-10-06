package Inheritance_Kotlin

open class SingleLevelInheritance1(name: String, age: Int, mobileNo: Long){
     var name: String? = null
     var age: Int  = age
     var mobileNo: Long = mobileNo
}
class Student(department: String, id: Int, name: String, age: Int, mobileNo: Long): SingleLevelInheritance1(department, age, mobileNo){
      var department : String = department
      var id: Int = id
    fun show(){
        println("ID: $id \n Name: $name \n Age: $age Mobile: $mobileNo \n Department: $department")
    }
}
fun main(){
   val  student = Student("IT", 348237, "Kevin Jonas", 24, 84847432)
    student.show()
  }

