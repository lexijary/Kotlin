import kotlin.random.Random

fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main() {
    print("Please enter how many sides you die has: ")
    val sideValue = readln()
    if (sideValue == "") {
        println("\nRolling a default 6-sided die:")
        rollDie()
    }
    else {
        val result = readInt(sideValue)
        rollDie(result)
    }
    
}

fun readInt(user_input: String): Int {
    val value = user_input.toInt()
    return value
}
