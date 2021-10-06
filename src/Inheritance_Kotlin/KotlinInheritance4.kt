package Inheritance_Kotlin

open class KotlinInheritance4 {

    open fun show(){
        println(" This  Function belongs to Parent class")
    }
 }
class Sub4: KotlinInheritance4(){
    override fun show() {
           println("Sub4 class Constructor")
        }
    }
fun main(){
    var kn = KotlinInheritance4()
    kn.show()
    var skn = Sub4()
    skn.show()
}
