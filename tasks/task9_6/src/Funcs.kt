// Task 9.6: functions for dataset variance calculation
import java.io.File
// Add variance() function here

fun variance(dataset: List<Double>): Double {
    if (dataset.size < 2) {
        return -1.0
    }

    val mean = dataset.average()
    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }
    return sumSquaredDev / (dataset.size - 1)
}

// Add readData() function here

fun readData(filename: String) = buildList {
    File(filename).forEachLine {
        add(it.toDouble())
    }
}

