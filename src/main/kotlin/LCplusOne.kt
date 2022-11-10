
// if the last number is 0-8 we can increment by one (123 -> 124, 110 -> 111) - done
// if the last number 9 we can increment the second to last number and turn the last number to zero (129 -> 130) - done
// if the number is 9 return 10 (9 -> 10) - done

// (1, 3, 4)
// 0 * 10 + 1 //// 1 * 10 + 3 //// 13 * 10 + 4
//
fun plusOne(digits: IntArray): IntArray {

    var lastDigit = digits[digits.size-1] // 9
//
//    if (lastDigit == 0 && digits.size == 1) return intArrayOf(1) // skips
//
//    if (lastDigit == 9 && digits.size == 1) return intArrayOf(1, 0) // skips

    if (digits.size == 1) {
        return if (lastDigit == 9) {
            intArrayOf(1, 0)
        } else {
            lastDigit++
            digits[digits.size-1] = lastDigit
            digits
        }
    }

    var secondToLastDigit = digits[digits.size-2] // 2

    if (lastDigit in 0..8) { // (if 3 is in 0 < .. < 8) goes in 9
        lastDigit++ // comes out 4, now we put it into digits as the last digits
        digits[digits.size-1] = lastDigit
    } else {
        digits[digits.size-1] = 0
        secondToLastDigit++
        digits[digits.size-2] = secondToLastDigit
    }

    return digits
}

fun main() {

    val digits = intArrayOf(9, 9)
    val solution = plusOne(digits)
    println(solution)

}