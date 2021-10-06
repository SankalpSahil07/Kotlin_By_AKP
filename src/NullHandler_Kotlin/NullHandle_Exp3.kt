package NullHandler_Kotlin

fun main() {
    val name2: String? = null
    val name3: String? = "John Deo"
    val name4: String? = null
    val name6: String? = null

    val nameLength = name6?.length?: -1
    println("the length by elvis: $nameLength")

   // println("name is ${name4!!.length}")  This will throw NullPointerException

    /*val name5: String? = null

    if (name5 != null)
        println("The length: ${name5.length}")    This statement will not execute
    else -1*/


    name2?.let {
        println("Name2 is : ${name2.length}")
    }
    name3?.let {
        println("Name3 is : ${name3.length}")
    }

}
