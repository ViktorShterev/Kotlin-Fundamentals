package conditionalExpressions

fun main() {
    var rewardsPoints = Integer.valueOf(readLine());
    var memberType: String

    if (rewardsPoints >= 50) {
        memberType = "Platinum"
    } else if (rewardsPoints >= 25) {
        memberType = "Gold"
    } else if (rewardsPoints >= 10) {
        memberType = "Silver"
    } else {
        memberType = "Bronze"
    }
    println("You are a $memberType type member.")
}
