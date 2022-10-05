import AnimalX.print
import AnimalX.printList
import kotlin.random.Random

//
// Create a software that will make running a zoo a breeze!
//
// Requirements:
//
// Create a menu that includes the following:
// Feed an animal
// Add a new animal to the zoo
// Remove an animal from the zoo
// Wash the animal (print wash if herbivore or remote wash if animal is a carnivore
// List all the animals in the zoo
// We should know about the animal - age/sex/name/what the animal eats (herbivore/carnivore)
//
// If gender is surprise, make it random
// Create a print extension function for Diet that prints its value (string)
//
// When solving this system design problem, use inheritance & polymorphism principles

val animalList = mutableListOf<Animal>()

open class Animal(
    var UID: Long,
    var age: Int?,
    var name: String?,
    var diet: Diet?,
    var gender: Gender?

)

object AnimalX {
    fun Animal.print() {
        println("Animal UID - ${this.UID}")
        println("Animal Age - ${this.age}")
        println("Animal Name - ${this.name}")
        println("Animal Diet - ${this.diet}")
        println("Animal Gender - ${this.gender}")
        println("")
    }

    fun List<Animal>.printList() {
        for (animal in this) {
            animal.print()
        }
    }
}

enum class Diet(val string: String) {
    HERBIVORE("Herbivore"),
    CARNIVORE("Carnivore")
}

enum class Gender (val string: String) {
    MALE ("Male"),
    FEMALE ("Female"),
    SURPRISE_ME ("Surprise Me!")
}

open class Zoo(
    var animalList: MutableList<Animal>

    ) {
    fun addAnimal() {

    }

    fun getAnimals() {

    }
}

fun ZooManagerMenu() {
    println(" ")
    println("Hello zoo manager, welcome to your new management system")
    println("")
    println("Please choose one of the following options")
    println("")
    println("1 - Register new animal to the zoo")
    println("2 - Remove an animal from the zoo")
    println("3 - Feed an animal")
    println("4 - Wash an animal")
    println("5 - View all animals in the zoo")
    println("0 - quit")

    getInput2()
}

fun getInput2() {
    val choice = readLine()?.toInt()
    when (choice) {
        1 -> { // add animal
            addAnimal()
        }
        2 -> { // remove animal

        }
        3 -> { // feed animal

        }
        4 -> { // wash animal

        }
        5 -> { // view animals
            viewAnimals()
        }
        0 -> {

        }
    }
    ZooManagerMenu()
}

fun populateZoo() {

    val animalUID = System.currentTimeMillis()
    val animal1 = Animal(animalUID,13, "Johnson Johnson", Diet.HERBIVORE, Gender.SURPRISE_ME)
    val animal2 = Animal(animalUID+1,1, "Baby Johnson", Diet.HERBIVORE, Gender.MALE)
    val animal3 = Animal(animalUID+2,5, "Pinny The Penguin", Diet.CARNIVORE, Gender.FEMALE)
    val animal4 = Animal(animalUID+3,99, "Old Ziggy", Diet.CARNIVORE, Gender.MALE)
    val preAnimalList = listOf<Animal>(animal1, animal2, animal3, animal4)

    for (animal in preAnimalList) {
        animalList.add(animal)
    }

}

fun viewAnimals() {
    animalList.printList()
}

fun addAnimal() {
    println("Adding a new animal to our zoo is ez pz!")
    println("Please enter new animal age")
    val animalAge = readLine()?.toInt()
    println("Animal age - $animalAge")
    println("")
    println("Please enter new animal name")
    val animalName = readLine()?.toString()
    println("Animal name - $animalName")
    println("")
    println("Please choose new animal diet")
    println("Choose 1 for herbivore diet")
    println("Choose 2 for carnivore diet")
    val animalDietChoice = readLine()?.toInt()
//    var animalDiet = when (animalDietChoice) {
//        1 -> {
//            Diet.HERBIVORE
//        }
//        2 -> {
//            Diet.CARNIVORE
//        }
//        else -> {
//
//        }
//    }

    var animalDiet: Diet = Diet.HERBIVORE
    if (animalDietChoice == 1) { animalDiet = Diet.HERBIVORE }
    if (animalDietChoice == 2) { animalDiet = Diet.CARNIVORE }
    println("Animal diet - $animalDiet")
    println("")
    println("Please enter new animal gender")
    println("Choose 1 for surprise")
    println("Choose 2 for male")
    println("Choose 3 for female")
    val animalGenderChoice = readLine()?.toInt()
//    val animalGender = when (animalGenderChoice) {
//        1 -> {
//            Gender.SURPRISE_ME
//        }
//        2 -> {
//            Gender.MALE
//        }
//        3 -> {
//            Gender.FEMALE
//        }
//        else -> {
//
//        }
//    }

    var animalGender: Gender = Gender.SURPRISE_ME
    // If user enters 1 (surprise me) choose randomally 2 / 3
//    if (animalGenderChoice == 1) { animalGender = Random(2)}
    if (animalGenderChoice == 2) { animalGender = Gender.MALE}
    if (animalGenderChoice == 3) { animalGender = Gender.FEMALE}

    println("Animal gender - $animalGender")
    println("")
    val newAnimal = Animal(System.currentTimeMillis(), animalAge, animalName, animalDiet, animalGender)
    animalList.add(newAnimal)
}

fun main() {
    populateZoo()
    ZooManagerMenu()
}





