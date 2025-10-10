val person = Pair("Sarah", 37)
val person2 = Triple("Joe", 24, 1.75f)



Note that this code is technically shorthand for

val person = Pair<String,Int>("Sarah", 37)
val person2 = Triple<String,Int,Float>("Joe", 24, 1.75f)

val person = "Sarah" to 37

val person = Pair("Sarah", 37)
println(person.first)    // prints Sarah
println(person.second)   // prints 37

val person = Pair("Sarah", 37)
...
val (name, age) = person
println("Name is $name, age is $age")

