package Enum_Kotlin

enum class MapDirection {
    NORTH, EAST, WEST, SOUTH;
    companion object {
        var num: Int? = 1
        fun showMapInfo(){
             println("Show Function in Direction Enum Class")
        }
    }
}

 fun main(){
     val mapDirection = when(MapDirection.EAST){
         MapDirection.EAST -> "Direction is EAST"
         MapDirection.WEST -> "Direction is WEST"
         MapDirection.SOUTH -> "Direction is SOUTH"
         MapDirection.NORTH -> "Direction is NORTH"
         else -> "Unknown Direction"
     }
     println(mapDirection)
     println("Value in direction Enum Class: ${MapDirection.num}")
     MapDirection.showMapInfo()
 }