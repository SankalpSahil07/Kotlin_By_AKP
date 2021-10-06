package VarArgsInKotlin

 fun main() {
   val arr = arrayOf(1,2,3,4,5,6,7,8,9)
  getArray(arr)

}
fun getArray(vararg arr: Array<Int>){
  for (a in arr){
    print(a)
  }
}