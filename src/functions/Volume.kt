package functions

fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3

fun main() {
    var length = 5
    var width = 8
    var height = 14

    var volume = pyramidVolume(length, width, height)
    println("The volume of this pyramid is $volume.")
}
