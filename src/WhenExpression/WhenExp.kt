package WhenExpression

fun main(){
    val mode : Int = 3

    val result = when(mode){
        1 -> "This is the First Mode"
        2 -> "This is the Second Mode"
        3 -> {
            println("The mode is 2")
            val i = 3
            "Reason why it is occupied"
        }
        4 -> "The mode is super productive"
        else -> "Don't know about this mode"
    }
    println(result)
    val x = if (mode > 2){
        println("Mode is less than 2")
        27
    } else{
        42
    }
     println(x)
}