package NullHandler_Kotlin

 fun main() {
     val name1: String? = null
     println("Name1 is : $name1")

     if (name1?.length == null){
         println("The length : ${name1?.length}")
     }
}