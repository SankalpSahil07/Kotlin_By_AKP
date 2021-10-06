package with_Kotlin

class WithKeyword {
    var name: String = " "
    var age:  Int = 0
    var marks: Double = 0.0

    fun show(){
        println("This function belongs to main Class")
    }
}
fun main(){
    val wK = WithKeyword()
    with(wK){
        name = "John Deo"
        age = 28
        marks = 98.9
    }
    println("${wK.name} | ${wK.age} | ${wK.marks}")
}
