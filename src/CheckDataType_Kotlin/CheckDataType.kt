package CheckDataType_Kotlin

 fun main() {
      checkDatatype1(20)
      checkDatatype1("Orlando")
      checkDatatype1(true)
      checkDatatype1(3.12F)
      checkDatatype1(2.12)

    println("---------------------")

    checkDatatype2(30)
    checkDatatype2("John Deo")
    checkDatatype2(true)
    checkDatatype2(3.24F)
    checkDatatype2(2.4123)
    checkDatatype2(null)

 }

 fun checkDatatype1(dataType: Any?){
    when(dataType){
      is Int -> { println("Int: $dataType") }
      is String -> { println("String: $dataType") }
      is Boolean -> { println("Boolean : $dataType") }
      is Float -> { println("Float: $dataType") }
      is Double -> { println("Double: $dataType")}
       else -> { println("Else: $dataType")}
    }
 }
 fun checkDatatype2(dataType: Any?){
     if (dataType is Int){
       println("Square of $dataType: ${dataType * dataType}") }
     if (dataType is String){
      println("This is String: $dataType") }
     if (dataType is Boolean){
      println("Boolean : $dataType") }
     if (dataType is Float){
      println("Float : $dataType ") }
     if (dataType is Double){
      println("Double: $dataType") }
 }