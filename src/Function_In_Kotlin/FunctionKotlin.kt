package Function_In_Kotlin

fun main(){
    myInfo()
    myInfo("Albert", "albert@gmail.com")
    myInfo("Nicolas", " nick@gmail.com", 2349274359)

}
fun myInfo(name: String = "John", email: String = "JohnDeo@gmai.com", mobileNo: Long = 9092378028){
    println("Name: $name \nEmail: $email \nMobile No: $mobileNo\n")
}
