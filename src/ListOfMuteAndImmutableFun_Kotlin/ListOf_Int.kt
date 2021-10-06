package ListOfMuteAndImmutableFun_Kotlin

/* List can be
*  var listFloat: List<Float> = listOf<Float>(1.2.f, 2.2f, 3.3f)
*  var listDouble: List<Double> = listOf<Double>(3.2, 4.2, 4.4)
*  var listBoolean: List<Boolean> = listOf<Boolean>(true, false, false, true)
*  var listString: List<String> = listOf<String>("Android", "IOS", "MAC")*/

fun main() {
    val listInt : List<Int> = listOf(1,2,3,4,5,6,7,8,9,0)
    for (li in listInt)
        println(li)
}