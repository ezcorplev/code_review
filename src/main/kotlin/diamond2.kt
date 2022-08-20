// 7. print the following using loops (you can use print("*") || println("*") || print(" ") || println(" ") :
//  *
// ***
//*****
// ***
//  *
// 1. Understand the question
// 2. Write out examples - input/output
// 3. Break the problem into its component parts
// we need to implement a loop that takes into account the size of the diamond to place " " or "*" and also knows
// when to println instead of print
// 4. Pseudocode - outlined solution >
// length is 5, height is 5, so for first line we have 2 (__) then 1 (*) then 2 (__)
//
// 5. Pseudocode >
// 6. Implement solution

fun diamond2(rows: Int) {
    var k = 0

    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while ( k!= 2 * i - 1) {
            print("* ")
            ++k
        }

        println()
        k = 0
    }
}

fun main() {
    val result = diamond2(5)
    println(result)
}