//abstract class Animal ( // superclass(?) Animal has two properties (variables) and one behavior (functions)
//    open var age: Int,
//    open var color: String,
//) {
//    abstract var gender:String
//    fun talk(words: String) {
//        println(words)
//    }
//    abstract fun breath(type: String): String
//}
//
//class Human( // this class inherits from Animal, it must implement all abstract variables and functions by overriding them
//    override var age: Int,
//    override var color: String,
//) : Animal(age, color) {
//    override var gender: String
//        get() = "Male"
//        set(value) {}
//
//    override fun breath(type: String): String {
//        return ("I am breathing $type")
//    }
//
//}
//
//class Fish( // this class inherits from Animal, it must implement all abstract variables and functions by overriding them
//    override var age: Int,
//    override var color: String,
//) : Animal(age, color) {
//    override var gender: String
//        get() = "Male"
//        set(value) {}
//
//    override fun breath(type: String): String {
//        Thread.sleep(5000)
//        return ("I am breathing $type")
//    }
//
//}
//
//fun main() {
//    val human = Human(15, "Brown")
//    human.talk("my age is ${human.age} and i am ${human.color}") // an instance of Human sub class that inherits from Animal
//    val breathing = human.breath("air")
//    println(breathing)
//
//    val fish = Fish(3, "Blue")
//    fish.talk("my age is ${fish.age} and i am ${fish.color}") // an instance of Fish sub class
//    val waterBreathing = fish.breath("water")
//    println(waterBreathing)
//}