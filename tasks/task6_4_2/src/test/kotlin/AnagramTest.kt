// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    // Write your unit tests here!

    "Two strings of different lengths are not anagrams" {
        "compsci" anagramOf "ccompscii" shouldBe false
        "testing" anagramOf "testinggggggggg" shouldBe false
    }

    "An empty string is not an anagram of itself" {
        "" anagramOf "" shouldBe false
    }

    "Two strings are anagrams if they contain the same characters in a different order" {
       "baker" anagramOf "break" shouldBe true
       "lives" anagramOf "elvis" shouldBe true
    }

    "Letter case is disregarded when comparing character sequences, i.e., the lowercase and uppercase forms of a character are considered to be equivalent" {
        "baker" anagramOf "BREAK" shouldBe true
        "Lives" anagramOf "elvis" shouldBe true
    }


})
