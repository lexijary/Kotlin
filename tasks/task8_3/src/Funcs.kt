// Task 8.3: functions for temperature analysis

typealias Record = Pair<String,Double>

//Implement the body of fetchData() so that it returns a simulated dataset, 
// in the form of a list of Record objects. Use listOf() to create the list, 
// and the to() extension function to create each pair.

fun fetchData(): List<Record> {
  
  return listOf(
    "London" to 20.0,
    "Leeds" to 17.0,
    "Manchester" to 18.8,
    "Exeter" to 21.2
  )
  
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
