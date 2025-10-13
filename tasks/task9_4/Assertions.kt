fun processText(text: String) {
    assert(text.length > 0)
    ...
}

require(text.length > 0)

// To enable assertions, it is necessary to pass the -ea command line option to the JVM. For example, if you have an application that has been compiled into a portable JAR file named app.jar, you would need to run it with either of these commands:

// kotlin -J-ea app.jar
// java -ea -jar app.jar
