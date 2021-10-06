package Condition_ForLoop_In_Kotlin

  fun main(){
      val numb = 10 downTo 1
      for (a in numb){
          println(a)
      }
      val numb1 = 1..10
      for (b in numb1){
          println(numb1.last)
      }
}