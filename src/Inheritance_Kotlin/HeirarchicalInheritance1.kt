package Inheritance_Kotlin

open class Education(private var name: String, private var city: String, private var areaPin: Int,
                     private var department: String, private var principal: String, private val id: Int) {
    fun getDetails(){
        println("ID: $id")
        println("Name: $name")
        println("City: $city")
        println("Area: $areaPin")
        println("Department: $department")
        println("Principal: $principal")
    }
}
class School(private var shcDetails: Double, private val course: String, name: String, city: String, areaPin: Int,
             department: String, principal: String, id: Int): Education(name, city, areaPin, principal, principal, id){
                 fun getSchoolData(){
                     getDetails()

                 }
             }
class College(private var hsc: Double, private val course: String, name: String, city: String, areaPin: Int, department: String, principal: String, id: Int):
              Education(name, city, areaPin, department, principal, id){
                  fun getCollegeDetails(){
                      println("\n----College Detail-----")
                      getDetails()
                      println("Course: $course")
                      println("SSC Result: $hsc")
                  }
              }
 fun main(){
     val sch = School(97.2, "CBSE", "RedWoods English School", "Detroit City", 23523, "Jr.Department","Walter White", 23523)
     sch.getSchoolData()
     val college = College(89.3,"CBSE","Vikram Dev Auto College", "Jeypore Koraput",234234,"Computer Science","Mr Jesse Pinkman", 23423)
     college.getCollegeDetails()
 }