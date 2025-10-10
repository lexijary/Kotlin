infix fun String.anagramOf(second: String): Boolean = (this.lowercase().toList().sorted() == second.lowercase().toList().sorted()) && (this.length == second.length)

fun main() {
    print("Please enter your first String: ")
    val String1 = readln()
    print("Please enter your second String: ")
    val String2 = readln()

    if (String1 anagramOf String2) {
        println("$String1 and $String2 are anagrams!")
    }
    else {
        println("$String1 and $String2 are not anagrams.")
    }

}