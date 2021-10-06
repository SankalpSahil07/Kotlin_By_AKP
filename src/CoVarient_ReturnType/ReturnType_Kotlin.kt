package CoVarient_ReturnType

open class DemoReturn {
    val name: String = "Cristiano"
    companion object{
        fun show(): DemoReturn{
            return DemoReturn()
        }
    }
}
class Sub: DemoReturn(){
    val age: Int = 25
    companion object{
        fun dis(): Sub{
            return Sub()
        }
    }
}
fun main(){
    val uName = DemoReturn.show()
    println("Name of Student : ${uName.name}")

    val uAge = Sub.dis()
    println("Age of the Student : ${uAge.age}")
}