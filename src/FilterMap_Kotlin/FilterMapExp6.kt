package FilterMap_Kotlin

class FilterMapExp6(var name: String, var age: Int) {

}
 fun main(){
     var filterList = listOf<FilterMapExp6>(
            FilterMapExp6("Ronaldo",36),
            FilterMapExp6("Messi", 34),
            FilterMapExp6("Jordan", 28),
            FilterMapExp6("kante", 30))
     val listName = filterList.map { 2021 - it.age }
     for(birthYear in listName)
         println("BirthYear: $birthYear")
 }