package InlineFunction_Kotlin

class InlineFunExp1(var name: String, var age: Int) {
    inline fun showData( dName: String, dSalary: Int ){
        println("Name : $name")
        println("Age: $age")
        println("Name of the Developer: $dName")
        println("Age of the Developer: $age")
    }
}
fun main(){
    val inlineDemo = InlineFunExp1("Johnny", 29)
    inlineDemo.showData("Exodus", 20_00_000)


}