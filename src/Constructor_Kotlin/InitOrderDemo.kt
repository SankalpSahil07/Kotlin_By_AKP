package Constructor_Kotlin

class InitOrderDemo(name: String){
        val firstProperty = "First property: $name".also(::println)

    init {
        println("Fist initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}
fun main(){
    InitOrderDemo("hello")
    InitOrderDemo("Christiano")
}