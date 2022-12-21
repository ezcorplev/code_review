//Write an algorithm to determine if a number n is happy.
//A happy number is a number defined by the following process:
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//Example 1:
//Input: n = 19
//Output: true
//Explanation:
//1^2 + 9^2 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
/* 1. break down int into digits 19 -> 1,9
2. square each digit and add the outcomes 1^2 + 9^2 (81) = 82
3. repeat until int equals 1
4. how to prevent from looping endlessly? slow == fast exit -> false
 */

fun isHappyNumber(n: Int): Boolean {

    fun sumSquare(n: Int): Int {
        var num = n // 19
        var sum = 0

        while (num > 0) {
            val digit = num % 10 // 9
            sum += digit * digit // 81
            num /= 10 // 1
        }
        return sum
    }
    var slow = n
    var fast = n

    while (true) {

        slow = sumSquare(slow)
        fast = sumSquare(sumSquare(fast))

        if (fast == 1) return true

        if (slow == fast) return false
    }
}

fun main() {
    val n = 2
    val solution = isHappyNumber(n)
    println(solution)
}







