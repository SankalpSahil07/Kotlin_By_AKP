package InlineFunction_Kotlin

 fun main() {

      show(1000){
          "Johnny"
      }
}
inline fun show(have: Int, name: () -> String){
    println("$have: ${name()}")
}