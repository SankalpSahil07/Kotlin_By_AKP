package RegExp_Kotlin

 fun main() {
     val name: String = "Orlando"
     val regex = Regex("Orlando")
     println(regex.matches(name))
}