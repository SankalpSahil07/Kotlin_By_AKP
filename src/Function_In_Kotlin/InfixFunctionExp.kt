package Function_In_Kotlin

fun main(){

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Android Application Developer")

    val pair = "Lamborghini" to "Bugatti"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" to "Ferrari"
    println(myPair)

    val player1 = InfixFunctionExp("Ronaldo")
    val player2 = InfixFunctionExp("Messi")
    player1 likes player2
}
class InfixFunctionExp(val name: String) {
    val likedFunction = mutableListOf<InfixFunctionExp>()
    infix fun likes(other: InfixFunctionExp){
        likedFunction.add(other)
    }
}