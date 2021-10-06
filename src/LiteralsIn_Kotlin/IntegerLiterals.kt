package LiteralsIn_Kotlin

class IntegerLiterals {
    val age: Int = 25
    val experience: Int = 10
    val languages: Int = 4
    val salary: Int = 10_0000_0000
    /*  Note Int laterals can be divided by underscore *
     *  but we cannot add underscore in the Starting of *
     * the digits or End of the digit
     */
}
fun main(){
    val integerLiterals = IntegerLiterals()
    println("Age of Developer is: "+ integerLiterals.age)
    println("Experience of the Developer: " + integerLiterals.experience)
    println("Languages know by the developer: "+ integerLiterals.languages)
    println("Salary of the Developers: " +integerLiterals.salary)

}