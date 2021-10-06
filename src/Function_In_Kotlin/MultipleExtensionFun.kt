package Function_In_Kotlin

class AndroidDevicesDetails{
    fun allDeviceInfo(){
        val deviceName: String = "Motorola one Fusion Plus"
        val devicePrice: Int = 20_000
        val deviceModel: String = "MDIEAA2"
        println("Name of the Device: $deviceName")
        println("Price of the Device: $devicePrice")
        println("Model No of the Device: $deviceModel")

    }

}
fun AndroidDevicesDetails.deviceOneInfo(phName: String, phPrice: Int, phModel: String){
    println("Name of the Device: $phName")
    println("Price of the Device: $phPrice")
    println("Model No of the Device: $phModel")
}

fun main(){

   val deviceOne = AndroidDevicesDetails()
    deviceOne.deviceOneInfo("Motorola One Power", 160000, "M3912801")
    deviceOne.allDeviceInfo()
}