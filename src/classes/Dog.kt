package classes

class Dog(val name: String, val breed: String, val competitionsParticipated: List<String>) {

    init {
        for (comp in competitionsParticipated) {
            println("$name participated in $comp.")
        }
    }

    fun speak() {
        println("$name says: Woof!")
    }
}

fun main() {
    var maxie = Dog("Maxie", "Poodle", listOf("Westminster Kennel Club Dog Show", "AKC National Championship"))
    maxie.speak()
}
