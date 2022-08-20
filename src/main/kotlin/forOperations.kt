fun main() {
//    // break
//    // continue
//    val numbers = listOf(1, 2, 3, 4, 5)
//    for (number in numbers) {
//        if (number == 3) {
//            continue
//        }
//        println(number.toString())
//    }
    val list = listOf(1, 2, 3, 4, 5)
    list.forEachIndexed { index, num ->
        println("$index, $num")
    }



}