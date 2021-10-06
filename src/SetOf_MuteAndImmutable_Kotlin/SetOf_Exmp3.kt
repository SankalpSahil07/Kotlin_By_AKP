package SetOf_MuteAndImmutable_Kotlin

 fun main(){
     val setOfList = hashSetOf<Int>(1,2,3,4,5,6,7,8,9,0)
      setOfList.add(10)
      setOfList.add(12)
      setOfList.add(13)

     for (setDemo1 in setOfList)
         print(setDemo1)
     println(setOfList.size)
     println(setOfList.minus(8))
     println(setOfList.plus(1))
     println(setOfList.plusElement(3))
     println(setOfList.stream())
     println(setOfList.isEmpty())
     println(setOfList.average())
     println(setOfList.chunked(2))
     println(setOfList.count())
     println(setOfList.distinct())
     println(setOfList.drop(3))
     println(setOfList.first())
     println(setOfList.last())
     println(setOfList.maxOf { 1 })
     println(setOfList.reversed())

     println(setOfList.add(14))
     println(setOfList.contains(10))
     println(setOfList.remove(12))
     println(setOfList.any())
     println(setOfList.toSet())
     println(setOfList.remove(10))
     println(setOfList.removeIf { setOfList.size > 10 } )

     println("-----methods in hashSetOf()--------")
     println(setOfList.spliterator())
     println(setOfList.contains(29))
     println(setOfList.remove(12))
     println(setOfList.any())
     println(setOfList.toSet())
     println(setOfList.any())
     println(setOfList.toSet())
     println(setOfList.toSet())
     println(setOfList.clear())
     for (setDemo2 in setOfList)
         print(setDemo2)
 }