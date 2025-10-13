import java.io.File
import kotlin.system.exitProcess

// The function is supposed to prevent the overwriting of a file that already exists:

fun writeToFile(lines: List<String>, filePath: File) {
    if (filePath.exists()) {
        println("Error: $filePath already exists!")
        exitProcess(1)
    }

    // rest of function not shown
}

// Now consider this function, which computes the variance for a numerical dataset:
fun variance(dataset: List<Double>): Double {
    if (dataset.size < 2) {
        return -1.0
    }

    val mean = dataset.average()
    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (dataset.size - 1)
}
