package Condition_ForLoop_In_Kotlin

 fun main(){
     val languages = arrayOf("C#", "Kotlin", "Java", "Python", "JavaScript", "Flutter")
     for ((index, value) in languages.withIndex()){
       println("The element in $index is $value")
     }
}