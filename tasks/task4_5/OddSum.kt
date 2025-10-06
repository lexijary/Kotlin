// Task 4.5: summing odd integers with a for loop

fun main() {


    print("Please enter the limit: ")
    val limit = readln().toInt()
    print(limit)
    var sum = 0

    for (n in 1..limit step 2) {
        sum = sum + n
    }

    println("The total sum of odd integers is ${sum}")
}