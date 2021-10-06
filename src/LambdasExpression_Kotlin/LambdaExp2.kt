package LambdasExpression_Kotlin

import SwitchCase_When_Kotlin.sum

fun main(){
    val lambdaExp2: (Int, Int) -> Unit ={
            x, y -> print(x+y)
        }
            sum(5,5, lambdaExp2 )
    }
    fun sum(a:Int, b: Int, takeLam: (Int, Int) -> Unit){
            takeLam(a,b)
    }
