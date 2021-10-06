package ListOfMuteAndImmutableFun_Kotlin

fun main(){
    var muteList : MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9)
    muteList.add(10)
    muteList.remove(2)
    for (ml in muteList)
        println(ml)
}