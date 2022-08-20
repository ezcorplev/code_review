// *4/7/22*
// DID
// kotlin.run
// labels inside context (@breaking/@yoyo)
// Segmented try catch
// ForeachIndexed is an extension function of Collections!
// TODO
// 1. Have a unique ID per game. DO NOT user index any longer. -> milliseconds in Game class - DONE + incrementation++
// 2. Strict game renting to a single copy per game per customer -> if (Customer.customerRentals[gameID] == rental[gameID])
// { println("you already have this game in your account!" } else { proceed with rental } - DONE
// 3. do not allow negative stock -> if (Game.gameStock == 0) { skip rental } else { proceed w rental }
// 4. Add an option to add a game to the library -> Are you an admin? (Y/N), if Y -> Enter your password, if readLine == 1234
// allow addition, then add game to gameList (with game name and number of copies, gameID + gameUID assigned automatically - DONE W BUGS
// 5. Add an option to edit stock of a game (make sure to take into consideration that some copies may have been rented)
// again admin permission -> edit gameStock to val newStock - DONE
fun main() {
    populateGameList()
    videoRentalMenu()
}

val customerList = mutableListOf<Customer>()
val gameList = mutableListOf<Game>()

fun videoRentalMenu() {
    println(" ")
    println("Hello! This is your friendly video game rental system")
    println("")
    println("Please choose one of the following options")
    println("")
    println("1 - Create a new customer")
    println("2 - View all existing customers")
    println("3 - Rent a copy by customer ID")
    println("4 - Return a copy by customer ID")
    println("5 - View our selection of currently available games")
    println("6 - View number of copies by game ID")
    println("7 - View customer rentals by customer ID")
    println("8 - ADMIN - Add a game to our game rental library")
    println("9 - ADMIN - Edit game stock by game ID")
    println("0 - quit")

    getInput()
}

fun checkIfAdmin() {
    println("")
    println("Please enter your admin password")
    val password = readLine()?.toInt() ?: -1

    if (password != 1) {
         println("Incorrect password, are you sure you're an ADMIN?")
        videoRentalMenu()
    }
}

private fun getInput() {
    try {
        val choice = readLine()?.toInt()

        if (choice == null || choice > 9 || choice < 0) {
            println(" ")
            println("This option is not available, please select an option from the menu")
            videoRentalMenu()
            //getInput()
        }

        if (choice == 0) {
            println(" ")
            println("This has been a pleasure, goodbye and see you soon")
            return
        }

        when (choice) {
            1 -> { // add customer to customerList - done
                addCustomer()
            }
            2 -> { // view customer list - done
                customerList()
            }
            3 -> { // rent game by customer ID (remove from instance of Game (gameStock -1), and add to Customer (customerRentals) 1 copy)
                rentByCustomerIDGameID()
            }
            4 -> { // return game by customer ID (remove from Customer (customerRentals) 1 copy), and add to instance of Game (gameStock +1)
                returnByCustomerIDGameID()
            }
            5 -> { // view game list unless their stock is 0 - done
                availableGames()
            }
            6 -> { // enter game ID and receive Int of gameStock (receives gameID: Long and returns gameStock: Int) - done
                gameByGameId()
            }
            7 -> { // enter customer ID and receive Customer instance customerRentals list
                gamesByCustomerID()
            }
            8 -> {
                addNewGameToGameList()
            }
            9 -> {
                editGameStockByGameID()
            }
        }
    } catch (NumberFormatException: NumberFormatException) {
        println("ERROR - Please only enter a number as your selection")

    } catch (IndexOutOfBoundsException: IndexOutOfBoundsException) {
        println("ERROR - Index out of B B BOUNDS!")

    } catch (Exception: Exception) {
        println("ERROR - Uhhhh something went wrong, please try again!")
    }

    videoRentalMenu()
}

fun addCustomer() {
    // receives a string and returns a string, also creates a new instance for the Customer class (ID, name, rentals)

    println(" ")
    println("Please enter new customer name")
    val customerName = readLine().toString()
    customerList.add(Customer((customerList.size + 1), customerName, mutableListOf()))
    println(" ")
    println("$customerName has been added as a new customer")

    // when done return to menu >>
    videoRentalMenu()
}

