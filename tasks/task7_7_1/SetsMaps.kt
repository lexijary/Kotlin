val fixedOptions = setOf("Save", "Load", "Quit")
val fixedPrices = mapOf(
    "Apple" to 32,
    "Orange" to 55,
    "Kiwi" to 20
)

val options = mutableSetOf("Save", "Load", "Quit")
val prices = mutableMapOf<String,Int>()   // key & value types needed!

val names = mutableSetOf("Joe", "Sarah", "Nicole")
print("Enter your name: ")
val name = readln()
if (names.add(name)) {
    println("$name added")
}
else {
    println("I'm sorry, we already have a $name")
}

val prices = mutableMapOf(
    "Apple" to 32,
    "Orange" to 55,
    "Kiwi" to 20
)
println(prices["Apple"])   // prints 32
println(prices["Pear"])    // ?
prices.getOrElse(item) { 15 }
prices.getOrElse(item) {
    throw NoSuchElementException("No price for $item")
}

prices["Apple"] = 40    // updates price of Apple
prices["Banana"] = 65   // introduces new item & price
