package NullHandler_Kotlin

fun main() {
    val name: String? = null
    println("Name is: $name")

    if (name?.length == null){
        println("The length : ${name?.length}")
    }
}