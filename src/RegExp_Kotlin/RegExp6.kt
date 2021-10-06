package RegExp_Kotlin

 fun main() {
     var mobile = "23425234523"
     var reg = Regex("""\d{10}""").matches(mobile)
     if (reg)
         println("Valid Mobile No")
     else
         println("Invalid Mobile No")
}