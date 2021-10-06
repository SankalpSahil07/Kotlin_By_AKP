package FilterMap_Kotlin

 fun main() {
     val listDemo = listOf<Int>(1,2,3,4,5,6,7,8,9,70,90)
     val  ld =  listDemo.map { it * it }
   for (demoList in ld)
    println(demoList)
}