
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Input: nums = [1,2,3,1]
// Output: true

fun findDuplicatesInArray(nums: MutableList<Int>): Boolean {
  val sortedList = nums.sorted()
  for (i in 0..sortedList.size-2) {
    if (sortedList[i] == sortedList[i+1]) {
      return true
    }
  }
  return false
}

fun main() {
  val nums = mutableListOf(-1, 0, -5, 5, 25, 6, 8, -1)
  val result = findDuplicatesInArray(nums)
  println(result)
}