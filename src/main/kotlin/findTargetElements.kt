
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]

fun findTargetElements(numList: List<Int>, target: Int): List<Int> {

    val answer = mutableListOf<Int>()

    for (i in 0..numList.size-2) { // starts from [i] (1) goes through 2 5 7 (skips 8)
//        print(" ${numList[i]}-->")
        for (c in i+1..numList.size-1) { // starts from [i+1] (2) goes through 5 7 8 (finishes the list)
//            print(" ${numList[c]},")
            if (numList[i] + numList[c] == target) {
                answer.add(numList[c])
                answer.add(numList[i])
                return answer
            }
        }
        println("")
    }
    return answer
}

fun main() {
    val numList = listOf(1, 2, 5, 7, 8)
    val target = 8
    val result = findTargetElements(numList, target)
    println(result)
}