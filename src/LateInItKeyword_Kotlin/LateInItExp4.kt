package LateInItKeyword_Kotlin

class SoftwareDevelopers {
    lateinit var sdName: String
     fun javaDeveloper(){
         sdName = "Norman Chadwick"
         println("$sdName is the Java Developer with 3years of Experience")
     }
    fun kotlinDeveloper(){
        sdName = "Tim Buchlaka"
        println("$sdName is the Kotlin Developer")
    }
    fun jsDeveloper(){
        sdName = "Austin Marks"
        println("$sdName is the JavaScript Developer with 5years of Experience")
    }
}
 fun main(){
     val softwareDevelopers = SoftwareDevelopers()
     softwareDevelopers.sdName  = "Miles Parker"
     println("${softwareDevelopers.sdName}  is the FullStack developer with 8years Experience")
     softwareDevelopers.javaDeveloper()
     softwareDevelopers.kotlinDeveloper()
     softwareDevelopers.jsDeveloper()

 }