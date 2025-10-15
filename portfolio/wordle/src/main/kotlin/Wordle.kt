// Implement the six required functions here
import java.io.File
// 1. isValid(word: String): Boolean
// Returns true if the given word is valid in Wordle (i.e., if it consists of exactly 5 letters)

fun isValid(word: String): Boolean { // word entered is passed in as a parameter
    val wordLength = word.length // store the userinputs word length in a variable
    if (wordLength == 5) { // then check if it is exactly 5
        return true // if it is 5 then return boolean operator true
    }
    else{
        return false // if it is not exactly 5 letters then return boolean operator false
    }
}
// 2. readWordList(filename: String): MutableList<String>
// Reads Wordle target words from the specified file, returning them as a list of strings.

fun readWordList(filename: String): MutableList<String> { // filename is entered as parameter to be read from in the function
    val targetWords = mutableListOf<String>() // variable to store all of the words in the file
    for (line in File(filename).readLines()) { // iterates through each line in the file
        targetWords.add(line) // adding each new word read to the mutable list
    }
    return targetWords // this list containing each word at eacg element
}

// 3. pickRandomWord(words: MutableList<String>): String
// Chooses a random word from the given list, removes that word from the list, then
// returns it.

fun pickRandomWord(words: MutableList<String>): String { // list of words (in file) is passed in as a parameter
    val RandomWord = words.random() // a variables stores a random word selected from said list
    words.remove(RandomWord) // this random word is then removed from the list
    return RandomWord // the random word randomly selected is returned back to main program
}
//4. obtainGuess(attempt: Int): String
// Prints a prompt using the given attempt number (e.g. "Attempt 1: "), then reads a word
// from stdin. The word should be returned if valid, otherwise the user should be prompted
// to try again.

fun obtainGuess(attempt: Int): String { // attempt number is passed in as a parameter
    println("Attempt number ${attempt}, please enter a word: ") // prompt to user to enter a "guess"
    var CurrentWord = readln().uppercase() // variable stores user input whilst turning it into uppercase (to match the style of the words in the file being read from)
    if (isValid(CurrentWord) == true) { // checks if word entered fits conditions to be valid i.e 5 letters long
        return CurrentWord // if this is the case then it is returned back to the main progra
    }
    else {
        while (isValid(CurrentWord) == false) {
            println("Invalid word, please re-enter: ") // otherwise the user is prompted to keep re-entering (using a pre-condition while loop) until fits criteria (5 letters long exactly)
            CurrentWord = readln().uppercase() // stores this in a variable
        }
        return CurrentWord // to then be returned back to the main program
    }
}
// 5. evaluateGuess(guess: String, target: String): List<Int>
//Compares a guess with the target word. Returns a list containing 5 integers,
//representing the result of comparison at each letter position. 0 indicates no match, 1
//indicates a match.

fun evaluateGuess(guess: String, target: String): MutableList<Int> { // the users guess and what the actual word is is passed into the function as parameters
    val LetterPositionList = mutableListOf(0,0,0,0,0) // set 0,0,0,0,0 (i.e no matches) as a default value (that could possibly be returned to the user at the end)
    for (i in 0..4) { // iterates 5 times i.e through every character of the 5 length string
        if (guess[i] == target[i]) { // does the current character of the string selected match the corresponding character of the actual word selected?
            LetterPositionList[i] = 1 // if so change that list element to 1 instead of 0
        }
    }
    return LetterPositionList // return the final matches/positions of the letters back into the main program
}
//6. displayGuess(guess: String, matches: List<Int>)
//Displays the letters of a guess that match target word, or a ‘?’ character where there is
//no match.

fun displayGuess(guess: String, matches: List<Int>) { //  the users guess and match results (integer list) are entered as parameters
    val FinalResult = mutableListOf<String>() // a variable is created in order to show matches in a "user friendly" form
    for (i in 0..4) { // loop is set up to iterate through every characteer in the string
        if (matches[i]==1) { // if there is a positive match
            FinalResult.add(guess[i].toString()) // then add the letter of the positive match to the variable
        }
        else{
            FinalResult.add("?") // otherwise add a ?
        }
    }
    println(FinalResult) // print this final string possibly containing ?s and Letters onto the terminal
}

