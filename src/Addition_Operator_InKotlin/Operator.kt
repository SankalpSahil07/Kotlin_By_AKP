package Addition_Operator_InKotlin

 fun main(){
     println(5 * "Army \n ")
     println(15 plus 5)
     println(88 minus 11)
     println(22 div 7)
}

infix operator fun Int.plus(num: Int) = this + num
infix operator fun Int.minus(numb: Int) = this - numb

infix operator fun Int.times(name: String) = name.repeat(this)
infix operator fun Int.div(num: Int) = this.toDouble() / num.toDouble()