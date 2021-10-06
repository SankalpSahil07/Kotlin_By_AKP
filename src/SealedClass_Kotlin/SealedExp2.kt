package SealedClass_Kotlin

sealed class SealedExp2 {

     class Circle(var radius: Double){
         fun getRadius(){
             println("Radius: $radius")
         }
     }
     class Rect(var length: Int, var breadth: Int){
         fun getAreaRect(){
         println("Rectangle Area: ${length * breadth}")
         }
     }
     class  Square(var length: Int){
         fun getSquare(){
             println("Square Area: ${length * length}")
         }
     }
 }
 fun main(){
     val sealedCircle = SealedExp2.Circle(7.9)
     sealedCircle.getRadius()

     val sealedRect = SealedExp2.Rect(5, 6)
     sealedRect.getAreaRect()

     val sealedSquare = SealedExp2.Square(7)
     sealedSquare.getSquare()
 }