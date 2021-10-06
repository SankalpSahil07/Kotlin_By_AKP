package DataKeyword_Kotlin

data class DataKeyword(var uName: String, var uAge: Int){
  }
 fun main(){
     val dataKeyword1 = DataKeyword("John Deo", 29)
     println("HashCode of dataKeyword1: ${dataKeyword1.hashCode()}")
     val dataKeyword2 = DataKeyword("Orlando", 28)
     println("HashCode of dataKeyword2: ${dataKeyword2.hashCode()}")

     // case 1
     val  dataKeyword3 = dataKeyword1.copy()
     println("HashCode of dataKeyword3: ${dataKeyword3.hashCode()}")

     // case 2
     val dataKeyword4 = dataKeyword1.copy(uName = "Dora")
     println("HashCode of dataKeyword4: ${dataKeyword4.hashCode()}")

     // case 3
     val dataKeyword5 = dataKeyword1.copy(uAge = 30)
      println("HashCode of dataKeyword5: ${dataKeyword5.hashCode()}")

 }