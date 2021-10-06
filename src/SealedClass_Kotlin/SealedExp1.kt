package SealedClass_Kotlin

sealed class SealedExp1 {

    class Circle(var radius: Double)
    class Rect( var length: Int, var breadth: Int)
    class Square(var length: Int)
 }
 fun main(){
     val sealedClass = SealedExp1.Circle(5.0)
     println("Circle Radius: ${sealedClass.radius}")

     val sealedReact = SealedExp1.Rect(4, 5)
     println("Area of Rectangle: ${sealedReact.length * sealedReact.breadth}")

     val sealedSquare = SealedExp1.Square(5)
     println("Area of the Square: ${sealedSquare.length}")
 }
