fun isOdd(n: Int) = n % 2 != 0
fun Int.isOdd() = this % 2 != 0

// The name of the type being extended must be used as a prefix to the function name, with the two names separated by the period character

// The parameter list is now empty, because the integer value is no longer passed in as a function argument; instead it is the receiver of the function call

// Within the function body, the receiver of the call is referenced as this

// The extension function is then used like so:

if (n.isOdd()) {
    ...
}

val Int.isOdd: Boolean get() = this % 2 != 0
