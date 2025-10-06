// Task 5.2.1: geometric properties of circles

import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circleCircumference(radius: Double) = PI * 2 * radius

fun readDouble(value: String): Double {
    val doubleResult = value.toDouble()
    return doubleResult
}

fun main() {
    print("Please enter the circles radius: ")
    val string = readln()
    val radius = readDouble(string)
    
    val area = circleArea(radius)
    val circumference = circleCircumference(radius)
    println("\nThe area is %.4f".format(area))
    println("\nThe circle circumference is %.4f".format(circumference))
}