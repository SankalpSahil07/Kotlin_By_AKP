package Thread_Kotlin

class ThreadExp2: Thread() {
     override  fun run(){
         try {
             repeat(10){
                 println("ThreadExp2 class Run Method")
             }
         } catch (ex: InterruptedException){
             ex.printStackTrace()
         }
     }
}
class Sub: Thread(){
    override fun run() {
        try {
            repeat(10){
                println("Sub Class run method")
            }
        } catch (ex: InterruptedException){
            ex.printStackTrace()
        }
    }
}
fun main(){
     val td1 : ThreadExp2 = ThreadExp2()
     val td2 : Sub = Sub()

     td1.start()
     td2.start()
    try {
        repeat(10){
            println("Main method_____")
        }
    } catch (ex: InterruptedException){
        ex.printStackTrace()
    }
}