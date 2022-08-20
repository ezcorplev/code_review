fun findEvenInList(nums:List<Int>): List<Int> {
    if (nums.isEmpty()) {
        return listOf()
    }
    val evenList = mutableListOf<Int>()
    for (num in nums) {
        if ((num % 2) == 0) {
            evenList.add(num)
        }
    }
    return evenList
}

fun main() {
    val list = listOf(2, 3, 4, 5, 6, 7, 8, 9)
    val evenList = findEvenInList(list)
    println(evenList)

    val listE = listOf<Int>()
    val evenListE = findEvenInList(listE)
    println(evenListE)
}