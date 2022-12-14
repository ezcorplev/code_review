// Given two string s and t, return true if t is an anagram of s, and false otherwise.

// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.
// anagram == nagaram
// rat != car

// Thumbs rule for algo questions
// edge cases come first
// sorting
// maps

private const val TAG = "validAnagram"

fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) {
        println("$s -> $t is NOT an anagram!")
        return false
    }

    val map = hashMapOf<Char, Int>()

    for (char in s.toCharArray()) { // loop n times, build a map with the char as a key and the
        if (map.containsKey(char)) { // if map contains the key: Char increment its value by 1
            map[char] = map[char]!! + 1
        } else {
            map[char] = 1 // if map does not contain key, add it with value of 1
        }
    }

    for (char in t.toCharArray()) { // now we loop the second string and deduct the values
        if (map.containsKey(char)) { // if map contains key deduct 1 from value
            map[char] = map[char]!! -1
        } else {
            println("$s -> $t is NOT an anagram!")
            return false // if map doesnt contain key (key is char) it is not an anagram -> false
        }
    }

    println("$s -> $t is an anagram!")
    return map.values.sum() == 0 // after incrementing and deducting values the sum should be 0 if anagram -> true
//
//    val tSorted = t.toCharArray().sorted() // size = n
//    val sSorted = s.toCharArray().sorted() // size = n
//
//    for (char in 0 .. tSorted.size) { // 4
//        if (tSorted[char] != sSorted[char]) { // l = l,
//            return false
//        }
//    }

}

fun main() {
    val s = "lool"
    val t = "looz"
    val solution = isAnagram(s, t)
    println(solution)
}





