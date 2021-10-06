package NestedClass_Kotlin

class NestedOuter{
    val x: Int = 100
    class NestedInner{
        val outerClass =NestedOuter()
        val y = outerClass.x + 100
        fun nestedShow(){
            println("Show Method inside nested/ inner NestedInner outer NestedOuter class")
        }
    }
}
 fun main(){
     val nestedOuter = NestedOuter.NestedInner()
     println("Y = ${nestedOuter.y}")
     nestedOuter.nestedShow()
 }