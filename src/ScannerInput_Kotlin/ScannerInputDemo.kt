package ScannerInput_Kotlin

import java.util.*


fun main() {

     val scanner = Scanner(System.`in`)
     print("Enter String: ")
     val string: String? = scanner.next()

     print("Enter Byte (-32768 to +32767) : ")
     val byte: Byte = scanner.nextByte()

     print("Enter short (-32768 to +32767) : ")
     val short: Short = scanner.nextShort()

    print("Enter Integer (-2147483648 to +2147483647): ")
    val int: Int = scanner.nextInt()

    print("Enter Long (-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807): ")
    val long: Long = scanner.nextLong()

    print("Enter Float (-3.4e38 to +3.4E38): ")
    val float: Float = scanner.nextFloat()

    print("Enter Double (-1.7e308 to +1.7E308): ")
    val double: Double = scanner.nextDouble()

    print("Enter any Single Character : ")
    val anyDemo: Char = scanner.next().first()

    print("Enter value to get Character (0 to 65535): ")
    val char : Char = scanner.nextInt().toChar()

    print("Enter Boolean Value(true/ false): ")
    val cv : Boolean = scanner.nextBoolean()

    println("You Enter the value: ")
    println("String: $string")
    println("Byte: $byte")
    println("Short: $short")
    println("Long: $long")
    println("Integer: $int")
    println("Float: $float")
    println("Double: $double")
    println("Character: $char")
    println("Character by Integer Value: $anyDemo")
    println("Boolean: $cv")
}