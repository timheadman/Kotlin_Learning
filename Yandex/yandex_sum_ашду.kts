import java.io.File
import java.io.PrintWriter

val outputFile = File("output.txt")

PrintWriter(outputFile).use { writer ->
    writer.println(File("input.txt").useLines { it.firstOrNull() }?.split(" ")?.map { it.toInt() }?.sum())
}