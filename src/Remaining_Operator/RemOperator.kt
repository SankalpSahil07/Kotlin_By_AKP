package Remaining_Operator

class RemOperator {
    private var x : Int = 50
    private var y : Int = -30

    operator fun plus(remOperator: RemOperator): Int = this.x + remOperator.y
    operator fun minus(remOperator: RemOperator): Int = this.x - remOperator.y
    operator fun times(remOperator: RemOperator): Int = this.x * remOperator.y
    operator fun div(remOperator: RemOperator): Float = (this.x / remOperator.y).toFloat()
    operator fun rem(remOperator: RemOperator): Int = this.x % remOperator.y
    operator fun rangeTo(remOperator: RemOperator) : IntProgression = this.x downTo remOperator.y

    operator fun unaryPlus() = -y
    operator fun unaryMinus() = -y
    operator fun not() = x==50 // x > y | x < y | x == y
}
 fun main(){
     val remOperator1 = RemOperator()
     val remOperator2 = RemOperator()

     println("Add: ${remOperator1 + remOperator2}")
     println("Sub: ${remOperator1 - remOperator2}")
     println("multi: ${remOperator1 * remOperator2}")
     println("div: ${remOperator1 / remOperator2}")
     println("rem: ${remOperator1 % remOperator2}")
     println("Range: ${remOperator1..remOperator2}")

     println("_____________End of Arithmetic")

     println("Unary Plus: ${+remOperator1}")
     println("Unary Minus: ${-remOperator1}")
     println("Unary Not: ${!remOperator1}")
     println("_______________End of Unary")

     /* a += b  is similar to a = a + b  */
 }