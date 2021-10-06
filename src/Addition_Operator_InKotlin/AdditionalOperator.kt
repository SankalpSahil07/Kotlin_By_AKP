package Addition_Operator_InKotlin

class Addition(x: Int, y: Int){
    var x: Int = x
    val y: Int = y

     fun show(){
     println("z  = $x + $y i")
     }
   infix operator fun plus(addition: Addition):String{
        val ex1 = this.x + addition.x
        val ex2 = this.y + addition.y
        return "z = $ex1 + $ex2 i"
   }
}
 fun main(){
    val m1 = Addition(3, 5)
    m1.show()

     val m2 = Addition(5, 6)
     m1.show()
     println(m1 plus m2)
 }