package VarArgsInKotlin

fun main(){
    val numbs = intArrayOf(1,2,3,4,5,6,7,8,9)
    displayArray(*numbs)
}
fun displayArray(vararg numbs: Int){
    for (n in numbs){
        println(n)
    }
}