import java.io.File

fun main() {
    val filename = "words.txt"
    val TargetWordsList = readWordList(filename)
    val RandomChosenWord = pickRandomWord(TargetWordsList)
    val UserGuess: String
    val CurrentGuessResult: List<Int>
    val CurrentResult: String

    for (i in 1..10) {
        UserGuess = obtainGuess(i)
        CurrentGuessResult = evaluateGuess(UserGuess, RandomChosenWord)
        CurrentResult = displayGuess(UserGuess, CurrentGuessResult)
        if (CurrentGuessResult == listOf(1,1,1,1,1)) {
            println("You have guessed sucessfully! The word was ${RandomChosenWord}")
            break
        }
        println(CurrentResult)
    }
    println("You have guessed unsucesfully and have run out of guesses :( The word was ${RandomChosenWord})")
    
}
