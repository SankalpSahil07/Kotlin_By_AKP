package MapOfMutableAndImmutable_Kotlin

 fun main() {
     val mapDemo2 = mapOf<Int, String>(1 to "Ronaldo", 2 to "Neymar", 3 to "Messi", 4 to "Mbappe")
     println(mapDemo2[1]) // prints Ronaldo
     println(mapDemo2[5]) // null, because key 5 is not present
     println(mapDemo2.get(3)) // prints Messi
     println(mapDemo2.entries) // prints key value [1 = Ronaldo, 2 = Neymar, 3 = Messi, 4 = Mbappe]
     println(mapDemo2.keys) // [1, 2, 3, 4]
     println(mapDemo2.size) // 3
     println(mapDemo2.values) // [Ronaldo, Neymar, Messi, Mbappe]
     println(mapDemo2.containsKey(3)) // true
     println(mapDemo2.containsValue("Ronaldo")) // true
     println("-------Methods in mutableMapOf()-----------")
     println(mapDemo2.entries)
     println(mapDemo2.isEmpty())
 }