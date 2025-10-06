fun main() {
    var x = 0.0
    while (x <= 100.0) {
        val y = sqrt(x)
        println("%5.1f %6.3f".format(x, y))
        x += 2.5
    }
}