package sets

fun main() {

    var islandsOfHawaii = setOf("Maui", "Lanai", "Oahu", "Kauai")
    println(islandsOfHawaii.elementAt(2))
    println(islandsOfHawaii.elementAtOrNull(6))
}
