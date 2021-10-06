package GenericDataType_Kotlin

 interface MainClass{
  fun<S>  showInfo(x: S){
      println("$x")
  }
}
 fun main(){
  val mClass = object : MainClass{
   override fun <S> showInfo(x: S) {
    super.showInfo(x)
   }
  }
  mClass.showInfo("Albert")
  mClass.showInfo('S')
  mClass.showInfo(3.12)
  mClass.showInfo(1000)
  mClass.showInfo(true)
 }