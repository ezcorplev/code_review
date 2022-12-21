fun isHappy(n: Int): Boolean {
    var slow = n // 19
    var fast = n // 19

    // Use a set to keep track of the numbers that we have seen
    val seen = HashSet<Int>()

    while (true) { // forever?
        // Calculate the next number in the sequence for the slow and fast pointers
        slow = calculateNext(slow) // 19 -> 82
        fast = calculateNext(calculateNext(fast)) // 19 -> 82 -> 68

        // If the fast pointer has reached 1, then we have found a happy number
        if (fast == 1) {
            return true
        }

        // If the slow and fast pointers have met, then we have entered an infinite loop
        if (slow == fast) {
            return false
        }

        // Add the current number to the set of seen numbers
        seen.add(slow)
    }
}

// Function to calculate the next number in the sequence
fun calculateNext(n: Int): Int {
    var sum = 0
    var num = n

    // Continuously sum the squares of the digits until we reach a single-digit number
    while (num > 0) {
        val digit = num % 10 // 19 % 10 = 9 // 1 % 10 = 1
        sum += digit * digit // 9 * 9 = +81 // 1*1 = +1 = 82
        num /= 10 // 19 / 10 = 1 // 1 / 10 = 0
    }

    return sum // 82
}

fun main() {
    val n = 19
    val solution = isHappy(n)
    println(solution)
}
