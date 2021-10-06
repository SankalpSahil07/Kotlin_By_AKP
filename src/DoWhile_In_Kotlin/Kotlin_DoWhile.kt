package DoWhile_In_Kotlin

fun main(){
    var sum: Int = 0
    var input : String
    do {
        print("Enter a Integer: ")
        input = readLine()!!
        sum += input.toInt()
    }while (input != "0" )

    println("sum  = $sum")
}