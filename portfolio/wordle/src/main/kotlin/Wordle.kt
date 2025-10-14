// Implement the six required functions here
import java.io.File
// 1. isValid(word: String): Boolean
// Returns true if the given word is valid in Wordle (i.e., if it consists of exactly 5 letters)

fun isValid(word: String): Boolean {
    val wordLength = word.length
    if (wordLength == 5) {
        return true
    }
    else{
        return false
    }
}
// 2. readWordList(filename: String): MutableList<String>
// Reads Wordle target words from the specified file, returning them as a list of strings.

fun readWordList(filename: String): MutableList<String> {
    val targetWords = mutableListOf<String>()
    for (line in File(filename).readLines()) {
        targetWords.add(line)
    }
    return targetWords
}

// 3. pickRandomWord(words: MutableList<String>): String
// Chooses a random word from the given list, removes that word from the list, then
// returns it.

fun pickRandomWord(words: MutableList<String>): String {
    val RandomWord = words.random()
    words.remove(RandomWord)
    return RandomWord
}
//4. obtainGuess(attempt: Int): String
// Prints a prompt using the given attempt number (e.g. "Attempt 1: "), then reads a word
// from stdin. The word should be returned if valid, otherwise the user should be prompted
// to try again.

fun obtainGuess(attempt: Int): String {
    val running = true
    println("Attempt number ${attempt}, please enter a word: ")
    val CurrentWord = readln().uppercase()
    if (isValid(CurrentWord) == true) {
        return CurrentWord
    }
    else{
        while (running == true) {
            println("Invalid word, please re-enter: ")
            val CurrentWord = readln().uppercase()
            if (isValid(CurrentWord) == true) {
                running == false
            }
        }
        return CurrentWord
    }
}
// 5. evaluateGuess(guess: String, target: String): List<Int>
//Compares a guess with the target word. Returns a list containing 5 integers,
//representing the result of comparison at each letter position. 0 indicates no match, 1
//indicates a match.

fun evaluateGuess(guess: String, target: String): MutableList<Int> {
    val LetterPositionList = mutableListOf(0,0,0,0,0)
    for (i in 0..4) {
        if (guess[i] == target[i]) {
            LetterPositionList[i] = 1
        }
    }
    return LetterPositionList
}
//6. displayGuess(guess: String, matches: List<Int>)
//Displays the letters of a guess that match target word, or a ‘?’ character where there is
//no match.

fun displayGuess(guess: String, matches: List<Int>) {
    val FinalResult = mutableListOf<String>()
    for (i in 0..4) {
        if (matches[i]==1) {
            FinalResult.add(guess[i].toString())
        }
        else{
            FinalResult.add("?")
        }
    }
    println(FinalResult)
}

