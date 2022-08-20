//// first try
//fun main() {
//    val numList = listOf(1, 3, 5)
//    val result = returnInverse(numList)
//    println(result)
//}
//
//fun returnInverse(numList: List<Int>): List<Int> {
//
//    val newList = emptyList<Int>()
//    val newList2 = newList.toMutableList()
//    for (num in numList[numList.size-1] downTo 1) {
//        newList2.add(num)
////        println(newList2.elementAt(newList2.size-1))
////        println(newList2)
//
//    }
//    return newList2
//}
// second try w/ ext fun - easy
//fun main() {
//    val numList = listOf(1, 2, 5, 9)
//    val result = numList.reversed()
//    println(result)
//}
//// third try returns 4 3 2 1 0 for some reason
//fun main() {
//    val numList = listOf(1, 3, 7, 6)
//    val result = reverseList(numList)
//    println(result)
//}
//
//fun reverseList(numList: List<Int>) {
//    val reversedList = mutableListOf<Int>()
//    for (num in numList.size downTo 0) {
//        reversedList.add(num)
//    }
//    println(reversedList)
//}
// fourth try returns reversed list
//fun main() {
//    val numList = listOf(1, 2, 3, 4, 5, 6, 7, 9, 1)
//    val result = reverseList(numList)
//    println(result)
//}
//// 1237456 -> 654321
//fun reverseList(numList: List<Int>) {
//    val reversedList = mutableListOf<Int>()
//    for (num in numList.size-1 downTo 0) {
//        reversedList.add(numList[num])
//    }
//    println(reversedList)
//}
// fifth try complicated version no extra list
fun main() {
    val numList = mutableListOf(1, 5, 7, 3, 0)
    val result = reverseList(numList)
    println(result)
}
// 123456 -> 654321
//
//
fun reverseList(numList: MutableList<Int>) {

    var first = 0 // 1 [0]
    var last = numList.size-1 // 6 [5]
    for (num in (first ..last / 2)) {
        val temp = numList[first] // 0 = 1
        numList[first] = numList[last] // 1 = 6 so 623456
        numList[last] = temp // 6 = 1 so 623451
        first++
        last--
    }
    println(numList)
}
// 1, 3, 4, 2, 5, -5
// -5, 1, 2, 3, 4, 5
//(first ..last / 2)


