package AnonymousInnerClassInsideMainFun_Kotlin

interface SoftwareDeveloper1 {

     var dName: String
     var dType: String
     fun dSalary(): Int
     fun dExperience(): Int
     fun dProject(): String
  }

 fun main(){
      val sDeveloper = object:SoftwareDeveloper1{
          override var dName: String = "John Travolta"
          override var dType: String = "Backend Developer"
          override fun dSalary(): Int = 5_000_0000
          override fun dExperience(): Int = 7
          override fun dProject(): String = "Live Project"
      }
     println("Developer's Name: "+ sDeveloper.dName)
     println("Type of Developer: "+sDeveloper.dType)
     println("Salary of Developer: "+sDeveloper.dSalary())
     println("Years of Experience of Developer: "+sDeveloper.dExperience())
     println("Type of Project : "+ sDeveloper.dProject())

 }