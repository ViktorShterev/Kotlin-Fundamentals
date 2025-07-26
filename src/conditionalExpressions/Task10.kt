package conditionalExpressions

fun main() {
    var sHU = Integer.valueOf(readLine());
    var pungency: String

    if (sHU in 0..699) {
        pungency = "very mild"
    } else if (sHU in 700..2999) {
        pungency = "mild"
    } else if (sHU in 3000..24999) {
        pungency = "moderate"
    } else if (sHU in 25000..69999) {
        pungency = "high"
    } else {
        pungency = "very high"
    }
    println("A pepper with $sHU Scoville Heat Units has a $pungency pungency.")
}
