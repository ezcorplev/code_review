
fun romanToInt(s: String): Int {

    var result = 0

//    for (char in s) {
//        when (char) {
//
//            'I' -> result += 1
//            'V' -> result += 5
//            'X' -> result += 10
//            'L' -> result += 50
//            'C' -> result += 100
//            'D' -> result += 500
//            'M' -> result += 1000
//
//        }
//    }

    var shouldSkip = false // flag for skipping one loop in case of IV IX XL XC CD CM

    for (i in s.indices) { // MCM // s[i] = 'M'

        if (shouldSkip) { // check for flag (if flag turned true, last loop was a
            // double char, so we skip one by 'continue' and setting shouldSkip to false
            shouldSkip = false
            continue
        }

        if (i != s.length-1) { // 2 == 2 -> last char -> easy addition
            if (s[i] == 'I' && s[i+1] == 'V') {
                shouldSkip = true
                result += 4
                continue
            }
            if (s[i] == 'I' && s[i+1] == 'X') {
                shouldSkip = true
                result += 9
                continue
            }
            if (s[i] == 'X' && s[i+1] == 'L') {
                shouldSkip = true
                result += 40
                continue
            }
            if (s[i] == 'X' && s[i+1] == 'C') {
                shouldSkip = true
                result += 90
                continue
            }
            if (s[i] == 'C' && s[i+1] == 'D') {
                shouldSkip = true
                result += 400
                continue
            }
            if (s[i] == 'C' && s[i+1] == 'M') {
                shouldSkip = true
                result += 900
                continue
            }
        }

        if (s[i] == 'I') result += 1
        if (s[i] == 'V') result += 5
        if (s[i] == 'X') result += 10
        if (s[i] == 'L') result += 50
        if (s[i] == 'C') result += 100
        if (s[i] == 'D') result += 500
        if (s[i] == 'M') result += 1000
    }

    return result
}

fun main() {

    val s = "MCMXCIV" // 1900 // M 1000 + C 100 + M 1000 //+100 +100
    val solution = romanToInt(s)
    println(solution)

}









