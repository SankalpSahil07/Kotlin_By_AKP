package InFix_Extension_Kotlin

class MainCompanionObject {
   companion object
}
 fun MainCompanionObject.Companion.show(){
        println("Companion object show")
 }
 fun main(){
     MainCompanionObject.show()
 }