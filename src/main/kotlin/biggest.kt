fun biggest(numList:List<Int>):Int {
    // here you create an edge case response to return -1 and exit the function
    if (numList.isEmpty()) {
        return -1
    }
    // here you declare a var biggest and state it is the first number (index [0]) in a list with a for loop
    var biggest = numList[0]
    for (num in numList) {
        // for each loop you compare the number (num) to the current var biggest, and if the num is bigger than biggest,
        // it becomes var biggest itself
        if (biggest < num) {
            biggest = num
        }
        // at the end of the loop you return var biggest to find out who was the biggest number in the list
    }
    return biggest
}

fun main() {
    val list = listOf(5, 10, 15, 16, 17)
    val biggestInList = biggest(list)
    println(biggestInList)

    val listE = listOf<Int>()
    val biggestInListE = biggest(listE)
    println(biggestInListE)
}