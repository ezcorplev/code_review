
// 1. Understand the question
// 2. Write out examples - input/output
// 3. Break the problem into its component parts
// 4. Psuedo code - outlined solution
// 5. Psuedo code.
// 6. Implement solution

// Declare and implement a function that receives 4 integers -  mone1, mehane1, mone2, mehane2 and returns the product of the 2 fractions as a pair

// Example - 1, 2, 3, 4 -> 3, 8
// Example - 2, 3, 4, 5 -> 8, 15

// Psuedo code - outlined solution :
// Multiply both mones
// Multiply both mehanes
// return pair of the above

// Psuedo code
// mone1 * mone2

fun fractionsToPair(mone1: Int, mehane1: Int, mone2: Int, mehane2: Int):Pair<Int,Int> {
    val moneProduct = (mone1 * mone2)
    val mehaneProduct = (mehane1 * mehane2)
    val product = Pair(moneProduct, mehaneProduct)
    return product
}

fun main() {

    val product = fractionsToPair(1, 2, 3, 4)
    println(product)

}

//val pairOfNumbers = Pair(3, 4)
//pairOfNumbers.first
//pairOfNumbers.second