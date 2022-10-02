// Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1
// Input: nums = [1,3,5,6], target = 5
// Output: 2
//
//fun searchInsertPosition(numList: List<Int>, target: Int) : Int {
//
//    if (target > numList[numList.size-1]) { return numList.size }
//    if (target < numList[0]) { return 0 }
//
//    numList.forEachIndexed { index, num ->
//        if (num == target) {
//            return index
//        } else if (num > target) {
//            return index // note if both ifs return same you can consolidate
//        }
//    }
//    return -1 // if return doesn't make sense, you can probably change the order inside the function
//}
//
//fun searchInsertPosition2(numList: List<Int>, target: Int) : Int {
//
//    numList.forEachIndexed { index, num ->
//        if (num >= target) {
//            return index
//        }
//    }
//
//    return numList.size
//}

//fun searchInsertPositionNativ(numList: List<Int>, target: Int) : Int {
//    numList.forEachIndexed { index, num ->
//        if (target <= num) {
//            return index
//        }
//    }
//
//    return  numList.size
//}

fun searchInsertPositionBinary(numList: List<Int>, target: Int) : Int {

    // 1 3 5 6
    var low = 0 // 0
    var high = numList.size - 1 // 3

    while (low <= high) {
        var mid = (high + low) / 2 // [0 + 3]/2 = 1
        if (target == numList[mid]) { // if 5 == 3
            return mid // -> return 1
        } else if (target > numList[mid]) { // if 5 > 3 so target is on the right side
            low = mid + 1 // low = 1 + 1 = 2, so next iteration in while loop mid = (1 + 3)/2 = 2
        } else {
            high = mid - 1
        }
    }
    return -1
}

fun main() {
    val numList = listOf(1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
    val target = 11
    val solution = searchInsertPositionBinary(numList, target)
    println(solution)
}