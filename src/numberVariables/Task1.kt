package numberVariables

fun main() {

    val caesarSalad = 8.50
    val beefStroganoff = 18
    val cheesecake = 6

    var total = caesarSalad + beefStroganoff + cheesecake
    var tip = 0.15

    var finalAmount = total * tip + total
    println(finalAmount)
}
