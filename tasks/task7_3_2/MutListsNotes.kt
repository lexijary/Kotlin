val greetings = MutableList<String>(5) { "Hello" }
greetings.set(0, "Hi there")   // OK: greetings is mutable

val numbers = mutableListOf(9, 3, 6, 2)
numbers[0] = 1   // OK: numbers is mutable

val data = mutableListOf<Double>()

add()	Adds an item at the end, or a given position
addAll()	Adds all items from the given collection
remove()	Removes first occurrence of the given item
removeAll()	Removes all occurrences of the given item
removeAt()	Removes the item at the given position
clear()	Empties the list of all its contents