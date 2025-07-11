package sets

fun main() {

    var uniqueParticipants = mutableSetOf<String>()
    var participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

    uniqueParticipants.addAll(participants)

    if (uniqueParticipants.size >= 5) {
        println("The talent show has ${uniqueParticipants.size} unique participants.")
    }
    uniqueParticipants.clear()
    println(uniqueParticipants)
}
