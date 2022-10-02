
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.
//
// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
//
// Constraints:
// 1 <= s.length <= 104
// s consists of only English letters and spaces ' '.
// There will be at least one word in s.


//fun lengthOfLastWord(s: String): Int {
//    val trimmedS = s.trim().splitToSequence(" ").toList()
//    val lastOfStringList = trimmedS[trimmedS.size - 1]
//    return lastOfStringList.length

//    return s.trim().splitToSequence(" ").toList().let {
//       it[it.size-1].length
//    }

// we need to separate sentence into trimmed strings
// we need to pick the last string (list[list.size-1]) and return its length
// we trim the start and end of the sentence to clean it
// we put the first char as a key in a map and add it as a value as well
// we input all chars after as added values in the same key
//  && wordsMap[element]?.size!! > 1
//
//    val wordsMap = mutableMapOf<Char, MutableList<Char>>()
//    val trimmedS = s.trim() // removes start and end spaces
//
//    for (element in trimmedS) {
//        if (element.isLetter() && wordsMap.isEmpty()) { // checks for mid-sentence spaces and for existing keys
//            if (wordsMap[element]?.size!! > 1 || wordsMap == null) {
//                wordsMap[element]?.add(element) // "H" -> (H, e)
//            }
//            wordsMap.set(element, element.toString().toMutableList() ).also { println (wordsMap[element])} // "H" -> [H]
//        } else if (element.isLetter()) {
//            wordsMap[element]?.add(element).also { println (wordsMap[element])} // "H" -> [H, e]
//        }
//    }
//
//
//    return s.trim().splitToSequence(" ").toList().last().length // the kotlin version
//
//
//}

//fun lengthOfLastWord2(s: String): Int {
//
//    val trimmedS = s.trim() // removes start and end spaces
//    var lastWord = 0
//
//    for (char in trimmedS.length-1 downTo 0) { // counts from 11 to 0
//        if (trimmedS[char].toString() != " ") {
//            lastWord++
//        } else break
//    }
//
//    return lastWord
//}

fun lengthOfLastWord3(s: String): Int {
    val trimmedS = s.trim()
    val list = trimmedS.split(" ") // (Hello, Worlds)
    return list[list.size-1].length // 6?
}

fun main() {
    val s = " Hello Worlds "
    val solution = lengthOfLastWord3(s)
    println(solution)
}





