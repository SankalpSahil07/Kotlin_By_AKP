package MathFunction_Kotlin

import java.lang.Math.*
import kotlin.math.ln

fun main() {
    println("Math.PI  :  ${Math.PI}")
    println("abs(-95)  :  ${abs(-95)}")
    println("Math.E :  ${Math.E}")
    println("Math.addExact(5,8) : ${Math.addExact(5,8)}")
    println("ceil(126.5) : ${ceil(126.5)}")
    println("floor(126.5)  :  ${floor(126.5)}")
    println("Math.getExponent(2.6) : ${Math.getExponent(2.6e10)}")
    println("ln(10.2) : ${ln(10.2)}")
    println("max(25,52) : ${max(25,52)}")
    println("min(10,100)  :  ${min(10,100)}")
    println("exp(5.0) : ${exp(5.0)}")

    println("pow(2.0,3.0)  :  ${pow(2.0,3.0)}")
    println("Math.random() : ${Math.random()}")
    println("rint(126.2) : ${round(126.2)}")
    println("Math.round(125.55)  :  ${round(125.55)}")
    println("sqrt(16.0)  :  ${sqrt(16.0)}")
    println("Math.toDegrees(45.0) : ${Math.toDegrees(45.0)}")
    println("Math.ulp(125.5) : ${Math.ulp(125.5)}")
}