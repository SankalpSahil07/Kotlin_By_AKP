package GenericDataType_Kotlin

import LazyKeyword_Kotlin.show

fun main() {

     showData("Johnny")
     showData(123. toByte())
     showData(32261. toShort())
     showData(234141245)
     showData(1213523462346L)

     showData(4.131245235f)
     showData(3.4612623623456256)
     showData('A')
     showData(true)
 }

 fun <T> showData(x: T){
     println("Data Received : $x")

 }