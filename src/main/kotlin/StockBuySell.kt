import kotlin.math.max

// sorting - doesnt work because async
// map - doesnt solve the problem
// nested loop comparison - compares best possible outcome (in this case subtraction)

fun stockBuySell(prices: Array<Int>): Int {

    var maxProfit = 0

    for (buy in prices.indices) // loop over index instead of value
        for (sell in buy+1 until prices.size) // loop over from next element onwards through indices
            if (prices[sell] - prices[buy] > maxProfit)
                maxProfit = prices[sell] - prices[buy]


    return maxProfit
}

fun main() {
    val prices = arrayOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 10, 30, 1, 25, 45) // 44
    val solution = stockBuySell(prices)
    println(solution)
}







