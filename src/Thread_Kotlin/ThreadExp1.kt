package Thread_Kotlin

class ThreadExp1: Thread() {
     override fun run(){
         for (x in 1..10){
             println("ThreadExp1 run")
             try {
                 Thread.sleep(1000)
             }catch (e: InterruptedException){
                 println(e.message)
             }
         }
     }
}
fun main(){
     val thread1 = ThreadExp1()
     thread1.start()
     for (x in 1..10){
         try {
             println("ThreadExp1 Function")
             Thread.sleep(1000)
         } catch (e: InterruptedException){
             println(e.message)
         }
     }
}