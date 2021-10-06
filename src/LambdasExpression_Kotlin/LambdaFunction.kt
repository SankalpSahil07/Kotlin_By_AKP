package LambdasExpression_Kotlin

class LambdaFunction {
    fun makeRev(name: String, doRev: (String) -> Unit) = doRev(name)
}
 fun main(){
     val lmdFun = LambdaFunction()
     val name: (String) -> Unit = {
         lmbString -> println(lmbString.reversed())
     }
     lmdFun.makeRev("Donald",name)
 }