
fun plusOne2(digits: IntArray):IntArray {

    var num: Long = 0
    var newDigits = intArrayOf()

    for (digit in digits) {
        if (digit == 0) {
            num *= 10 // 0 * 10 + 9 = 9 /// 9 * 10 + 8 = 98 /// 987 /// 9876
        } else {
            num = num * 10 + digit // 0 * 10 + 9 = 9 /// 9 * 10 + 8 = 98 /// 987 /// 9876
        }
    }

    num++ // 1294

    val numLength = num.toString().length

    repeat(numLength) {
        val digit = num % 10
        num /= 10
//        newDigits = newDigits.plus(digit)
    }

    var newDigitsAsInt = newDigits.toString().toInt()

    return newDigits.reversed().toIntArray()

//    val digit2 = num % 10 // 9
//    num = num / 10 // 12
//
//    val digit3 = num % 10 // 2
//    num = num / 10 // 1

    //
    // newDigits = 4,9,2,1

}


fun main() {
    val digits = intArrayOf(9,8,7,6,5,4,3,2,1,0)
    val solution = plusOne2(digits)
    println(solution)
}











