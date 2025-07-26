package conditionalExpressions

fun main() {
    var season = readLine()

    when (season) {
        "Winter" -> println("Grow kale.")
        "Spring" -> println("Grow lettuce.")
        "Summer" -> println("Grow corn.")
        "Fall" -> println("Grow pumpkins.")
        else -> println("Not a valid season.")
    }
}
