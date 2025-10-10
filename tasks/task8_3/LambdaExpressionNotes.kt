fun isEven(n: Int): Boolean {
    return n % 2 == 0
}
fun isEven(n: Int) = n % 2 == 0
{ n: Int -> n % 2 == 0 }


val numbers = listOf(1, 4, 7, 2, 9, 3, 8)
val evenNumbers = numbers.filter(::isEven)
val evenNumbers = numbers.filter({ n: Int -> n % 2 == 0 })

val evenNumbers = numbers.filter({ n -> n % 2 == 0 })
val evenNumbers = numbers.filter({ it % 2 == 0 })
val evenNumbers = numbers.filter() { it % 2 == 0 }
val evenNumbers = numbers.filter { it % 2 == 0 }

val numbers = intArrayOf(9, 3, 6, 2, 8, 5)
val firstEven = numbers.first { it % 2 == 0 }
val words = listOf("Hello", "Goodbye", "Ciao", "", "Hi", "")
val lastNonBlank = words.last { it.isNotBlank() }

var lowest = dataset[0]
for (measurement in dataset) {
    if (measurement.second < lowest.second) {
        lowest = measurement
    }
}
val lowest = dataset.minBy { it.second }

dataset.sortedBy { it.first }.forEach { println(it) }

val words = listOf("Hello", "Hi", "Goodbye", "Bye")
val shortWords = words.filter { it.length < 5 }
val numbers = listOf(1, 4, 7, 2, 9, 3, 8)
val squares = numbers.map { it * it }
numbers.filter { it % 2 != 0 }.map { it * it }


