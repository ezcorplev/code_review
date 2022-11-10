// Given an integer array nums where every element appears three times except for one, which appears exactly once.
// Find the single element and return it.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,3,2]
//Output: 3
//Example 2:
//Input: nums = [0,1,0,1,0,1,99]
//Output: 99
//Constraints:
//1 <= nums.length <= 3 * 104
//-231 <= nums[i] <= 231 - 1
//Each element in nums appears exactly three times except for one element which appears once.


fun singleNumber2(nums: Array<Int>): Int {

    val numsMap = mutableMapOf<Int, Int>() // (K,V) -> (num, num.quantity)

    for (num in nums) {
        if (numsMap.containsKey(num)) {
            numsMap[num] = (numsMap[num] ?: 0) + 1 // (0,2)
        } else {
            numsMap.put(num, 1) // (0,1)
        }
    }

    for ((key, value) in numsMap) {
        if (value == 1) {
            return key
        }
    }

    return -1
}

fun main() {

    val nums = arrayOf(0, 1, 0, 1, 0, 1, 99)
    val result = singleNumber2(nums)
    println(result)
}






