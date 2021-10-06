package InFix_Extension_Kotlin

import kotlin.random.Random
import kotlin.random.nextInt

class MainInfix(var name: String)
        fun main(args:Array<String>){
            val mainName = MainInfix("John")
            val mainDest = MainInfix("USA")
          println(mainName from mainDest)
            calculateNumb()
        }
    private infix fun MainInfix.from(main: MainInfix): String = "${this.name} from ${main.name}"

fun calculateNumb(){
    val random = Random.nextInt(6) + 1
    println(random)
}