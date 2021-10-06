package ListOfMuteAndImmutableFun_Kotlin

fun main() {
    val listMute = ArrayList<Int> (10)
    listMute.add(2)
    listMute.add(5)
    listMute[1]
    listMute.add(8)
    listMute.add(2,4)
    for (listData in listMute)
        print(""+listData)
    println(listMute[2])
    println(listMute.get(0))
    println(listMute.lastIndex)
    println(listMute.last())
    println(listMute.subList(0, 5))
    println(listMute.binarySearch { 1 })
    println(listMute.binarySearch(2,4,9))
    println(listMute.size)
    println(listMute.dropLast(9))
    println(listMute.first())
    println(listMute.firstOrNull())
    println(listMute.single())
    println(listMute.count())
    println(listMute.maxOf { 9 })
    println(listMute.count())
    println("--------methods in mutable list")
    println(listMute.add(10))
    println(listMute.removeAt(0))
    println(listMute.remove(10))
    println(listMute.set(2,55))
    println(listMute.reversed())
    println(listMute.shuffle())
    println(listMute.sort())
    println(listMute.sortByDescending { -1 })
    println(listMute.fill(value = 0))
    println("----------Array ListOf---------")
    for (lsm in listMute){
        println(listMute)
    }
    println(listMute.ensureCapacity(10))
    for (ls in listMute){
        print(ls)
    }
    println()
    println(listMute.trimToSize())
    println(listMute.toArray())
}