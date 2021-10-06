package FileHandling_Kotlin

import java.io.FileNotFoundException
import java.io.FileReader

fun main() {
  try{
     var fileReader = FileReader("C:\\Users\\Sahil\\IdeaProjects\\Kotlin_By_AKP\\src\\FileReaderDemo.txt")
     for (f in fileReader.readLines()){
      println(f)
     }
   } catch (ex: FileNotFoundException){
      println("File Not Found")
   }
 }