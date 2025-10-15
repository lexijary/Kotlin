import java.io.File

fun main() {
    val filename = "data/words.txt"
    var TargetWordsList = readWordList(filename)
    var RandomChosenWord = pickRandomWord(TargetWordsList)
    var UserGuess: String
    var CurrentGuessResult: List<Int>
    var CurrentResult: String

    for (i in 1..10) {
        UserGuess = obtainGuess(i)
        CurrentGuessResult = evaluateGuess(UserGuess, RandomChosenWord)
        CurrentResult = (displayGuess(UserGuess, CurrentGuessResult)).toString()
        if (CurrentGuessResult == listOf(1,1,1,1,1)) {
            println("You have guessed sucessfully! The word was ${RandomChosenWord}")
            break
        }
        println(CurrentResult)
    }
    println("You have guessed unsucesfully and have run out of guesses :( The word was ${RandomChosenWord})")
    
}
