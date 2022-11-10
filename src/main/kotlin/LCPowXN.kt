import kotlin.math.abs

//fun powXN(x: Double, n:Int): Double {
//
//    var x2 = x
//
//    for (num in 1 until n) { // 1 -> 9
//        x2 *= x // x2 -> 2, 4, 8 x-> 2
//    }
//
//    return x2
//}

//fun powXNIncludeNegative(x: Double, n:Int): Double {
//
//    var x2 = x
//    var absoluteN = abs(n) // turns -3 to 3
//
//    if (n == 0) return 1.0
//
//    if (n > 0) {
//
//        for (num in 1 until n) { // 1 -> 9
//            x2 *= x // x2 -> 2, 4, 8 x-> 2
//        }
//
//    }
//
//    else {
//        for (num in -1 downTo n+1) { // -1 -> -2
//            x2 *= x // x2 -> 2, 4, 8
//        }
//        x2 = 1 / x2 // x2 -> 1/8 -> 0.125
//
//    }
//
//    return x2
//}

//fun bitManipulation() {
//// 0001 - 1 -> 2^0
//// 0010 - 2 -> 2^1
//// 0100 - 4 -> 2^2
//// 1000 - 8 -> 2^3
//// 0001 0000 - 16 -> 2^4
//// 1000 0000 0000 0000 -> 2^32
//// 0101 - 5
////
//
//    // 0101 - 5
//    // 0001 - 1
//    // 0001 - if last is 0 = even, if 1 = odd
//}
//
//fun isOdd(number: Int) {
//
//    if (number and 1 == 0) {
//        // IT'S EVEN
//    }
//}

fun powXNAbsolute(x: Double, n:Int): Double {

    if (n == 0) return 1.0
    if (n==1) return x

    var x2 = x
    val absoluteN = abs(n) // turns -3 to 3
    // now we can loop one way for both neg and pos

    for (num in 1 until absoluteN) { // 1 -> 9
        x2 *= x // x2 -> 2, 4, 8 x-> 2
    }

    if (n < 0) x2 = 1/ x2

    return x2
}

// 2 ^ -2
// 1 / 2 ^ 2 -> 1/4 -> 0.25
// 1 / 2 ^ 3 -> 1/8 -> 0.125

fun main() {

    val x = 2.00000
    val n = -3
    val solution = powXNAbsolute(x, n)
    println(solution)

//    val result = powXN(2.00,-2)
//    if (result == 1048) {
//         TEST PASSED
//    }
}

// 1 2*2 = 4
// 2 4*2 = 8
// 3 8*2 = 16
// 4 16*2 = 32
// 5 32*2 = 64
// 6 64*2 = 128
// 7 128*2 = 256
// 8 256*2 = 512
// 9 512*2 = 1024






// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
//
//Example 1:
//
//Input: x = 2.00000, n = 10
//Output: 1024.00000
//Example 2:
//
//Input: x = 2.10000, n = 3
//Output: 9.26100
//Example 3:
//
//Input: x = 2.00000, n = -2
//Output: 0.25000
//Explanation: 2-2 = 1/22 = 1/4 = 0.25
//
//Constraints:
//
//-100.0 < x < 100.0
//-231 <= n <= 231-1
//n is an integer.
//-104 <= xn <= 104