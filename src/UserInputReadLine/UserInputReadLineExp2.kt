package UserInputReadLine

 fun main() {
     print("Enter your Name: ")
     val name: String? = readLine().toString()
     println("Name: $name")
     println("________________")

     print("Enter age: ")
     val age  = readLine()?.toInt()
     println("Age is: $age")
     println("_________________")

     print("Enter Marks: ")
     val marks: Double? = readLine()?.toDouble()
     println("Marks is : $marks")
     println("_________________")

     print("Enter Mobile No: ")
     val mobNo: Long? = readLine()?.toLong()
     println("Mobile No is: $mobNo")
 }