// Given an array nums containing n distinct numbers in the range [0, n]
// return the only number in the range that is missing from the array.
// Input: nums = [3,0,1] // 4
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.






//    val sortedNums = nums.sorted()
//    val matchList = mutableListOf<Int>()
//    val listSize = nums.maxOrNull()?.toInt() ?: "List is empty"
//    for (i in 0..listSize as Int) {
//        matchList.add(i)
//
//    }
//    for (i in sortedNums) {
//        if (sortedNums[i] == matchList[i]) {
//
//        }
//    }
//    return matchList[matchList.size-1]

fun findMissingIntInArray(nums: List<Int>): Int? {

    if (nums.isEmpty()) {return null}

    var missingNum: Int = 0

    for (i in 0 until nums.size) {

        if (i != nums[i]) {
            missingNum = i
        }
    }
    return missingNum
}

fun main() {
    val nums = listOf(3, 0, 1)
    val result = findMissingIntInArray(nums)
    println(result)
}
