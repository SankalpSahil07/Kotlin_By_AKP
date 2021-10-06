package FilterMap_Kotlin

 fun main(){
   val list = listOf(1,2,3,4,5,6,7,8,9,10,40,90,140,180,440,880)
   val extract =  list.filter { it in 11..99 }
    for (ext in extract)
     println(ext)
 }
