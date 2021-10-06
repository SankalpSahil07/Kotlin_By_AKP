package RegExp_Kotlin

 fun main() {
     val name = "Name"
     val r1 = Regex(name)
     when{
         r1.matches("name") -> println("name")
         r1.matches("Name") -> println("NAME")
         r1.matches(("Name")) -> println("Name")
         else -> println(" 'name' should be typed in way -> Name")
     }
}