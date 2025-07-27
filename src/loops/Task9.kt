package loops

fun main() {

    grid@ for (i in 1..6) {
        for (j in 'A'..'F') {

            if (j == 'C') {
                continue@grid
            }
            print("$j$i ")
        }
        println()
    }
}
