package SealedClass_Kotlin

sealed class SealedExp5 {

    class Sealed1(){
        fun showSealed1(){
            println("Sealed Fun > Sealed 1")
        }
    }
    class Sealed2(){
        fun showSealed2(){
            println("Sealed Fun > Sealed 2")
        }
    }
    class Sealed3(){
        fun showSealed3(){
            println("Sealed Fun > Sealed 3")
        }
    }
    sealed class  SubClass: SealedExp5(){
          class SubMain{
              fun showSub(){
                  Sealed1().showSealed1()
                  Sealed2().showSealed2()
                  Sealed3().showSealed3()
              }
          }
    }

 }
fun main(){
    SealedExp5.SubClass.SubMain().showSub()
}
