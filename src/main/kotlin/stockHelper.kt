// You are given an array `prices` where prices[i] is the price of a given stock on the ith day
// You want to maximize your profits by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



fun maximizeProfit(prices: Array<Int>): Int {

    // create a map of (K = i, V = price)
    // loop the map values looking for the biggest gap (price - price)
    // in this loop check if buy date (key) is smaller (before) sell date (key)
    // if so return result of subtraction

    // create var lowestPrice =
    // create var highestPrice =
    // loop to check if there is a higher price & a lower price
    // at end of loop deduct highest from lowest to recieve maxProfit
    // 1, 2, 3, 10, 11

    var maxProfit = 0

    for (i in 0 until prices.size -1) { // looping index

        for (j in i + 1 until prices.size) {
            if ( prices[j] - prices[i] > maxProfit) {
                maxProfit = prices[j] - prices[i]
            }
        }
    }

    return maxProfit
}

fun main() {
    val prices = arrayOf(25, 15, 25, 20, 45, 100, 30, 25, 200) // 100-15 = 85
    val solution = maximizeProfit(prices)
    println(solution)
}

//fun forLoop() {
//    val list = listOf(1, 2, 3, 4, 5)
//
//    var maxProduct = Integer.MIN_VALUE
//
//    for (i in 0 until list.size - 1) {
//        for (j in i + 1 until list.size) {
//            if (list[i] * list[j] > maxProduct) {
//                maxProduct = list[i] * list[j]
//            }
//        }
//    }
//
//    //return ...
//}