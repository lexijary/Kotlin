fun main() {
    println("PIZZA MENU")
    println("\n(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian")
    print("\nChoose your pizza (a-d): ")
    val choice = readln().lowercase()

    if (choice.length != 1) {
        print("Invalid choice!")
    }
    else if (choice[0] !in 'a'..'d') {
        print("Invalid choice!")
    }
    else {
        print("Order accepted")
    }
}