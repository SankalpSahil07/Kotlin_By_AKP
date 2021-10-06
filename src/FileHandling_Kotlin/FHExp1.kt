package FileHandling_Kotlin

import java.io.FileNotFoundException
import java.io.FileReader

fun main(){

      try {
          var readFile = FileReader("C:\\Users\\Sahil\\IdeaProjects\\Kotlin_By_AKP\\src\\FileReaderDemo.txt")
          var cr: Int?
          do {
              cr = readFile.read()
              print(cr.toChar())
          } while (cr != -1)
      }catch (ex : FileNotFoundException){
          println("File not Found ${ex.message}")
      }
}