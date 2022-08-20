fun sum(nums:List<Int>): Int {
    var sum = 0
    for (num in nums) {
        sum += num
    }
    return sum
}

fun main() {
    val list = listOf(5, 5, 10, 25, 6)
    val sumOfList = sum(list)
    println(sumOfList)

    val listE = listOf<Int>()
    val sumOfListE = sum(listE)
    println(sumOfListE)
}