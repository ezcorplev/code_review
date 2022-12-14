// sorting - doesnt work because async
// map - doesnt solve the problem
// nested loop comparison - compares best possible outcome (in this case subtraction)
// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
// However, you can buy it then immediately sell it on the same day.
// Find and return the maximum profit you can achieve.
// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
// Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
// Total profit is 4 + 3 = 7.
// w

fun stockBuySell2(prices: Array<Int>): Int {

    var maxProfit = 0
    val profitMap = mutableMapOf<Int, Int>()

    for (buy in prices.indices) // loop over index instead of value
        for (sell in buy+1 until prices.size) {        // loop over from next element onwards through indices
            if (prices[sell] - prices[buy] > maxProfit) {
                maxProfit = prices[sell] - prices[buy]
                profitMap[sell] = maxProfit
//                println(profitMap.keys.elementAt(0))
            } else break
        }

    maxProfit = 0

    for (buy in profitMap.keys.elementAt(0) until prices.size)
        for (sell in buy+1 until prices.size) {
            if (prices[sell] - prices[buy] > maxProfit) {
                maxProfit = prices[sell] - prices[buy]
                profitMap[sell] = maxProfit
            } else break
        }


    for (value in profitMap.values) {
        println("$value")
    }
    println("total is")
    return profitMap.values.sum()
//    return maxProfit
}

fun main() {
    val prices = arrayOf(7,1,5,3,6,4) // 4 + 3 = 7
    val solution = stockBuySell2(prices)
    println(solution)
}







