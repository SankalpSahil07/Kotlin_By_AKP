package Condition_ForLoop_In_Kotlin

fun main(){
    val devices = arrayOf("Mobile Devices", "Laptop", "Portable Devices", "Auto Devices")
    for (item in devices.indices){
        println(devices[item]) // prints the list item
        println(item)  // prints the items index numbers
    }

}