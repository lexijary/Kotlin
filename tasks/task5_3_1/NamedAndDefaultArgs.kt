val balance = applyInterest(1200.0, 1.7, 3)

val balance = applyInterest(amount=1200.0, rate=1.7, years=3)

val balance = applyInterest(rate=1.7, amount=1200.0, years=3)

fun greet(target: String = "World") {
    println("Hello $target!")
}
greet()        // prints Hello World!
greet("Joe")   // prints Hello Joe!

readCsvFile("data.csv")
readCsvFile("data.csv", skip=10)
readCsvFile("data.csv", separator='|')
readCsvFile("data.csv", skip=5, separator=':')


