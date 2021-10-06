package AbstractClassIn_Kotlin

abstract class AbstractClass1{
    abstract var name: String
    abstract  fun show()
    fun display(){
        println("Display method define in abstract class")
    }
    open fun view(){
        println("View method in abstract class")
    }
    open fun  get(){
    }
}

 class Sub: AbstractClass1(){
    override var name: String = " "
    override fun show() {
        display()
        println("override show function: $name")
    }

    override fun get() {
        view()
        println("get method override in sub class")
    }
}
fun main(){
    val sub = Sub()
    sub.name = "John"
    sub.show()
    sub.get()

}