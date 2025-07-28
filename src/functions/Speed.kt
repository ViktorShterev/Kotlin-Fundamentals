package functions

fun getSpeed(distance: Int, time: Int) {
    var speed = distance / time
    println("$speed meters per second")
}

fun main() {
    getSpeed(10, 3)
}
