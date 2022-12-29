
fun removeFirstAddLastInTenArray(array: FloatArray, num: Int): FloatArray {
    val newArray = array
    val newNum = num.toFloat()

    for (index in 0 until newArray.size-1) { // run through array (0, 0, 0 ... 0> 10 elements)
        newArray[index] = newArray[index+1]
    }
    newArray[newArray.size-1] = newNum

    for (float in newArray) print("$float,")
    println("")
    return newArray
}

fun main() {
    val array = FloatArray(10)
    removeFirstAddLastInTenArray(array, 1)
    removeFirstAddLastInTenArray(array, 2)
    removeFirstAddLastInTenArray(array, 3)
    removeFirstAddLastInTenArray(array, 4)
    removeFirstAddLastInTenArray(array, 5)
    removeFirstAddLastInTenArray(array, 6)
    removeFirstAddLastInTenArray(array, 7)
    removeFirstAddLastInTenArray(array, 8)
    removeFirstAddLastInTenArray(array, 9)
    removeFirstAddLastInTenArray(array, 10)
    removeFirstAddLastInTenArray(array, 11)

}






