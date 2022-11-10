//Implement a function to receives 2 lists, and returns true if lists are identical (order doesn't matter), false otherwise.
// Hint - contains()

//        REMOTE
// MAIN      FEATURE_BRANCH
// LOCAL
// MAIN      FEATURE_BRANCH
fun areIdenticals(listOne: List<Int>, listTwo: List<Int>):Boolean {

    // now add a condition to check the two lists list.size and see that they match, again if not return FALSE
    if (listOne.size != listTwo.size) {
        return false
    }
    // first run the loop to check (if NOT) list two contains each num from list one
    for (num in listOne) {
        if (!listTwo.contains(num)) {
            // if list two does not contain a number from list one, the function returns FALSE
            return false
        }
    }
    // now that we concluded that the lists contain the same numbers (by checking that list two contains each num
    // from list one, and by matching list.size for both), we can return TRUE
    return true
}

fun main() {
    val listOne = listOf(1, 2, 3, 4, 5)
    val listTwo = listOf(3, 4, 5, 2, 1, 0)
    val result = areIdenticals(listOne, listTwo)
    println(result)

    val listOne2 = listOf(1, 2, 3, 4, 5)
    val listTwo2 = listOf(3, 4, 5, 2, 1)
    val result2 = areIdenticals(listOne2, listTwo2)
    println(result2)

    val listOne3 = listOf<Int>()
    val listTwo3 = listOf<Int>()
    val result3 = areIdenticals(listOne3, listTwo3)
    println(result3)
}