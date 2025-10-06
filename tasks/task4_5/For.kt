fun main() {
    val message = "Hello!"
    for (character in message) {
        println(character)
    }
    // The loop variable of a for loop is implicitly a val.

    for (n in 1..10) {
        println(n)
    }

    for (n in 2..20 step 2) {
        println(n)
    }

    for (n in 10 downTo 1) {
        println(n)
    }

    for (n in 10 downTo 1 step 2) {
        println(n)
    }
}