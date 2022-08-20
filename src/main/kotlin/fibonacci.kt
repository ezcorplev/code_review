fun fiboz(index: Int): Int {

    val list = mutableListOf(1, 2) // for index [5] num (8) we will run 3 times (5-2=3)
    for (num in 1..index-2) {
        list.add(list[list.size-1] + list[list.size-2])
    }
    return list[list.size-1]
}
fun main() {
    val index = 55
    val result = fiboz(index)
    println(result)
}