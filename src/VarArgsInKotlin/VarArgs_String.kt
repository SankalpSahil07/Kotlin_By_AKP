package VarArgsInKotlin

fun main(){

     show("Ronaldo", "Messi", "Neymar", "Mbape", "Ramos")
}
 fun show(vararg players: String){
    println(players.size)
    println(players.toList())
    println(players.sorted())
    println(players.indices)
    println(players.filter { it.endsWith("s", true) })
 }