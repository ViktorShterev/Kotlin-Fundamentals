package conditionalExpressions

fun main() {
    var orbitsStar = true
    var hydrostaticEquilibrium = true
    var clearedOrbit = false

    if (orbitsStar && hydrostaticEquilibrium) {
        if (clearedOrbit) {
            println("Celestial body is a planet.")
        } else {
            println("Celestial body is a dwarf planet.")
        }
    }
}
