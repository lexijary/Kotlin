// Task 10.1: program in which null values can occur

fun printReversed(text: String) {
    val result = text.reversed().uppercase()
    println("Result: $result")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}

//Now we can finally explain why the compilation error in Null.kt occurs. The function readLine() has a return type of String?, meaning it might return a String object or it might return a null. Thus the type of variable input is also String?. The error occurs because printReversed() is expecting a non-nullable string as an argument, but it is being given a nullable string.