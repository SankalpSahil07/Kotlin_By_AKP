package NestedClass_Kotlin

class Outer {
    fun outerFunction(){
        println("This is Outer Class function")
    }

    class Inner{
       fun innerFunction(){
           println("This is Inner Class Function")
       }
    }
}
 fun main(){
     val inner = Outer.Inner()
     inner.innerFunction()
     val outer = Outer()
     outer.outerFunction()
 }