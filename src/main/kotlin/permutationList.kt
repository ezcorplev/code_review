// Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
// Input: nums = [1,1,2]
// Output:
// [[1,1,2],
// [1,2,1],
// [2,1,1]]
// the number of permutations per list is n! (n factorial) if there are no identical ints in list, what about identical ints?
// input: 1,2,3 >> 3*2*1 = 6 permutations (1,2,3) (1,3,2) (3,2,1) (3,1,2) (2,1,3) (2,3,1)
// if list has identical ints (need to sort to check) we need to divide by # of idents (in example 3! / 2! = 3)
// forget duplicate ints, for now regular list, we need how many lists?
//
fun permutationList(nums: List<Int>) {

    val listSize = nums.size // 4
    for (i in nums) { // 1, 2, 3, 4
        println("$i -> ")
        for (c in nums) {
            print("$c, ")
        }
        println("")
    }

}

fun main() {
    val nums = listOf(1,2,3,4)
    val result = permutationList(nums)
    println(result)
}

