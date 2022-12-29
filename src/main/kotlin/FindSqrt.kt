// Implement a function that has one argument n (int) and returns the SQRT of that number.
// Notes - if n doesn't have a whole number SQRT, return -1, otherwise, return the SQRT
// example - 9 * 9 = 81
// example - 3 * 3 = 9
// range -> unsigned integers
// 38
// 19 * 19
// 18 * 18> 38
// 7 *7 > 38
fun findSQRT(n: Int): Int {
    for (num in 0 .. n) {
        if (num * num == n) {
            return num
        } else if (num * num > n) {
            break
        }
    }
    return -1
}

fun main() {

    val num = 8
    val solution = findSQRT(num)
    println(solution)

}

