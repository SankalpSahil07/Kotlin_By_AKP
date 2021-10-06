package FilterMap_Kotlin

 fun main() {
     val demoList = listOf<Int>(1,2,3,4,5,6,7,8,9,20,120,550,700,900)
     val extract =  demoList.filter { it in 1..9 }.map { it * it }
     for (ext in extract)
         println(ext)
}