fun variance(dataset: List<Double>): Double {
    if (dataset.size < 2) {
        throw IllegalArgumentException("not enough data")
    }
    ...
}
//  require(), check() and error(). 

// require() will throw IllegalArgumentException if the boolean expression specified as its first argument evaluates to false. The message associated with the exception is provided by an optional second argument, which is a lambda expression.

// check() will throw an IllegalStateException if the boolean expression supplied as its first argument evaluates to false. The message associated with the exception is provided by an optional second argument which is, again, a lambda expression.

// error() is the simplest of the three functions. It takes an error message as its sole argument and throws an IllegalStateException with that message.

fun variance(dataset: List<Double>): Double {
    require(dataset.size > 1) { "not enough data" }
    ...
}

// try expressions
try {
    // code that might cause an exception
}
catch (error: MyException) {
    // specific exception handling code
}
catch (error: Exception) {
    // more general exception handling code
}



try {
    // code that might cause an exception
}
catch (error: MyException) {
    // code that runs if MyException occurs
}
finally {
    // code that always runs, with or without an exception
}