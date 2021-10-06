package ScannerInput_Kotlin

import java.util.*

fun main() {
     val scanner = Scanner(System.`in`)

        print("Enter Your Name: ")
        val uName: String? = scanner.next()

       print("Enter your Age: ")
       val uAge: Int = scanner.nextInt()

      print("Enter your Salary: ")
       val uSalary: String? = scanner.next()

     print("Enter your PhoneNo: ")
       val uMobileNumber : Long = scanner.nextLong()

     println("\nDevelopers Info")
     println("Name of the Developer: $uName")
     println("Age of the Developer: $uAge")
     println("Salary of the Developer: $uSalary")
     println("Developers Mobile No: $uMobileNumber")

}