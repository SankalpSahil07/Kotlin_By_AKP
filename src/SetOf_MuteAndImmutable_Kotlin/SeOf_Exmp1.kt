package SetOf_MuteAndImmutable_Kotlin

fun main() {
    val setData = setOf<Int>(1,2,3,4,5,6,7,8,9,0)
    for (set1 in setData)
        print(set1)
    println(setData.size)
    println(setData.minus(7))
    println(setData.plusElement(3))
    println(setData.stream())
    println(setData.contains(9))
    println(setData.isEmpty())
    println(setData.average())
    println(setData.count())
    println(setData.first())
    println(setData.chunked(3))
    println(setData.distinct())
    println(setData.drop(2))
    println(setData.last())
    println(setData.reversed())

    println(setData.sorted())
    println(setData.sortedBy { -1 })
    println(setData.sum())
    println(setData.toIntArray())
    println(setData.toList())
}