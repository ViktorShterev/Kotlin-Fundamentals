package loops

fun main() {
    val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")

    for (favoriteEntry in favoriteColors) {
        println("${favoriteEntry.key}: ${favoriteEntry.value}")
    }

    println("\n-- Key: Value Output --")

    for (name in favoriteColors.keys) {
        println(name)
    }
    println("\n-- Only Values Output --")

    for (color in favoriteColors.values) {
        println(color)
    }
}
