package classes

class Building {
    val yearBuilt = 2016
    val height = 400
    val type = "Limestone"
}

fun main() {

    val residentialBuilding = Building()
    println(residentialBuilding.yearBuilt)
    println(residentialBuilding.height)
    println(residentialBuilding.type)

    val commercialBuilding = Building()
    println(commercialBuilding.yearBuilt)
    println(commercialBuilding.height)
    println(commercialBuilding.type)
}
