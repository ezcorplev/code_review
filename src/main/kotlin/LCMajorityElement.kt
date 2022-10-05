// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always
// exists in the array.
//
//Example 1:
//Input: nums = [3,2,3]
//Output: 3

//fun majorityElement(nums: List<Int>): Int {
//
//    val numMap = mutableMapOf<Int, Int>()
//
    // we can create a map of (num, num.size) and check if (num.size > nums / 2)
    // first create a map K of 1, and add 1 to list as value
    // if map already exists with K of 1, add 1 to list
    // else create new map with K of 2 and add 2 to list as value
    // if map.value.size > nums.size / 2 return map.key
//
//    var count = 0
//
//    for (num in nums) {
//        numMap.put(num, num)
//        while (count > nums.size / 2) {
//
//        }
//        count++
//        if (count > nums.size / 2) {
//            break
//        }
//        count = num
//    }
//
//    for (num in nums) {
//        numMap[num] = mutableListOf(num).size // 1 -> 4
//        if (numMap[num]!! > 1) { //
//
//        }
//    }
//    return count
//}

//fun majorityElement2(nums: List<Int>): Int {
//
//    val sortedList = nums.sorted()
//    val newList = mutableListOf<Int>()
//
//    for (num in sortedList) {
//        if (newList.isEmpty()) { // if the list is empty (first loop) add num to list, now list = (1, )
//            newList.add(num)
//        }
//        else if (num == newList[0]) { // if num is in the list (1 == 1) add num to list, now list = (1, 1, )
//            newList.add(num)
//        }
//        else if (num != newList[0]) { // if num is not in the list (2 != 1) clear the list, and add num to list, now list = (2, )
//            newList.clear()
//            newList.add(num)
//        }
//        if (newList.size > nums.size / 2) {
//            break
//        }
//    }
//
//    return newList[0]
//
//}

//fun majorityElementO1(nums: List<Int>): Int {
//
//    val sortedList = nums.sorted()
//    var count = 0
//    var testNum = 0
//
//    for (num in sortedList) {
//        if (count > nums.size / 2) { // the moment count > nums.size / 2 break and return testNum which is the majority element
//            break
//        }
//        if (count == 0) { // 1st loop, count = 0 so -> count = 1 && testNum = 1
//            count++
//            testNum = num
//        }
//        else if (num == testNum) { // 2nd loop, 1 == 1 so -> count = 2
//            count++
//        }
//        else if (num != testNum) { // 3rd loop, 2 != 1 so -> count = 0, count = 1, testNum = 2
//            count = 0
//            count++
//            testNum = num
//        }
//
//    }
//
//    return testNum
//
//}

fun majorityElementO1v2(nums: List<Int>): Int {

    val sortedList = nums.sorted()
    var count = 0
    var testNum = 0

    for (num in sortedList) {
        if (count > nums.size / 2) { // the moment count > nums.size / 2 break and return testNum which is the majority element
            break
        }
        if (count == 0) { // 1st loop, count = 0 so -> count = 1 && testNum = 1
            count++
            testNum = num
        }
        else if (num == testNum) { // 2nd loop, 1 == 1 so -> count = 2
            count++
        }
        else { // 3rd loop, 2 != 1 so -> count = 0, count = 1, testNum = 2
            count = 0
            count++
            testNum = num
        }

    }

    return testNum

}

fun main() {
    val nums = listOf(1, 1, 2, 2, 1, 2, 2)
    val solution = majorityElementO1v2(nums)
    println(solution)
}