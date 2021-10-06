package NestedAndInnerClass_Kotlin

class Outer {
    private var bar: Int = 2
    class Nested{
      fun foo() =2
    }
}
fun main(){
   val demo = Outer.Nested().foo()
   println(demo)
}