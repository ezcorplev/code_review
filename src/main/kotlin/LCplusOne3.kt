
fun plusOne3(digits: IntArray):IntArray {

    for (digit in digits.size - 1 downTo 0) { // loops reversed
        digits[digit] += 1 // for each adds +1 (only adds to the first one)
        if (digits[digit] <= 9) return digits // if digit <= 9 return digits
        digits[digit] = 0 // else turns digit (which is 10) to 0
    }
    val arr = IntArray(digits.size + 1) // finished looping, now creates new intArrayOf(0,0,0)
    arr[0] = 1 // turns first int to 1, now returns (1, 0, 0)

    return arr

}


fun main() {
    val digits = intArrayOf(9,9)
    val solution = plusOne3(digits)
    println(solution)
}











