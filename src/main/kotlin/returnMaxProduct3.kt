// 08/08/22
// DID
// MAX/MIN values for Integer
// Bit value of integers - how list's size is determined
// UML graph
// Sort algorithms time complexity
// TODO
// Read about sort algorithms - In youtube there is a guy that has a 2-5 mins video on every sort possible. watch selection sort/ bubble sort/ quick sort
// Read about interface vs class, which to use and when
// I'll send you an algo question

fun returnMaxProduct3(numList: List<Int>): Int {

    //[1000, 1004, 1008, 1012, 1016]
    if (numList.size < 2) {
        println("This list is too small to produce a product, needs to be at least 2 elements long")
    }

    var max = Integer.MIN_VALUE
    var secondMax = Integer.MIN_VALUE
    var min = Integer.MAX_VALUE
    var secondMin = Integer.MAX_VALUE


//    val sortedList = numList.sortedDescending() // O(nlogn) -> O(n)
    for (num in numList) { // this finds max
        if (num > max) {
            max = num // highest number
        }
    }

    for (num in numList) { // this finds secondMax
        if (num > secondMax && num < max) {
            secondMax = num
        }
    }

    for (num in numList) { // this finds min
        if (num < min) {
            min = num
        }
    }

    for (num in numList) { // this finds secondMin
        if (num < secondMin && num > min) {
            secondMin = num
        }
    }
//    val biggestNegProduct = sortedList[sortedList.size-1] * sortedList[sortedList.size-2]
//    val biggestPosProduct = sortedList[0] * sortedList[1]

    val biggestNegProduct = min * secondMin
    val biggestPosProduct = max * secondMax

    return if (biggestNegProduct > biggestPosProduct) {
        biggestNegProduct
    } else {
        biggestPosProduct
    }
}

fun main() {
    val numList = listOf(1, 2, 3, 4, 5, -6, -7)
    val result = returnMaxProduct3(numList)
    println(result)
}
//    for (i in numList) {
//        val negList = mutableListOf<Int>()
//        val posList = mutableListOf<Int>()
//
//        if (i >= 0) {
//            posList.add(i)
//        } else {
//            negList.add(i)
//            }
//        val sortedNegList = negList.sortedDescending()
//        val sortedPosList = posList.sortedDescending()
//        val biggestNegProduct = sortedNegList[sortedNegList.size-1] * sortedNegList[sortedNegList.size-2]
//        val biggestPosProduct = sortedPosList[0] * sortedPosList[1]
//        if (biggestNegProduct > biggestPosProduct) {
//            return biggestNegProduct
//        } else {
//                return biggestPosProduct
//        }
//    }

// O(nlogn)
fun yoyo(list: List<Int>) {
    for (num in list) {
      for (numAgain in list) {
          for (numAgainAgain in list) {

          }
      }
    }

}