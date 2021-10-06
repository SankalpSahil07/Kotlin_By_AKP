package Constructor_Kotlin

class KotlinConstructor{

    private var name: String? = null
    private var age: Int = 0
    private var marks: Double = 0.0

    constructor(name: String){
        this.name = name
    }
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    constructor(name: String = "John", age : Int = 25, marks: Double = 95.3){
        this.name = name
        this.age = age
        this.marks = marks
    }
    fun getData(){
        println("Name : $name")
        println("Age: $age")
        println("Marks: $marks")
    }
}
  fun main(){
      val name1 = KotlinConstructor("John")
      name1.getData()
      println("______")
      val infoTwo = KotlinConstructor("David", 23)
      infoTwo.getData()
      println("_______")
      val infoThree = KotlinConstructor("Austin", 21, 98.4)
      infoThree.getData()
      println("_____")
  }