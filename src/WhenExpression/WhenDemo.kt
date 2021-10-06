package WhenExpression

 fun main(){
     val numb = 10
     val allNumb = when(10){
         1 -> println("Selected Number is 1")
         2 -> println("Selected Number is 2")
         3 -> println("Selected Number is 3")
         4 -> println("Selected Number is 4")
         5 -> println("Selected Number is 5")
         6 -> println("Selected Number is 6")
         7 -> println("Selected Number is 7")
         8 -> println("Selected Number is 8")
         9 -> println("Selected Number is 9")
         10 -> println("Selected Number is 10")
         else -> println("Selected Number is out of Range")
     }
     println("You have selected $allNumb")
}