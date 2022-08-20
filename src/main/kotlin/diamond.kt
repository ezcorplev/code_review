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

fun diamond(rows: Int) {

    for (i in 1..rows step 2) {
        var space = (rows-i) / 2
        for (k in space downTo 1) {
            print(" ")
        }
        for (j in (1..i)) {
            print("*")
        }
        println()
    }

    for (i in (rows-2) downTo 1 step 2) {
        var space = (rows-i) / 2
        for (k in space downTo 1) {
            print(" ")
        }
        for (j in (1..i)) {
            print("*")
        }
        println()
    }
}

fun main() {
    val result = diamond(7)
    println(result)
}