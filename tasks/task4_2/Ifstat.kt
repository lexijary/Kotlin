fun main() {
    if (number < 0) {
        println("Number too low")
    }
    else if (number > 100) {
        println("Number too high")
    }
    else {
        println("Number OK")
    }

    if (number < 0 || number > 100) {
        println("Number is out of range")
    }

    val message = if (number < 0) {
        "Number too low"
    }
    else if (number > 100) {
        "Number too high"
    }
    else {
        "Number OK"
    }

    val sign = if (number < 0) '-' else '+'

}