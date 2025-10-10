// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics

    val TotalData = fetchData()
    val AllTemps = TotalData.map {it.second}

    val HighestWeatherStation = AllTemps.max()
    val LowestWeatherStation = AllTemps.min()
    val CorrespondingWeatherStationToMax = TotalData.first {it.second == HighestWeatherStation}
    val CorrespondingWeatherStationToMin = TotalData.first {it.second == LowestWeatherStation}

    println("Weather Station with highest temperature ${HighestWeatherStation} is ${CorrespondingWeatherStationToMax}")
    println("Weather Station with lowest temperature ${LowestWeatherStation} is ${CorrespondingWeatherStationToMin}")

    val AverageTempofWeatherStation = averageTemp(TotalData)
    println("The average temperature across all Weather Stations is %.2f}".format(AverageTempofWeatherStation))
}
