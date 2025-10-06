// Task 5.1.1: anagram checking using a function

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    print("Please enter your first String: ")
    val String1 = readln()
    print("Please enter your second String: ")
    val String2 = readln()
    val result = anagrams(String1, String2)
    if (result == true) {
        println("Is an anagram")
    } 
    else {
        println("Is not an anagram")
    }
}