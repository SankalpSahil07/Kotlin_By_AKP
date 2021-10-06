package GenericDataType_Kotlin

 fun main() {
  anyData(1)
  anyData(1.3f)
  anyData(2.13)
  anyData('A')
  anyData("Johnny")
  anyData(62623456254)
  anyData(arrayOf("K", "O","T","L", "I", "N"))
 }
 fun <FCK> anyData(data: FCK){
   when(data){
     is Int -> { println("Int: $data") }
     is Float -> { println("Float: $data") }
     is Double -> { println("Double: $data") }
     is Char -> { println("Char: $data") }
     is String -> { println("String: $data") }
     is Long -> { println("Long: $data") }
     else -> { println("Array: $data") }
   }
 }