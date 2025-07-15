package maps

fun main() {

    var momaPaintings = mutableMapOf("Les Demoiselles d'avignon" to "Pablo Picasso", "The Starry Night" to "Vincent Van Gogh", "Mona Lisa" to "Leonardo Da Vinci", "The Persistance of Memory" to "Salvador Dali")

    if (!momaPaintings.containsValue("Claude Monet")) {
        momaPaintings.put("Water Lillies", "Claude Monet")
    }

    momaPaintings.remove("Mona Lisa")
    println(momaPaintings)
}
