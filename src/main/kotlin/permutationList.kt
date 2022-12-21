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
/*
1 -> 123 132
2 -> 213 231
3 -> 312 321

queue -> 123 -> 231 -> 321 // if we queue 3 times (1..nums.size) we get 50% of permutations
swap -> 123 -> 213

queue 123 -> 231 // swap 231 -> 321
swap 123 -> 213 // queue 213 -> 132 // swap 132 -> 312 // queue 312 -> 123
 */

fun permutationList(nums: List<Int>):MutableList<MutableList<Int>> {

    fun getFactorial(listSize: Int): Int {
        var index = 1
        for (i in 1..listSize) {
            index *= i
        }
        return index
    }
    fun queue(list:MutableList<Int>): MutableList<Int> {
        val first = list[0] // save first
        list.removeAt(0) // remove first
        list.add(first) // add first as last
        return list

    }

    fun swap(list: MutableList<Int>): MutableList<Int> {
        list[0] = list[1].also { list[1] = list[0] } // swap [0] and [1]
        return list
    }

    val factorial = getFactorial(nums.size) // we now have the max num of permutations which is n! // 6

    val permSet = mutableSetOf(mutableListOf<Int>()) // we know our set will be complete once we have set.size == factorial // 6
    var numsMutable = nums.toMutableList()

    while (permSet.size < factorial) {
        permSet.add(numsMutable) // 123
        queue(numsMutable)
        permSet.add(numsMutable) // 231
        queue(numsMutable)
        permSet.add(numsMutable) // 312
        swap(numsMutable)
        permSet.add(numsMutable) // 132
    }

    val permSetList = permSet.toMutableList().also { it.removeAt(0) }
    return permSetList
}

fun main() {
    val nums = listOf(1,2,3) // 3! = [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    val result = permutationList(nums)
    println(result)
}

