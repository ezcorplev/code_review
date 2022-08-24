// Given an array nums containing n distinct numbers in the range [0, n]
// return the only number in the range that is missing from the array.
// Input: nums = [3,0,1] // 4
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.

fun findMissingIntInArray(nums: List<Int>): Int? {

    if (nums.isEmpty()) {return null}

    var numsSorted = nums.sorted()
    var missingNum: Int = 0

    for (i in 0 until nums.size) {

        if (i != numsSorted[i]) {
            missingNum = i
            break
        }
    }
    return missingNum
}

fun main() {
    val nums = listOf(0, 1, 5, 3, 2)
    val result = findMissingIntInArray(nums)
    println(result)
}
