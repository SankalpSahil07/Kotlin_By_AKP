package LazyKeyword_Kotlin

 val name: String by lazy {
     "Dwayne Johnson"
 }
 fun main(){
     println("$name is Accessed by Main Function")
      show()
     display()
 }
  fun show(){
   println("$name can also by accessed by show function")
  }
fun display(){
 println("$name can is accessed by display Function")
}
