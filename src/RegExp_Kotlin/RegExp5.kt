package RegExp_Kotlin

 fun main() {
     val matchResult = Regex("x|y").find("Orlando")
     val a  = matchResult?.value
     val b = matchResult?.value.orEmpty()
     println("$a: $b")

     a?.uppercase()
     b.uppercase()

      println("$a : $b")
 }