//Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
//Example 1:
//Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
//Output: 2
//Explanation:
//- "leetcode" appears exactly once in each of the two arrays. We count this string.
//- "amazing" appears exactly once in each of the two arrays. We count this string.
//- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
//- "as" appears once in words1, but does not appear in words2. We do not count this string.
//Thus, there are 2 strings that appear exactly once in each of the two arrays.

fun countCommonWords(s1: Array<String>, s2: Array<String>): Int {

    /*
    1. loop the shorter string array
    2. find strings that appear only once! and add them to newArray
    3. do same for longer string
    3. loop the longer unique array with the strings from the shorter unique array, if matched count++
    4. return count
     */
    val shorterString = if (s1.size > s2.size) s2 else s1
    val shortStringUniques = mutableListOf<String>()
    val longStringUniques = mutableListOf<String>()

    for (index in shorterString.indices) { // find shortStringUniques
        for (indexTwo in index+1 until shorterString.size) {
            if (shorterString[index] == shorterString[indexTwo]) {
                continue
            } else {
                shortStringUniques.add(shorterString[index])
            }
        }
        //
    }

    return -1
}

fun main() {
    val s1 = arrayOf("leetcode","is","amazing","as","is")
    val s2 = arrayOf("amazing","leetcode","is")
   // val result = s1.distinct().filter { s2.distinct().contains(it) }
    val solution = countCommonWords(s1, s2)
    println(solution)
}