
fun findSharedChars(s1: String, s2: String): Int{

    val s1Sorted = s1.toCharArray().sorted()
    val s2Sorted = s2.toCharArray().sorted()
    var count = 0
    val sharedCharList = mutableListOf<Char>()
    var shorterString = s1Sorted
    var longerString = s2Sorted

    if (s1Sorted.size > s2Sorted.size) {
        shorterString = s2Sorted
        longerString = s1Sorted
    } else {
        shorterString = s1Sorted
        longerString = s2Sorted
    }


    println(s1Sorted)
    println(s2Sorted)

    for (char in 0 until shorterString.size) {
//        if (s2Sorted[char] == s1Sorted[char]) {
        if (longerString.contains(shorterString[char])) {
//            sharedCharList.add(s2Sorted[char])
            count++
        }
    }
    return count
//    return sharedCharList
}

fun main() {
    val s1 = "loremipsumdolorsitametiuseachorodoloreseloquentiameaconsequatscriptoremtheophrastusvel"
    val s2 = "atdicatpossimcausaeeoslibrislaoreettractatostesitadmovetrecusabovimdicittractatosmeiteexsintdolorest" // 36
    val solution = findSharedChars(s1, s2)
    println(solution)
}



