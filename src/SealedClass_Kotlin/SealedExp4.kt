package SealedClass_Kotlin

import LazyKeyword_Kotlin.name

sealed class SealedExp4(var shapeName: String) {
    val slName :  Double = 45.2

     fun showSlEpx(){
         println("Sealed Class showSlExp() fun for: $slName")
     }
     class Circle(var radius: Double, var crName: String): SealedExp4(crName){
         fun getRadius(){
             println("Circle Area: ${slName * radius * radius}")
             showSlEpx()
         }
     }
    class Rect(var length: Int, var breadth: Int, rcName: String): SealedExp4(rcName){
        fun getRectArea(){
            println("Square Area:${length * length}")
            showSlEpx()
        }
    }
    class Square(var length: Int, sqName: String): SealedExp4(sqName){
        fun getSquareArea(){
            println("Square Area: ${length * length}")
        }
    }
}
fun main(){
    val sealCircle = SealedExp4.Circle(4.5, "Circle")
    sealCircle.getRadius()

    val sealRect  = SealedExp4.Rect(5, 7, "Rectangle")
    sealRect.getRectArea()

    val sealSquare = SealedExp4.Square(5, "Square")
    sealSquare.getSquareArea()
}
