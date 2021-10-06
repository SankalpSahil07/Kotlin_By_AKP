package InlineFunction_Kotlin


fun main() {

    showInfo("Hola Senor."){
        requestName()
    }

}
 fun requestName(){
     print("Orlando")
 }
 inline fun<T> showInfo(pre: T, name: T.()-> Unit){
        print(pre)
        pre.name()
 }