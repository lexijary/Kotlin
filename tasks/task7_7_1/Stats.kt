// Task 7.7.1: stats for a numeric dataset

fun readData() = buildList<Float> {

    var UserNums = mutableListOf<Float>()
    var running = true
    while (true) {
        print("Please enter a floating point number: ")
        val UserInput = readln().toFloat()
        UserNums.add(UserInput)
        print("Would you like to add another floating point number to the list? Y/N ")
        val choice = readln().uppercase()
        if (choice == "N") {
            break
        }
    }

    return UserNums

}

fun Median(UserNums: List<Float>): Float {
    val ListLength = UserNums.size
    val SortedList = UserNums.sorted()

    if (ListLength % 2 == 1) {
        val Median = SortedList[ListLength / 2]  
        return Median
    } 
    else {
        val Median = (SortedList[ListLength / 2 - 1] + SortedList[ListLength / 2]) / 2 
        return Median 
    }
}

fun DisplayStats(UserNums: List<Float>) {
    val Min = UserNums.min()
    val Max = UserNums.max()
    val Sum = UserNums.sum()
    val Average = UserNums.average()
    val MedianVal = Median(UserNums)
    println("Minimum: %.2f, Maximum: %.2f, Median: %.2f, Sum: %.2f, Average: %.2f".format(Min, Max, MedianVal, Sum, Average)
)

}

fun main() {
    val UserData = readData()
    DisplayStats(UserData)
}
   