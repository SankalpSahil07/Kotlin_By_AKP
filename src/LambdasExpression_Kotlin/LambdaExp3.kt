package LambdasExpression_Kotlin

import VarArgsInKotlin.show

fun main(){
    val add: (String, Double) -> Unit = {
        name, marks  -> println("Name of the Student: $name\nMarks Scored by the Student: $marks%")
    }
    show(add)
}
 fun show(get: (String, Double) -> Unit){
     get("Juan Deo", 98.3)
 }