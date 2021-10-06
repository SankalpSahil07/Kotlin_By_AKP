package WithAndApplyIn_Kotlin

class WithAndApplyClass {
    var name: String = " "
    var age: Int = 0
    var marks: Double = 0.0
    fun show(a: Int){
        println("This is show function in Main Class: $a")
    }
}
fun main(){
    val wac = WithAndApplyClass()
    with(wac){
        name = "John Deo"
        age = 28
        marks = 98.0
    }
    wac.apply(){
        name = "Harry"
        age = 28
        marks = 89.0
    }.show(3)
    println("${wac.name} | ${wac.age} | ${wac.marks}")
}