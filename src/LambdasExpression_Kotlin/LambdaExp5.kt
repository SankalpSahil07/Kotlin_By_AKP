package LambdasExpression_Kotlin

 val getCountry: (Int) -> String = {
     when(it){
         1 -> "Canada"
         7 -> "England"
         10 -> "Greece"
         30 -> "Italy"
         98 -> "India"
         99 -> "Brazil"
         else -> "No Country on the Selected Number "
     }
}
 fun main(){
     println(getCountry(1))
 }