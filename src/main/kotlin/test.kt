//    fun isPalindrome(x: Int): Boolean {
//        if (x < 0) {
//            return false
//        }
//        if (x.toString().length == 1) {
//            return true
//        }
//        if (x.toString().length == 2 && x.toString().first() == x.toString().last()) {
//            return true
//        }
//        var list = x.toString().toList() // (1, 2, 3, 2, 1)
//        var first = 0
//        var last = list.size - 1
//        for (num in 1 .. list.size / 2) {
//            if (list[first] !== list[last])
//                println(list[first])
//                println(list[last])
//            first++
//            last--
//            return false
//
//
//        }
//        return true
//    }
//
//fun isPalindrome(x: Int):Boolean {
//    val list = x.toString().toList() // x = 1000021
//    var first = 0
//    var last = list.size - 1 // last = list.size (7) - 1 = 6
//    for (num in 1..list.size / 2) { // runs 6 / 2 = 3 times
//        if (list[first] != list[last]) { //
//            return false
//        }
//        first++
//        last--
//    }
//    return true
//}
//fun main() {
//    var num = 1
//    var result = isPalindrome(num)
//    println(result)
//    println("True")
//
//    var num2 = -15
//    var result2 = isPalindrome(num2)
//    println(result2)
//    println("False")
//
//    var num3 = 123454321
//    var result3 = isPalindrome(num3)
//    println(result3)
//    println("True")
//
//    var num4 = 1444
//    var result4 = isPalindrome(num4)
//    println(result4)
//    println("False")
//
//    var num5 = 1000021
//    var result5 = isPalindrome(num5)
//    println(result5)
//    println("False")
//}

fun main() {
    var name = "Erez"

    println("${name.reversed()} is not ${name.uppercase()} and def not ${name.toList()}")

}