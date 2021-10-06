package LiteralsIn_Kotlin

 class CharLiterals{
     fun literalsOfChar(){
      val lit1: Char = 'K'
      val lit2: Char = 'O'
      val lit3: Char = 'T'
      val lit4: Char = 'L'
      val lit5: Char = 'I'
      val lit6: Char = 'N'
      println("$lit1 $lit2 $lit3 $lit4 $lit5 $lit6" )
      /* In Character literals we can have
      *  single alphabet form 'a' to 'z' and
      *  digits from '0' to '9' and symbols '@'
      *  we cannot include two or more digits in characters
      *  eg 'abc' this will be incorrect*/
     }
 }
fun main(){
 val charLit = CharLiterals()
 charLit.literalsOfChar()

}