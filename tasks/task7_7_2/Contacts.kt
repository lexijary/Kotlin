// Task 7.7.2: contact database, using a map

// Your program should repeatedly prompt the user to enter a contact’s name. 
//If the name is present in the map, the program should display the corresponding phone number; otherwise, 
//it should prompt for entry of that person’s phone number and then store the pairing of name and number in the map.
fun main() {
    val ContactList = mutableMapOf<String, String>()  

    while (true) {
        print("Please enter a contact's name: ")
        val CurrentContactName = readln().lowercase()
        if (CurrentContactName in ContactList) {
            println("The corresponding phone number is ${ContactList[CurrentContactName]}")
        } else {
            print("What phone number would you like to add for this contact: ")
            val CurrentContactNumber = readln()
            ContactList[CurrentContactName] = CurrentContactNumber
            println("Contact added successfully!")
        }
        print("Would you like to continue this whole process: Y/N ")
        val UserAnswer = readln().uppercase()
        if (UserAnswer == "N") {
            break
        }
    }
}

