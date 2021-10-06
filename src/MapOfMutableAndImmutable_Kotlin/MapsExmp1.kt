package MapOfMutableAndImmutable_Kotlin

 fun main() {
     val mapDemo = mapOf<Int, String>(1 to "John Deo", 2 to "Orlando", 3 to "Charlie")
     println(mapDemo[1]) // prints John Deo
     println(mapDemo[9])  // null, because key 10 is not present
     println(mapDemo.get(3)) // prints Charlie
     println(mapDemo.entries) // prints all the elements with key value[1 = John Deo, 2 = Orlando, 3 = Charlie]
     println(mapDemo.keys) // prints only the key [1,2,3]
     println(mapDemo.size) // prints the size of map that is 3
     println(mapDemo.values) // prints the value [ John Deo, Orlando, Charlie]
     println(mapDemo.contains(key = 3)) // true
     println(mapDemo.containsValue("John Deo")) // true
 }