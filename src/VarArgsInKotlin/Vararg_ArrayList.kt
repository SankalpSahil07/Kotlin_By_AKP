package VarArgsInKotlin

 fun main() {
  val arr = listOf(1,2,3,4,5,6,7,8,9)
  getArray(arr)
  }
fun getArray(vararg arr: List<Int>){
  for (a in arr)
   print(a)
}