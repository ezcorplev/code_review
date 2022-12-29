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

fun countCommonWordsv2(words1: Array<String>, words2: Array<String>): Int {

    /*
    1. loop the shorter string array and longer array for uniques
    2. loop shorter array, find uniques and add to hashMap ((0, "amazing"),(1,"leetcode"),(2,"is")) (also add count++?)
    3. loop longer array, if map does not contain value, count--
    4. return count
     */

    var count = 0

    val s1Map = hashMapOf<String, Int>()
    val s2Map = hashMapOf<String, Int>()
    val s1UniquesMap = hashMapOf<String, Int>()
    val s2UniquesMap = hashMapOf<String, Int>()

    for (string in words1) {
        if (s1Map.containsKey(string)) {
            s1Map[string] = 2
        } else {
            s1Map[string] = 1
        }
    }
    println(s1Map)

    for (i in s1Map) {
        if (i.value == 1) s1UniquesMap[i.key] = i.value
    }
    println(s1UniquesMap)

    for (string in words2) {
        if (s2Map.containsKey(string)) {
            s2Map[string] = 2
        } else {
            s2Map[string] = 1
        }
    }
    println(s2Map)

    for (i in s2Map) {
        if (i.value == 1) s2UniquesMap[i.key] = i.value
    }
    println(s2UniquesMap)


//
//    for (string in words1) {
//        if (s1UniquesMap.containsKey(string)) {
//            s1UniquesMap.remove(string)
//        } else {
//            s1UniquesMap[string] = string
//        }
//    }
//    println(s1UniquesMap.keys)
//
//    for (string in words2) {
//        if (s2UniquesMap.containsKey(string)) {
//            s2UniquesMap.remove(string)
//        } else {
//            s2UniquesMap[string] = string
//        }
//    }
//    println(s2UniquesMap.keys)
//
    val shorterMap = if (s1UniquesMap.keys.size > s2UniquesMap.keys.size) s2UniquesMap else s1UniquesMap
    val longerMap = if (shorterMap == s2UniquesMap) s1UniquesMap else s2UniquesMap

    count = shorterMap.keys.size // 3

    for (string in shorterMap.keys) {
        if (!longerMap.containsKey(string)) {
            count--
        }
    }

    return count
}

fun main() {
    val s1 = arrayOf("a","ab")
    val s2 = arrayOf("a","a","a","ab")
   // val result = s1.distinct().filter { s2.distinct().contains(it) }
    val solution = countCommonWordsv2(s1, s2)
    println(solution)
}