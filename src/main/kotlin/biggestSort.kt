fun biggestSort(numList:List<Int>): Any {
    // here you create an edge case response to return -1 and exit the function
    if (numList.isEmpty()) {
        return -1
    }
    // here you declare a var biggest and state it is the first number (index [0]) in a list with a for loop
    var biggestSort = numList.sorted() // returns a list
    var biggest = (biggestSort[biggestSort.size-1])


    return biggest
}

fun main() {
    val list = listOf(5, 10, 15, 16, 17, 9, 2, 8) // 17, 16 ,15, 10, 5
    val biggestInList = biggestSort(list)
    println(biggestInList)

    val listE = listOf<Int>()
    val biggestInListE = biggestSort(listE)
    println(biggestInListE)
}