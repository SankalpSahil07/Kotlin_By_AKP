package InterfaceAccessByTwoClass_Kotlin

import Inheritance_Kotlin.InterfaceDemo1

interface Store{
    var name: String
    var owner: String
    fun income(): Int
    fun invest(): Int
    fun shopType(): String
}
class StoreDetails: Store{
      override var name: String = "Dark Market"
      override var owner: String = "Walter White"
      override fun income(): Int = 80_00_000
      override fun invest(): Int  = 10_00_000
    override fun shopType(): String = "Own Made Drugs"
}
class Lab: Store{
      override var name: String = "White Store"
      override var owner: String = "Jesse PinkMan"
      override fun income(): Int = 40_000_0000
      override fun invest(): Int = 50_000_0000
      override fun shopType(): String = "Every Single Drugs Including Meth"
}
fun main(){
    val storeDetails = StoreDetails()
    println("Shop Name: "+ storeDetails.name)
    println("Owner Name: "+ storeDetails.owner)
    println("Income: "+ storeDetails.income())
    println("Invested: "+storeDetails.invest())
    println("Shop Type: "+storeDetails.shopType())

   println("_______________")

    val store1 = Lab()
    println("Shop Name: "+ store1.name)
    println("Owner Name: "+ store1.owner)
    println("Income: "+ store1.income())
    println("Invest: "+ store1.invest())
    println("Shop Type: "+ store1.shopType())


}

