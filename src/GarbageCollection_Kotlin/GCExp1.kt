package GarbageCollection_Kotlin

import LazyKeyword_Kotlin.show

class GCExp1 {
    var numb:  Int? = 10
 }
 class SubClass1{
    var numb: Int? = 11
 }
class SubClass2{
   var numb: Int? = 12
}

 fun main(){
   var cgEx: GCExp1? = GCExp1()
   cgEx = null
   showInfo()

  var cl1: GCExp1? = GCExp1()
  var sub1: SubClass1? = SubClass1()
  var sub2: SubClass2? = SubClass2()

  cl1?.numb = cgEx?.numb
  sub1?.numb = sub1?.numb
  sub2?.numb = sub2?.numb

  cgEx = null; sub1 = null; sub2 = null

 }

fun showInfo() {
   var cg2 : GCExp1? = GCExp1()
   println("Show the Info")
}

