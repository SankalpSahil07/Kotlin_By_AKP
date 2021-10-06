package GenericDataType_Kotlin

 fun main() {

  showGenData("Johnny", 135.toByte(), 321461.toShort(), 2147483645,987654321123456789L,
               3.14285714f,3.142857142857143,'A',true)
}
fun <T> showGenData(stringValue: T, byteValue: T, shortValue: T, intValue: T, longValue: T, floatValue: T,
                    doubleValue: T, charValue: T, boolValue: T){
    println("String: $stringValue")
    println("Byte: $byteValue")
    println("Short: $shortValue")
    println("Integer: $intValue")
    println("Long: $longValue")
    println("Float: $floatValue")
    println("Double: $doubleValue")
    println("Character: $charValue")
    println("Boolean: $boolValue")
}