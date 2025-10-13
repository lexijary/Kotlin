fun printReversed(text: String?) {
    val result = text?.reversed()?.uppercase() ?: "???"
    println("Result: ${result}")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}

// other examples
// prices.getOrElse(item) { 15 }
// prices.getOrElse(item) {
//    throw NoSuchElementException("No price for $item")
// }

// prices[item] ?: 15
// prices[item] ?: throw NoSuchElementException("No price for $item")

