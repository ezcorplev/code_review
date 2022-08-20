// Implement a function that receives a String and returns true if it CAN be turned to a palindrome, false otherwise
fun canBePal(word: String): Boolean { // receives a word // "chacha"
    var isFirstChar = false
    var firstLetter = 0
    val wordList = word.toList() // turns the string to a list (c, h, a, c, h, a)
    val sortedList = wordList.sorted() // sorts the list (a, a, c, c, h, h)
    for (char in sortedList) {
        if (firstLetter >= sortedList.size) {
            return true
        }

        // Check if We are working with the last element
        if (firstLetter == sortedList.size - 1) {
            if (isFirstChar) {
                return false
            } else {
                return true
            }
        }
        if (sortedList[firstLetter] != sortedList[firstLetter+1]) { // if the char is not equal to the next char return false
            if (isFirstChar) {
                return false
            }
            isFirstChar = true
            firstLetter++

        } else {
            firstLetter +=2
        }

    }
    return true
}
// cch
// aabbmmnnqqzz
fun main() {
    val word = "chachalol"
    val result = canBePal(word)
    println(result)

}