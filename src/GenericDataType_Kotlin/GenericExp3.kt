package GenericDataType_Kotlin

class GenericExp3 {
    fun <T> showDataGen(x: T){
        println("Generic Class showDataGen Received: $x")
    }
}
fun main(){
    val genFun = GenericExp3()
    genFun.showDataGen("Johnny")
    genFun.showDataGen(123124)
    genFun.showDataGen(3.123)
    genFun.showDataGen('A')
    genFun.showDataGen(true)
}