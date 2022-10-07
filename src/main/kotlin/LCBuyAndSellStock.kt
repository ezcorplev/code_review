
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// nested loop when first loop is bought price and second loop is sold price, deduct to reach profit, if profit > max profit, max profit = profit

fun buyAndSellStock(prices: List<Int>): Int {

    var maxProfit = 0
    var profit = 0

    for (bought in prices) {
        for (sold in bought+1 until prices.size) {
            profit = prices[sold] - prices[bought]
            if (profit > maxProfit) maxProfit = profit
        }
    }

    return maxProfit
}

fun main() {

    val prices = listOf(1, 7, 1, 5, 3, 6, 4)
    val solution = buyAndSellStock(prices)
    println(solution)

}