package InFix_Extension_Kotlin

class Main {
    var fName: String? = null
    fun show(){
        println("$fName")
    }
}
infix fun Main.add(funMain3: Main) : String = "We are " + this.fName+" and " + funMain3.fName

fun main(){
    val funMain1= Main()
    funMain1.fName = "Sankalp"
    funMain1.show()
    val funMain2 = Main()
    funMain2.fName = "Sharon"
    funMain2.show()
    println(funMain1 add funMain2)
}
