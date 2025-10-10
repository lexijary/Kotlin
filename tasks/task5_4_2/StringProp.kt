val String.tooLong: Boolean get() = this.length > 20

fun main() {

    print("Please enter a string ")
    val UserInput = readln()

    if (UserInput.tooLong) {
        println("This string is greater than 20 characters. Too Long!")
    }
    else {
        println("Perfect")
    }
}
