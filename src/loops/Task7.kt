package loops

fun main() {

    for (i in 1..6) {
        for (j in 'A'..'F') {
            print("$j$i ")
        }
        println()
    }
}
