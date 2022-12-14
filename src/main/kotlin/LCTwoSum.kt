// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

fun twoSum(nums:IntArray, target: Int): IntArray {

    var answer = intArrayOf()

    for (numA in 0 until nums.size) {
        for (numB in numA+1 until nums.size) {
            if (nums[numA] + nums[numB] == target) {
                answer += numA
                answer += numB
                break
            }
        }
    }

    val sent = "today I went to the beach"
    println(sent.split(" "))

//    val strs = "(({[[]]}))"
//    println(strs.toList().sortedDescending())

    return answer
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val solution = twoSum(nums, target)
    println(solution)
}