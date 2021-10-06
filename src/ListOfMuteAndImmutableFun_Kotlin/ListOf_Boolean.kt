package ListOfMuteAndImmutableFun_Kotlin

/* List can be
*  var listFloat: List<Float> = listOf<Float>(1.2.f, 2.2f, 3.3f)
*  var listDouble: List<Double> = listOf<Double>(3.2, 4.2, 4.4)
*  var listBoolean: List<Boolean> = listOf<Boolean>(true, false, false, true)
*  var listString: List<String> = listOf<String>("Android", "IOS", "MAC")*/


fun main(){
    val listBoolean: List<Boolean> = listOf<Boolean>(true, false, false, true)
    for (lb in listBoolean)
        println(lb)
}