package SealedClass_Kotlin

import LazyKeyword_Kotlin.show

sealed class SealedExp3 {
    val clsPi: Double = 3.123
     fun showSealed1(){
         println(" Sealed class showSealed() Function")
     }
     class Circle(var radius: Double): SealedExp3(){
         fun getRadius(){
             println("Circle Area: ${clsPi * radius * radius}")
             showSealed1()
         }
     }
    class Rect(val length: Int, var breadth: Int) :SealedExp3(){
        fun getRectArea(){
            println("Rectangle Area : ${length * breadth}")
            showSealed1()
        }
    }
    class Square(var length: Int) : SealedExp3(){
        fun getSquare(){
            println("Square Area: ${length * length}")
            showSealed1()
        }
    }
  }
 fun main(){
     val sealedCircle = SealedExp3.Circle(5.0)
     sealedCircle.getRadius()

     val sealedRect = SealedExp3.Rect(5 , 5)
     sealedRect.getRectArea()

     val sealedSquare = SealedExp3.Square(7)
     sealedSquare.getSquare()
 }