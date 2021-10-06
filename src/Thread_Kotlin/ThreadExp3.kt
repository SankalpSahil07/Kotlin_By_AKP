package Thread_Kotlin

open class ThreadExp3: Thread() {
 }
  class Sub2: ThreadExp3(){

  }
 fun main(){
      val sub = ThreadExp3()
      println("Parent Class Priority: ${sub.priority}")

      sub.priority

     val s = Sub2()
     println("Child Class Priority is : ${s.priority}")
 }