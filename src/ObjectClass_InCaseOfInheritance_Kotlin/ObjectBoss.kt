package ObjectClass_InCaseOfInheritance_Kotlin

open class ObjectBoss{
    var sal : Int = 500000
    open fun show(){
        println("Object Boss Class show Function")
    }
    fun dis(){
        println("dis fun")
    }
}
 object Employee: ObjectBoss(){
     var name: String = "John Wick"

     override fun show() {
         super.show()
         println("Child Class show method, sal: $sal")
     }
  }
 fun main(){
     println("Name is main: "+Employee.name)
     Employee.show()
     println(Employee.sal)
     Employee.dis()
 }