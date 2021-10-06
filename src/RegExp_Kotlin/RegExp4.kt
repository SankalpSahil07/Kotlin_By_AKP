package RegExp_Kotlin

fun main() {

    when{
         Regex("Name").matches("name")-> println("name")
         Regex("Name").matches("NAME") -> println("NAME")
         Regex("NAME").matches("Name")-> println("Name")
         else -> println("Type in this way -> Name")
    }
}