package FilterMap_Kotlin

fun main() {
  var name1: String  = " "
  var name2: String? = null
  var name3: String = "John Deo"
  var demoList = listOf(1,2.4,name1, name2, name3)
 val ex = demoList.filterNotNull()
 for (ex in demoList)
  println(ex)
 

}