fun customerList() {
    println(" ")
    println("Our current list of customers is:")
    println(" ")

    for (customer in customerList) {
        println("Customer Name - ${customer.customerName}")
        println("Customer ID - ${customer.customerID}")

        if (customer.customerRentals.isEmpty()) {
            println("${customer.customerName} currently has no rentals")
            println(" ")
            continue
        }

        for (rental in customer.customerRentals) {
            println("Customer Rentals - ${rental.gameName}")
            println(" ")
        }

    }

    // when done return to menu >>
    videoRentalMenu()
}

class Customer (
    val customerID: Int,
    val customerName: String,
    val customerRentals: MutableList<Game>
        )

class Game (
    val gameUID: Long ,
    val gameID: Int,
    val gameName: String,
    var gameStock: Int
)

fun populateGameList() {

    val maplestory = Game(System.currentTimeMillis(),1, "Maplestory", 5)
    val stardewValley = Game(System.currentTimeMillis()+1,2, "Stardew Valley", 3)
    val callOfDuty = Game(System.currentTimeMillis()+2,3, "Call Of Duty", 15)
    val minecraft  = Game(System.currentTimeMillis()+3,4, "Minecraft", 12)
    val rocketLeague = Game(System.currentTimeMillis()+4,5, "Rocket League", 1)

    gameList.add(maplestory)
    gameList.add(stardewValley)
    gameList.add(callOfDuty)
    gameList.add(minecraft)
    gameList.add(rocketLeague)

}

fun availableGames() {

//    for (game in gameList) {
//        if (game.gameStock > 0) {
//            println("${game.gameName} currently has ${game.gameStock} copies available")
//            println(game.gameUID)
//            println(" ")
//        }
//    }

    for (game in gameList) {
        if (game.gameStock > 0) {
            println("[${game.gameID}] - ${game.gameName} - ${game.gameStock} copies available")
            println(game.gameUID)
            println(" ")
        }
    }

    // when done return to menu >>
//    videoRentalMenu()
}

fun gameByGameId() {


        for (game in gameList) {
            if (game.gameStock > 0) {
                println("Game - ${game.gameName}, Game ID - ${game.gameID}")
                println(" ")
            }
        }
        println(" ")
        println("Please enter desired game ID")

        val gameID = readLine()!!.toInt()
        val gameName = gameList[gameID - 1].gameName
        val gameStock = gameList[gameID - 1].gameStock

        println("$gameName has $gameStock copies left!")


    // when done return to menu >>
    videoRentalMenu()
}

fun rentByCustomerIDGameID() {

    try {

        customerListByCustomerID()

        println(" ")
        println("Please enter customer ID")
        val customerID = readLine()!!.toInt() // 1 - erez

        for (game in gameList) {
            if (game.gameStock > 0) {
                println("${game.gameName} currently has ${game.gameStock} copies available")
                println(" ")
            }
        }

        println(" ")
        println("Please enter desired game ID")
        val gameID = readLine()!!.toInt() // 1 - maplestory
        val game = gameList[gameID - 1]
        val customer = customerList[customerID - 1]

        if (customer.customerRentals.isEmpty()) { // if list is empty allow rental

            customerList[customerID - 1].customerRentals.add(Game(game.gameUID,game.gameID, game.gameName, game.gameStock))
            // this will add a Game instance to the customers customerRentals list
            val currentStock = game.gameStock
            gameList.find { it.gameID == game.gameID }?.gameStock = currentStock - 1 // this will remove one copy from gameStock in the specific Game instance

            println(" ")
            println("${customer.customerName} has just rented ${game.gameName}")

        } else {

            if (customer.customerRentals[gameID-1].gameID == game.gameID) { // if customer has same rental

                println("You cannot rent a game you have currently rented!")

            } else { // if customer does not have same rental

                customerList[customerID - 1].customerRentals.add(Game(game.gameUID,game.gameID, game.gameName, game.gameStock))
                // this will add a Game instance to the customers customerRentals list
                val currentStock = game.gameStock
                gameList.find { it.gameID == game.gameID }?.gameStock = currentStock - 1
                // this is supposed to remove one copy from gameStock in the specific Game instance

                println(" ")
                println("${customer.customerName} has just rented ${game.gameName}")
            }
        }

    } catch (outOfBounds: IndexOutOfBoundsException) {
        println("ERROR - You have selected an invalid number, please select a number between 1 - ${gameList.size}")
    } catch (NumberFormatException: NumberFormatException) {
        println("ERROR - Please only enter a number as your selection")
    }
    // when done return to menu >>
    videoRentalMenu()
}

