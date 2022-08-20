fun fibo(index:Int):Int { // 6
    if (index == 1) {
        return 1
    }
    if (index == 2) {
        return 2
    }

    val nums = mutableListOf<Int>(1, 2)
    for (num in 1..index-2) {
        nums.add(nums[nums.size-1]+nums[nums.size-2])
    }
    return nums.last()
}

// 1, 2, 3, 5 ,8, 13, 21
fun main() {
    val lastNum = fibo(48)
    println(lastNum)

}