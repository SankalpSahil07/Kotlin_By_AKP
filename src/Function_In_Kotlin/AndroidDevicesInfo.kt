package Function_In_Kotlin

class AndroidDevicesInfo{
    fun androidDevicesOne(){
        val adName: String = "Motorola G5SPlus"
        val adPrice: Int = 13_000
        val adManufactureYear = 2018
        println("Device Name: $adName")
        println("Device Price: $adPrice")
        println("Device Manufacture Year: $adManufactureYear\n")
    }
}
fun AndroidDevicesInfo.androidDeviceTwo(){
      val modelNumb = 19
       if (modelNumb > 21){
           println("This is Manufactured in 2021\n")
       } else if (modelNumb < 20){
           println("This is Manufactured in 2019\n")
       } else if (modelNumb == 20) {
           println("This Manufactured in 2020\n")
       } else{
           println("The Device is out Dated\n")
       }
}
fun AndroidDevicesInfo.androidDeviceThree(dvName: String, dvPrice: Int, dvYear: Int){
    println("Name of the Device: $dvName")
    println("Price of the Device: $dvPrice")
    println("Manufacture Year of the Device: $dvYear\n")
}
 fun main(){
     val androidDevicesInfo = AndroidDevicesInfo()
     androidDevicesInfo.androidDevicesOne()
     androidDevicesInfo.androidDeviceTwo()
     androidDevicesInfo.androidDeviceThree("Motorola Fusion 20", 29_000, 2021)
 }