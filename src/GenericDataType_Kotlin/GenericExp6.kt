package GenericDataType_Kotlin

class GenericExp6<S, I>(var name: S, var age: I) {
    fun showInfoGen(){
        println("$name $age")
    }
}
 fun main(){
     val gen1 = GenericExp6("Johnny", 29)
     gen1.showInfoGen()

     val gen2 = GenericExp6(31, "Rachael")
     gen2.showInfoGen()

     val gen3 = GenericExp6(3.2, true)
     gen3.showInfoGen()
 }
