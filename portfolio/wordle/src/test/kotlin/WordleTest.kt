import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

@Suppress("unused")
class WordleTest : StringSpec({
    // Write your tests here

    "The length of the string is valid, i.e exactly 5 letter" {
        { isValid("dives") shouldBe true }
        { isValid("dive") shouldBe false }
        { isValid("divers") shouldBe false }
    } 

    "Reads all target words from a specified file, outputting a list of strings" {
        val TestFile1 = ("UnitTestingFile.txt")
        readWordList(TestFile1) shouldBe("APPLE, BERRY, PEACH, MANGO, GUAVA, PAPAW")
        val TestFile2 = ("UnitTestingEmptyFile.txt")
        readWordList(TestFile2) shouldBe emptyList<String>()
    }

    "A random word is picked and checked to see if its in the target list" {
        val TargetTestWords = readWordList("UnitTestingFile")
        val RandomTestWords = TargetTestWords.random()
        (RandomTestWords in TargetTestWords) shouldBe true
    }

    "Target Word letters are checked against the position on the user inputs guess indicating whether there is a match" {
        val targetWordTest = "MANGO"
        val guess1 = "MANGO"
        val guess2 = "MINLO"
        val guess3 = "PLUMS"

        evaluateGuess(guess1, targetWordTest) shouldBe listOf(1,1,1,1,1)
        evaluateGuess(guess2, targetWordTest) shouldBe listOf(1,0,1,0,1)
        evaluateGuess(guess3, targetWordTest) shouldBe listOf(0,0,0,0,0)
    }

})
