package lists

fun main() {

    val planets = mutableListOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

    planets.remove("Pluto")
    planets.add("Earth")

    println(planets.random())
}
