package AnonymousInnerClassInsideMainFun_Kotlin

interface DevelopersDetails {
     var name: String
     var age: Int
     var gender: String
     fun show()

  }
  fun main(){
      val developerDetails = object: DevelopersDetails{
          override var name: String
          get() = "Johnny"
          set(value){}
          override var age: Int
              get() = 24
              set(value) {}
          override var gender: String
              get() = "Male"
              set(value) {}

          override fun show() {
              println("Name of Developer:$name \n  Age of Developer: $age \n Gender of the Developer: $gender")
          }
      }
      developerDetails.show()
  }