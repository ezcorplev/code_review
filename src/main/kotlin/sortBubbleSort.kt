

fun bubbleSort(list: List<Int>): List<Int> {

    for (i in 1 until list.size) {
        for (c in i + 1 until list.size-1) {
            var temp = 0
            var a = list[c]
            var b = list[c+1]
            if (a > b) {
//                a = b.also {b = a}
                temp = a
                a = b
                b = temp
            }
        }
    }
    return list
}

fun main() {
    val list = listOf(1, 3, 2, 4, 5, 9, 7, 8, 6)
    val result = bubbleSort(list)
    println(result)
}