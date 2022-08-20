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

fun returnMaxProduct(numList: List<Int>): Int {
    var result = Integer.MIN_VALUE
    for (i in 0 until numList.size - 1) {
        for (c in i + 1 until numList.size) {
//            if (numList.indexOf(i) != numList.indexOf(c)) {
                val product = numList[i] * numList[c]
                if (product > result) {
                    result = product
                }
//            }
        }
    }
    return result
}

// i = 0
// c = 1, 2, 3, 4
// i = 1
// c = 2, 3 ,4
// i = 2
// c = 3, 4
// i = 3
// c = 4
fun main() {
    // (-123462384234, 2)
    val numList = listOf(9, 8, 5, 9, 9)
    val result = returnMaxProduct(numList)
    println(result)
}
