package loops

fun main() {
    val rooms = listOf("Kitchen", "Living Room", "Basement", "Bathroom")

    println("-- Room Search --")
    for (room in rooms) {
        print("$room: ")

        if (room == "Living Room") {
            println("Found It!")
            break
        }
        println("Found Nothing.")
    }

    println("\n-- Divide By Zero --")
    for (number in 12 downTo -12 step 4) {

        if (number == 0) {
            continue
        }
        println("120/number = ${120/number}")
    }
}
