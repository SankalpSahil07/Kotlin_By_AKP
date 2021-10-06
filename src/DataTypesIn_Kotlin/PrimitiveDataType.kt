package DataTypesIn_Kotlin

 fun main(){
     val byte1: Byte = -128
     println("Byte: $byte1")
     val byte2: Byte =  127
     println("Byte: $byte2 \n")

     val shot1: Short = -32768
     println("Short: $shot1")
     val short2: Short = 32767
     println("Short: $short2 \n")

     val int1: Int =  -2147483648
     println("Int: $int1")
     val int2: Int = 2147483647
     println("Int: $int2")

     val long1: Long = -9_223_372_036_854_775_807
     println("Long Min Value: $long1")
     val long2: Long = 9_223_372_036_854_775_807
     println("Long Max Value: $long2")

     val float1: Float = 3.4E38f
     println("Float Min Value: $float1")
     val float2: Float = -3.4E38f
     println("Float Max Value: $float2")
     val float3: Float = 3.4E-38f
     println("Float Value: $float3")
     val float4: Float = -3.4e-38f
     println("Float Value: $float4")

     val double1: Double = 1.7e308
     println("Double Min Value: $double1")
     val double2: Double = -1.7e308
     println("Double Max Value: $double2")
     val double3: Double = 1.7e-308
     println("Double Value: $double3")
     val double4: Double = -1.7e-308
     println("Double Value: $double4")

     val char1: Char = 'A'
     println("Char: $char1")
     val char2: Char = 65.toChar()
     println("Char: $char2")
     val char3: Char = '\u0041'
     println("Char UniCode: $char3")

     val bool1: Boolean = true
     println("BooleanT: $bool1")
     val bool2: Boolean = false
     println("BooleanF: $bool2")
 }