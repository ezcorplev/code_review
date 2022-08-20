// implement a function that receives a word and returns a boolean of "true" if the word can be a palindrome, and "false"
// if the word cannot be a palindrome
fun canBePali2(word: String): Boolean { // the word is "chachaz" so should be "true"

    val list = word.toList() // change word to list (c, h, a, c, h, a, z)
    val sortedList = list.sorted() // sort list (a, a, c, c, h, h, z)
    val newList = mutableListOf<Char>() // empty list to be filled by chars

    for (letter in sortedList) { // loop the sorted list
        if (newList.contains(letter)) { // create a condition where if the list has the letter already
            newList.remove(letter)
        } else {
            newList.add(letter)
        }
    }
    return newList.size <= 1
}
//chachazx
// aacchhxz
// a
fun main() {
    val word = "chachaz"
    val result = canBePali2(word)
    println(result)
}