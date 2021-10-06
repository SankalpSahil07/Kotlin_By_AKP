package LambdasExpression_Kotlin

import SwitchCase_When_Kotlin.sum

fun main(){
    val lambdaEpx: (Int, Int) -> Int = {
            x, y ->  x+y
      }
            sum(8,4, lambdaEpx)
    }
    fun sum(a: Int, b: Int, lamTakes: (Int, Int) -> Int){
        println(lamTakes(a,b))

}