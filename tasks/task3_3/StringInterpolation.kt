fun main() {
    print("Enter your name: ")
    val name = readln()

    println("Hello $name!")
    println("Your name contains ${name.length} characters")
    println("Is it a short name? ${name.length < 5}")
    println("Uppercase name is ${name.uppercase()}")

    // println("Distance = %.2f km".format(distance))

    // val area = Math.PI * 3.14 * 3.14
    // System.out.printf("Circle area is %.3f\n", area)

    // with(System.out) {
    // printf("Circle colour = (%d,%d,%d)\n", r, g, b)
    // printf("Circumference = %.3f\n", 2.0 * Math.PI * radius)
    // printf("Area = %.3f\n", Math.PI * radius * radius)
}

}