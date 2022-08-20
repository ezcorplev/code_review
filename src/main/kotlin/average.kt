fun average(nums:List<Int>):Int {
    if (nums.isEmpty()) {
        return -1
    }
    var sum = 0
    for (num in nums) {
        sum = sum + num
    }
    return (sum / nums.size)
}

fun main() {
    val list = listOf(3, 4, 5, 6, 7)
    val averageOfList = average(list)
    println(averageOfList)

    val listE = listOf<Int>()
    val averageOfListE = average(listE)
    println(averageOfListE)
}