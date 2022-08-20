// *14/6/22*
// Problem solving method
// Pair
// Fraction multiplication
// Menu
// Separate of concerns
// TODO:
// 1. Modify createMenu() to return the choice and pass it to getInput() - done?
// 2. Modify the menu choice, add sum, subtract, quit. quit will finish the program - done
// 3. implement divide fractions - done
// 4. implement sum of fractions - done
// 5. implement subtraction of fractions - done
// 6. Once fraction calculation is done, go back to the main menu - done
// 7. print the following using loops (you can use print("*") || println("*") || print(" ") || println(" ") :


fun main() {
    createMenu()
    getInput()
}

private fun multiplyFractions(firstMone: Int, firstMehane: Int, secondMone: Int, secondMehane: Int) {
    val moneProduct = (firstMone * secondMone)
    val mehaneProduct = (firstMehane * secondMehane)
    println("Final product:")
    printFraction(moneProduct, mehaneProduct)
    createMenu()
    getInput()
}

private fun divideFractions(firstMone: Int, firstMehane: Int, secondMone: Int, secondMehane: Int) {
    val moneProduct = (firstMone * secondMehane)
    val mehaneProduct = (firstMehane * secondMone)
    println("Final product:")
    printFraction(moneProduct, mehaneProduct)
    createMenu()
    getInput()
    // 1, 2, 3, 4 > 10 / 8
    // first create a mehane1 fraction 2 / 2
    // second create a mehane 2 fraction 4 / 4
    // now multiply mone1 / mehane1 * mehane2 / mehane2 -> 1 / 2 * 4 / 4 -> 4 / 8
    // same for mone2 * mehane1

}

private fun addFractions(firstMone: Int, firstMehane: Int, secondMone: Int, secondMehane: Int) {
    val mone1Mehane2Product = (firstMone * secondMehane) // 1 * 4 = 4
    val mehane1Mehane2Product = (firstMehane * secondMehane) // 2 * 4 = 8
    val mone2Mehane1Product = (secondMone * firstMehane) // 3 * 2 = 6
    val mehane2Mehane1Product = (secondMehane * firstMehane) // 4 * 2 = 8
    val moneSum = (mone1Mehane2Product + mone2Mehane1Product)
    val mehane = mehane1Mehane2Product
    println("Final product:")
    printFraction(moneSum, mehane)
    createMenu()
    getInput()
}

private fun subtractFractions(firstMone: Int, firstMehane: Int, secondMone: Int, secondMehane: Int) {
    val mone1Mehane2Product = (firstMone * secondMehane) // 1 * 4 = 4
    val mehane1Mehane2Product = (firstMehane * secondMehane) // 2 * 4 = 8
    val mone2Mehane1Product = (secondMone * firstMehane) // 3 * 2 = 6
    val mehane2Mehane1Product = (secondMehane * firstMehane) // 4 * 2 = 8
    val moneSum = (mone1Mehane2Product - mone2Mehane1Product)
    val mehane = mehane1Mehane2Product
    println("Final product:")
    printFraction(moneSum, mehane)
    createMenu()
    getInput()
}

private fun createMenu() {
    println("Hello, this is a fractions calculation program")
    println("Please enter one of the following:")
    println("1 - Multiply fractions")
    println("2 - Divide fractions")
    println("3 - Add fractions")
    println("4 - Subtract fractions")
    println("5 - Quit")

}

private fun printFraction(mone: Int, mehane: Int) {
    println(mone)
    println("-")
    println(mehane)
}

private fun getInput() {
    val choice = readLine()!!.toInt()

    // if user presses "5" program will quit >
    if (choice == 5) {
        println("This has been a pleasure, goodbye and see you soon")
        return
    }

    println("Please enter first mone")
    val firstMone = readLine()!!.toInt()
    println("Please enter first mehane")
    val firstMehane = readLine()!!.toInt()

    println("First fraction:")
    printFraction(firstMone, firstMehane)

    println("Please enter second mone")
    val secondMone = readLine()!!.toInt()
    println("Please enter second mehane")
    val secondMehane = readLine()!!.toInt()

    println("Second fraction:")
    printFraction(secondMone, secondMehane)


    when (choice) {
        1 -> {
            multiplyFractions(firstMone,firstMehane,secondMone,secondMehane)
        }
        2 -> {
            divideFractions(firstMone,firstMehane,secondMone,secondMehane)
        }
        3 -> {
            addFractions(firstMone,firstMehane,secondMone,secondMehane)
        }
        4 -> {
            subtractFractions(firstMone,firstMehane,secondMone,secondMehane)
        }
    }
}