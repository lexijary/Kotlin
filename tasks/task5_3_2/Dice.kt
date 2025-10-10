// Task 5.3.2: dice rolling simulation

import kotlin.random.Random

fun rollDie(sides: Int = 6, DieNo: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        var sum = 0
        for (n in 1..DieNo) {
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
            sum = sum + result
        }
        println("The total score across all die is ${sum}")

    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main() {
    print("Please enter how many sides you die has: ")
    val sideValue = readln()
    print("Please enter how many die you are using: ")
    val DieNo = readln()

    if (sideValue != "" && DieNo != ""){
        val result1 = readInt(sideValue)
        val result2 = readInt(DieNo)
        rollDie(result1, result2)
    }
    else if (sideValue != "" && DieNo == "") {
        val result1 = readInt(sideValue)
        rollDie(sides = result1)
    }
    else if (sideValue == "" && DieNo != "") {
        val result2 = readInt(DieNo)
        rollDie(DieNo = result2)
    }
    else {
        rollDie()
    }
}

fun readInt(user_input: String): Int {
    val value = user_input.toInt()
    return value
}
