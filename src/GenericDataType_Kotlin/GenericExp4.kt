package GenericDataType_Kotlin

class GenericExp4 {
    fun<T> showAllGen(strValue: T, integerValue: T, doubleValue: T, charValue: T, boolValue: T){
        println("String: $strValue")
        println("Integer: $integerValue")
        println("Double: $doubleValue")
        println("Character: $charValue")
        println("Boolean: $boolValue")
    }
}
fun main(){
    val genExp = GenericExp4()
    genExp.showAllGen("Johnny", 2312341345, 3.2342, 'A', true)
}