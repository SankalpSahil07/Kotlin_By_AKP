package LateInItKeyword_Kotlin

class AndroidDeveloper {
    lateinit var dName : String
    fun frontEndDeveloper(){
        dName = "John Deo"
        println("Name of the Frontend Developer $dName")
    }
    fun backEndDeveloper(){
        dName = "Jack Tyson"
        println("Name of the Backend Developer $dName")
    }
}
fun main(){
    val developer = AndroidDeveloper()
    developer.dName = "Norman Alis"
    println("Name of the Full Stack Developer ${developer.dName}")
    developer.frontEndDeveloper()
    developer.backEndDeveloper()
}