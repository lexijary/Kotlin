// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here

    // test for empty file

    if (args.isEmpty()) {
        println("ERROR: file is empty")
        exitProcess(1)
    }

    val NameofFile = args[0]
    val data = try {
        readData(NameofFile)
    }
    catch (error: Exception) {
        println("Error when trying to read file")
        exitProcess(1)
    }

    val VarianceResult = variance(data)
    if (VarianceResult == -1.0) {
        print("You have not provided enough data. Need two numbers to calculate variance.")
        exitProcess(1)
    }
    else{
        println("Variance = ${VarianceResult}")
    }

}
