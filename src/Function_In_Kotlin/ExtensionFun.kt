package Function_In_Kotlin

class DeveloperDetails {
    fun developerInfo(devName: String, devSalary: Int){
        println("Name of the Developer: $devName")
        println("Salary of the Developer: $devSalary")
    }
 }
fun DeveloperDetails.devDetails(){
    val dName: String = "John Deo"
    val dSalary: Int = 10_00_0000

    println("Developer Details: ${developerInfo("Johnny", 10_000_0000)}")
    println("Name of theDeveloper: $dName")
    println("Salary of the Developer: $dSalary")
}
 fun main(){
     val developerDetails = DeveloperDetails()
     developerDetails.devDetails()
 }

