// Implement a function that receives a String and returns true if the string is a palindrome, false otherwise

// aba -  Palindrome
// aab - not a Palindrome
// adfgsgfda - Palindrome
// adsad - not a palindrome
// && - AND
// || - OR
fun isPali(word: String):Boolean {
    if (word.length <= 1) {
        return true
    }
    // aa = aa // true
    if (word.first() == word.last() && (word.length == 2)) {
        return true
    }
    // if word is asdfdsa loop will run 7 times, we need to run 3 times and compare (a = a, s = s, d = d)
    var indexFromEnd = word.length - 1
    var indexFromStart = 0
    for (char in 1..word.length / 2) {
        if (word[indexFromStart] !== word[indexFromEnd])
            return false
        indexFromEnd--
        indexFromStart++
    }

    return true
}

fun main() {
    var test = "asdfdsa"
    var result = isPali(test)
    println(result)
}



