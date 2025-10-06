fun main() {

    println("PIZZA MENU")
    println("\n(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian")
    print("\nChoose your pizza (a-d): ")
    var choice = readln().lowercase()

    while (choice.length != 1 || choice[0] !in 'a'..'d') {
        print("\nInvalid Choice! Please re-enter. Choose your pizza (a-d): ")
        choice = readln().lowercase()
    }

    println("\nOrder accepted")
}