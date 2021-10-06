package FilterMap_Kotlin

class FilterMapExp5(var name: String, var age: Int) {

}
 fun main(){
     var filterList = listOf<FilterMapExp5>(
         FilterMapExp5("Ronaldo", 7),
         FilterMapExp5("Messi", 11),
         FilterMapExp5("Neymar", 10),
         FilterMapExp5("Ramos", 4))
     var playerList = filterList.filter { it.name.startsWith("R") }
     for(pName in playerList)
         println()
 }