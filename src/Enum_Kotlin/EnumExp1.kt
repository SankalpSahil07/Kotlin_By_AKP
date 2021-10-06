package Enum_Kotlin

 enum class Direction{
     EAST, WEST, NORTH, SOUTH
}
 fun main(){
      val direction = Direction.EAST

      if (direction == Direction.WEST)
       println("Direction is West")

      else if(direction == Direction.SOUTH)
       println("Direction is South")

       else if (direction == Direction.NORTH)
        println("Direction is North")

        else
         println("Direction is East")
 }
