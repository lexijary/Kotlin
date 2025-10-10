
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    val numbers2 = listOf(8,8,8)
    println(numbers)

    println(numbers[0])
    println(numbers.get(0))

    //println(numbers[10])

    println(numbers.slice(2..4))

    println(numbers.first())
    println(numbers.last())

    numbers[0] = 8         
    numbers.add(42)  


    numbers.remove(3)                   
    numbers.addAll(numbers2)                
    numbers.removeAll(listOf(8))            
    numbers.removeAt(2)
    println(numbers)                   
    numbers.clear()  

}