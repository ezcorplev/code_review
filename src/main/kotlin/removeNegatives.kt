// implement a function that receives a list of integers, and returns a list without the negative numbers
fun removeNegatives(list: List<Int>): List<Int> {
    val positiveList = mutableListOf<Int>()
    for (num in list) {
        if (num >= 0) {
            positiveList.add(num)
        }
    }
    return positiveList
}

fun main() {
    val list = listOf(-1, 3, -6, 2, 1, -15, 123, 0)
    val result = removeNegatives(list)
    println(result)
}
