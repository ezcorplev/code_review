// LAMBDA expressions!
fun main() {
    val list = listOf(1, 2, 5, 4, 3, 6, 5)
    val numberFive = list.find { it == 5 } ?: -1 // 5 // ?: Elvis = if nothing found, return (in this case -1)
    val isNumberFiveExists = list.any { it == 5 } // true
    val filterAllFives = list.filter { it == 5 } // { 5, 5 }
    val takeFirst = list.take(2) // { 1, 2 }
    val takeLast = list.takeLast(2) // { 6, 5 }
}