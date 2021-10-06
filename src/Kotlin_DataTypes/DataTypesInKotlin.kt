package Kotlin_DataTypes

fun main(){
    val byte1:  Byte = -128
   // println("Byte - :$byte1")
    val byte2: Byte =  +127
  //  println("Byte + : $byte2")
    println("Range of Byte is $byte1 to $byte2 and the size of Byte = 8bits \n")

    val short1: Short = -32768
  //  println("Short : $short1")
    val short2: Short = 32767
  //  println("Short : $short2")
    println("Range of Short is $short1 to $short2 and the size of Short = 16bits \n")

    val int1: Int = -2147483648
   // println("int1 : $int1")
    val int2: Int = 2147483647
   // println("int2: $int2")
    println("Range of Int is $int1 to $int2 and the size of Int = 32bits \n")

    val long1: Long = -9_223_372_036_854_775_807
   // println("long1: $long1")
    val long2: Long = 9_223_372_036_854_775_807
   // println("long2 : $long2")
    println("Range of Long is $long1 to $long2 and the size of Long = 64bits")

    val float1: Float = 3.4E38f
    println("float1: $float1")
    val float2 : Float = -3.4E38f
    println("float2: $float2")
    val float3: Float = 3.4E-38f
    println("float3: $float3")
    val float4: Float = -3.4e-38f
    println("float4: $float4")
    println("Ranges of float are $float1, $float2, $float3, $float4 and the size of Float = 32bits")

    val double1: Double = 1.7e308
    println("double1: $double1")
    val double2: Double = -1.7e308
    println("double2: $double2")
    val double3: Double = 1.7e-308
    println("double3: $double3")
    val double4: Double = -1.7e-308
    println("double4: $double4")
    println("Ranges of Double are $double1, $double2, $double3, $double4, $double4 and the size of Double = 64bits")

    val char1: Char = 'C'
    println("char1: $char1")
    val char2 : Char = 65.toChar()
    println("char2: $char2")
    val char3: Char = '\u0041'
    println("char3: $char3")
    println("Ranges of Char are $char1, $char2, $char3 and the size of Char = 16bits")

    val boolean1: Boolean = true
    println("boolean1: $boolean1")
    val boolean2: Boolean = false
    println("boolean2: $boolean2")
    println("Boolean values maybe true of false and size of the Boolean = 1bit either 0 or 1")
}