package FilterMap_Kotlin

 fun main(){
    val demoList = listOf<Int>(1,2,3,4,5,6,7,8,9,90,180,440, 790, 900)
    val extract = demoList.filter { it in 11..99 }
    for (ext in extract)
     println(ext)
}