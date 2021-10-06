package LazyKeyword_Kotlin

/*  Syntax:
*         val variableName: Primitive_NonPrimitiveDataType by Lazy{
*           initialValueOfRespectDataType
* */

 var pi = lazy {

      3.14
 }
fun main(){
    println(pi)
}