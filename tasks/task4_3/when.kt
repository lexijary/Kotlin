fun main() {
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        ...
    }

    when (day) {
        1, 3, 5 -> println("Take a walk")
        2, 4    -> println("Go to the gym")
        6, 7    -> println("Rest")
    }

    when {
        isPrime(x) -> println("x is a prime number")
        x % 2 != 0 -> println("x is odd")
        else       -> println("x is even")
    }


}