fun testAge(age: Int): String {
    if (age < 18) println("you are not an adult yet, you are only $age years old!")
    else if (age >= 18 && age <= 65) println("you are an adult, since you are $age years old!")
    else println("wow you are really old, you are $age years old ya geezer!")
    return age.toString()
}

fun main() {
   // val age = readln()
   // val result = testAge(age.toInt())
   // println(result)
    println("1")
    Thread.sleep(5)
    println("2")
}