fun main() {
    val word = "shalom"
    try {
       val blabla =  word as Int
    } catch (e: Exception) {
        when (e) {
            is ClassCastException -> {

            }
            is NumberFormatException -> {

            }
        }
        print(e.message)
    }
}