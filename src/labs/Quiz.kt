package labs

fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    println("What is 75 / 5?")
    var studentAnswer1 = Integer.valueOf(readLine())

    println("What is y in: 6 * 2y = 36")
    var studentAnswer2 = Integer.valueOf(readLine())

    println("What is the type of a triangle that has two equal sides?")
    var studentAnswer3 = readLine()

    println("What is 8 * 6 - (3 - 2)")
    var studentAnswer4 = Integer.valueOf(readLine())

    var points = 0

    if (studentAnswer1 == quizAnswer1) {
        points += 25
    }

    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 + 1 == quizAnswer2 || studentAnswer2 - 1 == quizAnswer2) {
        points += 20
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
    } else {
        points++
    }

    if (studentAnswer3 == quizAnswer3) {
        points += 25
    } else if (studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points++
    }

    if (studentAnswer4 == quizAnswer4) {
        points += 25
    } else if (studentAnswer4 in 44..54) {
        points += 20
    } else {
        points++
    }

    when (points) {
        in 0..59 -> println("Student has a F with $points")
        in 60..69 -> println("Student has a D with $points")
        in 70..79 -> println("Student has a C with $points")
        in 80..89 -> println("Student has a B with $points")
        in 90..100 -> println("Student has a A with $points")
        in 101..110 -> println("Student has a A+ with $points")
    }
}
