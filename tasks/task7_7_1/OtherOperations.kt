val words = listOf("Apple", "Orange", "Apple", "Kiwi")

println(words.size)
println(words.isEmpty())
println(words.lastIndexOf("Apple"))
println(words.indexOf("Banana"))

val numbers = listOf(9, 3, 6, 2, 8, 5, 1)
val chunks = numbers.chunked(3)
println(chunks)

// min(), max(), sum() and average(), reversed(), sorted() and sortedDescending(), chunked(), distinct(), shuffled(), shuffle()