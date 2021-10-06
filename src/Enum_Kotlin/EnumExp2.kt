package Enum_Kotlin

import java.awt.Color

enum class Colors {
    RED, BLUE, GREEN, BLACK, WHITE
 }
  fun main(){
     val colors = when(Colors.RED){
        Colors.BLACK ->  "Selected Color is black"
        Colors.BLUE -> "Selected Color is Blue"
        Colors.GREEN -> "Selected Color is Green"
        Colors.RED -> "Selected Color is Red"
        Colors.WHITE -> "Selected Color is White"
     }
   println(colors)
  }