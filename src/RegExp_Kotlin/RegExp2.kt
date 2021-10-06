package RegExp_Kotlin

 fun main() {
     val name: String = "Name"
     val age: String = "Age"
     val reg1 = Regex("Name")
     val reg2 = Regex("Age")

     when{
         reg1.matches(name) -> println("Enter Name Later")
         reg2.matches(age) -> println("Enter Age Later")
     }
}