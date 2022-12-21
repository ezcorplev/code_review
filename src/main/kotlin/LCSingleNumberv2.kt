// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4

// sorting - no because of linear runtime? O(nlogn)
// hashmap - no because of constant space
// nested 2-step for - no because of linear runtime O(n^2)
// for loop once on a sorted list (1,1,2,2,4)
// if the num is equal to the one after we skip and skip again (skip 1 and 1)
// make sure that if num is last num result = num and break

fun singleNumberv2(nums: Array<Int>): Int {

    var result = 0
    var isNumDouble = false

    for (i in nums.sorted().indices) { // loop on nums.sorted (1,1,2,2,4)
        if (i != nums.size-1) { // if num is not the last num ->
            if (isNumDouble) { // if num is double skip again (skip 1 and 1 again)
                isNumDouble = false
                continue
            }
            if (nums.sorted()[i] == nums.sorted()[i+1]) { // if num + next num are same skip twice (raise flag etc)
                isNumDouble = true
                continue
            } else result = nums.sorted()[i] // if num != next num this is our single num!
            break
        }
        result = nums.sorted()[i] // if we reached the last num without finding single num, last num is single num
        break
    }
    return result
}

fun main() {
    val nums = arrayOf(2,2,11,1,1,3,4,5,5,3,11)
    val solution = singleNumberv2(nums)
    println(solution)
}