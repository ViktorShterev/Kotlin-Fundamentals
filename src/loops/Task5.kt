package loops

fun main() {
    var counter = 0
    var index = 0
    val schoolGrades = listOf("Kindergarten", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th")

    println("-- counter Output --")

    while (counter < 5) {
        println(counter)
        counter++
    }

    println("\n-- Elementary School Grades --")

    while (schoolGrades[index] != "6th") {
        println(schoolGrades[index])
        index++
    }
}
