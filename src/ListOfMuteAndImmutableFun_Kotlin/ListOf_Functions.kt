package ListOfMuteAndImmutableFun_Kotlin

import LambdasExpression_Kotlin.sizeOf

fun main(){
    val listFun:  List<Int> = listOf(1,2,3,4,5,6,7,8,9,0)
    for (lf in listFun)
        println(""+ lf)
    println("\n[2] : "+listFun[2])
    println("listFun.get(0): "+ listFun.get(0))
    println("listFun.lastIndex: "+ listFun.lastIndex)
    println("listFun.last(): " +listFun.last())
    println("listFun.subList(0,5): " +listFun.subList(0,5))
    println("listFun.binarySearch{1}: "+listFun.binarySearch { 1 })
    println("listFun.binarySearch(5, 0, 1.size: "+listFun.binarySearch(5, 0, 1))
    println("listFun.asReversed(): "+ listFun.asReversed())
    println("listFun.size: " +listFun.size)
    println("listFun.dropSize: "+ listFun.dropLast(9))
    println("listFun.first(): "+ listFun.first())
    println("listFun.firstOrNull(): "+listFun.firstOrNull())
    println("listFun.single(): "+ listFun.single())
    println("listFun.max(): " + listFun.maxOf { 9 })
    println("listFun.count(): "+ listFun.count())
}