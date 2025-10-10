fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main() {
    println("Please enter your string")
    val TextTest = readln()

    val DigitCount = TextTest.howMany {it.isDigit()}
    println("Digit Count = $DigitCount")
    val VowelCount = TextTest.howMany {it.lowercaseChar() in "aeiou"}
    println("Vowel Count = $VowelCount")
    val UpperCaseCount = TextTest.howMany { it.isUpperCase() }
    println("Uppercase Count: $UpperCaseCount")
    val LowerCaseCount = TextTest.howMany { it.isLowerCase() }
    println("Lowercase Count: $LowerCaseCount")
}
