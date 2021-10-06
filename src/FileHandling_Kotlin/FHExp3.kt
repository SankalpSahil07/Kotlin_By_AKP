package FileHandling_Kotlin

import java.io.FileWriter

fun main() {
      var fw = FileWriter("C:\\Users\\Sahil\\IdeaProjects\\Kotlin_By_AKP\\src\\FileReaderDemo.txt")
       fw.write(65)
       fw.write("This is Jeo")
       fw.flush()
}