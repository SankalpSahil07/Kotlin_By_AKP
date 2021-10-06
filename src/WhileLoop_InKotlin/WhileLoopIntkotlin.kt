package WhileLoop_InKotlin

fun main(){

    var sum = 0
    var i = 100
    while (i !=0){
        sum += i
        --i
    }
    println("sum = $sum")
}