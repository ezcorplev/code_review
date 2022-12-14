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
// loop the list until it is empty
// each time there is a buy-sell cycle add the amount to maxProfit
// also remove all elements until that index
// keep looping adding each buy-sell profit cycle to maxProfit until list is empty
// return maxProfit

fun stockBuySell2v3(prices: Array<Int>): Int {

    var maxProfit = 0

    for (price in 0 until prices.size-1) {
        if (prices[price+1] - prices[price] > 0) {
            maxProfit += prices[price+1] - prices[price]
        }

    }
    return maxProfit
}

fun main() {
    val prices = arrayOf(7,1,5,3,6,4,6) // 4 + 3 + 2 = 9
    val solution = stockBuySell2v3(prices)
    println(solution)
}







