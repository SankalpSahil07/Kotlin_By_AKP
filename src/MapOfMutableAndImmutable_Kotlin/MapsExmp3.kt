package MapOfMutableAndImmutable_Kotlin

 fun main() {
     var mapDemo3 = HashMap<Int, String>(5)
      mapDemo3.put(1, "Ronaldo")
      mapDemo3.put(2, "Messi")
      mapDemo3.put(3, "Neymar")
      mapDemo3[4] = "Mbappe"
      mapDemo3.put(5, "Rooney")
      mapDemo3.put(6, "Beckham")
      mapDemo3.put(7, "Kante")

     println(mapDemo3[1]) //  prints Ronaldo
     println(mapDemo3[3])   //  prints Neymar
     println(mapDemo3.get(4))  // prints Mbappe
     println(mapDemo3.entries)  // [1= Ronaldo, 2= Messi, 3= Neymar, 4=Rooney, 6= Beckham, 8=Kante]
     println(mapDemo3.keys)
     println(mapDemo3.getValue(3)) // prints Neymar
     println(mapDemo3.containsKey(8)) // null
     println(mapDemo3.containsValue("Neymar")) // true

     println(mapDemo3.replace(3,"Saurez")) // Messi
     println(mapDemo3.remove(4)) // Mbappe
     println(mapDemo3.minusAssign(2)) // kotlin.Unit
     println(mapDemo3.set(4, "Ramos")) // kotlin.Unit
     println(mapDemo3.entries) // [1=Ronaldo, 3=Saurez, 4=Ramos]
     println(mapDemo3.clear())  // remove all entries
     println(mapDemo3.entries) // []

 }