fun returnByCustomerIDGameID() {
    try {
        customerListByCustomerID()

        println(" ")
        println("Please enter customer ID")
        val customerID = readLine()!!.toInt() // 1 - erez
        println(" ")
        println("Please enter desired game ID")
        val gameID = readLine()!!.toInt() // 5 - rocket league
        val game = gameList[gameID - 1] // rocket league [5-1=4]
        val customer = customerList[customerID - 1]

        run breaking@{
            customer.customerRentals.forEachIndexed { index, rental ->
                if (rental.gameID == game.gameID) {
                    customer.customerRentals.removeAt(index)

                    val currentStock = game.gameStock
                    gameList.find { it.gameID == game.gameID }?.gameStock = currentStock + 1

                    println(" ")
                    println("${customer.customerName} has just returned ${game.gameName}")
                    return@breaking
                }
            }
        }

        // when done return to menu >>
    } catch (Exception: ConcurrentModificationException) {
        println("ConcurrentModificationException: " + Exception.message)

    } catch (Exception: IndexOutOfBoundsException) {
        println("IndexOutOfBoundsException: " + Exception.message)
    }

    videoRentalMenu()
}

fun gamesByCustomerID() {

    customerListByCustomerID()

    println(" ")
    println("Please enter customer ID")
    val customerID = readLine()!!.toInt() // 1 - erez}
    val customer1 = customerList[customerID-1]

    println(" ")
    println("${customer1.customerName} has a total of ${customer1.customerRentals.size} rentals to their name!")

    for (game in customer1.customerRentals) {
        println(" ")
        println("${customer1.customerName} has ${game.gameName} rented out!")
    }
    videoRentalMenu()

}

fun customerListByCustomerID() {

    println("[Customer ID] - Customer Name")
    for (customer in customerList) {
        println("[${customer.customerID}] - ${customer.customerName}")
    }
}

fun gameListByGameID() {

    println("[Game ID] - Game Name - (Game Stock)")
    for (game in gameList) {
        println(" [${game.gameID}] - ${game.gameName} - (${game.gameStock})")
    }
}

fun addNewGameToGameList() {

    checkIfAdmin()

    println("")
    println("Please enter new game name")
    val newGameName = readLine().toString()

    println("")
    println("Please enter new game stock")

    val newGameStock = readLine()?.toInt() ?: 0


//    val newGameStock: Int = try {
//        readLine()?.toInt() ?: -1
//    } catch (NumberFormatException: NumberFormatException) {
//        println("ERROR - Please only enter a number as your selection")
//        3
//    } catch (Exception: Exception) {
//        println("ERROR - Uhhhh something went wrong, please try again!")
//        5
//    }


        if (newGameStock < 0) {
            println("You cannot input a negative stock for a game")
            addNewGameToGameList()
            return
        }


    gameList.add(Game(System.currentTimeMillis(), gameList.size+1, newGameName,newGameStock))

}

fun editGameStockByGameID() {

    checkIfAdmin()
    gameListByGameID()

    println(" ")
    println("Please enter desired game ID")
    val editGame = readLine()?.toInt() ?: return

    val selectedGame = gameList[editGame - 1]

    println(" ")
    println("Please enter desired game stock")

    val editGameStock = readLine()!!.toInt()

    gameList.find { it.gameID == selectedGame.gameID }?.gameStock = editGameStock

    println("[${selectedGame.gameID}] - ${selectedGame.gameName} - new stock is ${selectedGame.gameStock}")
}