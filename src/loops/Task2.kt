package loops

fun main() {
    println("-- 1st for loop output --")

    for (i in 10 downTo 1) {
        println("i=$i")
    }
    println("\n-- 2nd for loop output --")

    for (j in 1 until 10) {
        println("j=$j")
    }
    println("\n-- 3rd for loop output --")

    for (k in 1..10 step 2) {
        println("k=$k")
    }
}
