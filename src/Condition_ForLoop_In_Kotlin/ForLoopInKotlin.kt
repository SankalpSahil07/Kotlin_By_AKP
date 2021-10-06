package Condition_ForLoop_In_Kotlin

fun main(){
    val numb = 1..100
     for (i in numb){
      println(i) // prints the range from 1 to 100
  }
    val numb1 =  7 downTo 1
    for (a in numb1){
        println(a)  // prints the range from 7 to 1
    }
    val numb2 = 1..10
    for (b in numb2.reversed()){
        println(b)  // prints the range from 1 to 10 in reversed order
    }
    val numb3 = 1..10
    for(c in numb3 step 2){
        println(numb3) // prints the range from 1 to 10 in step order
    }
    val numb4 = 1..10
    for(d in numb4){
        println(d)
    }
    println("Counted total Number is : ${numb4.count()}")
    // prints the range from 1 to 10 and counts the order

   val languages = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in languages){
        println("Selected Languages are $item")
    }
}