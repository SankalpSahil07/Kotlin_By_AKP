package GenericDataType_Kotlin

class GenericExp5<info>(var name: info, var age: info ) {
    fun showGenInfo(){
        println("$name: $age")
    }
}
 fun main(){
     val genExpAll = GenericExp5("Johnny", 28)
     genExpAll.showGenInfo()
 }