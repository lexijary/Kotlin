if (item in collection) {
    // item is in the collection!
}
if (item in map.keys) {
    // item is a key of the map
}
if (item in map.values) {
    // item is a value of the map
}
numbers.containsAll(setOf(1, 2, 3))

for (item in collection) {
    // do something with item
}
for ((key, value) in map) {
    // do something with key and value
}
for (key in map.keys) { ... }

for (value in map.values) { ... }

//For example, to print out each item of a collection on a line by itself, you could use either of the following:
collection.forEach(::println)
collection.forEach { println(it) }