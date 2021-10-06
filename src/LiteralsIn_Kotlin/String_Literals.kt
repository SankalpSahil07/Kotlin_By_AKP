package LiteralsIn_Kotlin

class String_Literals{
    fun developerInfo(){
      val name: String = "Johnny Bugle"
      val address: String = "Utah Salt Lake City"
      val emailAddress: String = "Johhny@gmail.com"
      println("Name of the Developer: $name")
      println("Address of the Developer: $address")
      println("Email of the Developer: $emailAddress")
    }
}
fun main(){
    val stringLiterals = String_Literals()
    stringLiterals.developerInfo()
}