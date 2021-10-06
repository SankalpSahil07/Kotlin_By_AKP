package InlineFunction_Kotlin

import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue

fun main() {
    showString { "Android Developer" }
    showByte { 123 }
    showShort { 12354 }
    showInt { 123419 }
    showLong { 9_223_372_036_854_775_800 }
    showFloat { 2.902820f }
    showDouble { 2.23456235 }
    showCharacter { 'A' }
    showBoolean { true }
}
 inline fun showString(name: () -> String){
  println("String: ${name()}")
 }
inline fun showByte(byteValue: () -> Byte) = println("Byte: ${byteValue()}")
inline fun showShort(shorValue: () -> Short) = println("Short: ${shorValue()}")
inline fun showInt(intValue: () -> Int) = println("Int: ${intValue()}")
inline fun showLong(longValue: () -> Long) = println("Long: ${longValue()}")
inline fun showFloat(floatValue: () -> Float) = println("Float: ${floatValue()}")
inline fun showDouble(doubleValue: () -> Double) = println("Double: ${doubleValue()}")
inline fun showCharacter(charValue: () -> Char) = println("Char: ${charValue()}")
inline fun showBoolean(boolValue: () -> Boolean) = println("Boolean: ${boolValue()}")