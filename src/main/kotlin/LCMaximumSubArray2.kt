import kotlin.math.max

// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
// A subarray is a contiguous part of an array.
//
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//
//Example 2:
//Input: nums = [1]
//Output: 1


// 1 2 -1 3 -1
// 1, 1+2, 1+2-1, 1+2-1+3, 1+2-1+3-1
// 2+1, 2+1-1,


// -2, 3, 2, -1 -> 5

fun maximumSubarray(nums: List<Int>): Int {

    return if (nums.isEmpty()) 0
    else {
        var maxGlobal = nums[0]
        var maxCurrent = nums[0]

        for (num in 1 until nums.size) {
            maxCurrent = max(a = nums[num], b = maxCurrent + nums[num])

            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent
            }
        }
        maxGlobal
    }
}




fun main() {
    val nums = listOf(-2, 3, 2, -1)
    val solution = maximumSubarray(nums)
    println(solution)
}