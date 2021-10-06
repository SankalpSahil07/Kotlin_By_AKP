package InlineFunction_Kotlin

 fun main(){
     show(1000){
         "Juan"
     }
}
 inline fun<A> show(a: A, name: A.() -> String){
     println("value : $a")
     println(a.name())
 }