// Write a function that gets a list of integers and an integer. it returns true if the integer exists in the list, false otherwise
// 1, 2, 3, 4, 5, 6
// 4
fun findInt(numbers: List<Int>, number: Int):Boolean {
    for (i in numbers) {
        if (number == i) {
            return true
        }
    }
    return false
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val result = findInt(list, 4) // true
    val result2 = findInt(list, 8) // false
    val result3 = findInt(list, 1)// true
    val result4 = findInt(list, 6)// true
    println(result)
    println(result2)
    println(result3)
    println(result4)
}