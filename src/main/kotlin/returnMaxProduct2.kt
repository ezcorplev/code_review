// Algo - Implement a function that receives a list of Integers as argument,
// and return the max product.
// 1. Understand the question - get the biggest possible multiple result
// 2. Write out examples - input/output - 1, 2, 3, 8, 4 -> 32
// 3. Break the problem into its component parts - we need to get all the products, and compare them.
// set a var product = 0, then start a nested for loop that multiplies i with all other nums
// then set an if comparing product to the
// 4. Pseudocode - outlined solution >
// 5. Pseudocode >
// 6. Implement solution

fun returnMaxProduct2(numList: List<Int>): Int {
    val sortedList = numList.sortedDescending()
    return sortedList[0] * sortedList[1]
}

fun main() {
    val numList = listOf(1, 2, 3, 8, 8)
    val result = returnMaxProduct2(numList)
    println(result)
}
