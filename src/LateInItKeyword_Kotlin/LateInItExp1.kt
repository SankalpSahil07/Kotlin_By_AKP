package LateInItKeyword_Kotlin

// In Case of Class

class LateInItExp1 {
   lateinit var name: String
   fun show(){
       name = "John Deo"
       println("$name is in show() ")
   }
    fun display(){
        name = "Arnold"
        println("$name is in display()")
    }
 }
fun main(){
    val lateInItExp1 = LateInItExp1()
    lateInItExp1.name = "Start"
    println("${lateInItExp1.name} is in main()")
    lateInItExp1.show()
    lateInItExp1.display()
}
