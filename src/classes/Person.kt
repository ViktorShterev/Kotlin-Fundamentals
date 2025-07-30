package classes

class Person(val name: String, val age: Int, val favoriteColor: String)

fun main() {

    val me = Person("Viktor", 26, "violet")
    val myFriend = Person("Kika", 24, "purple")

    println("${me.name} is ${me.age} years old and his favorite color is ${me.favoriteColor}.")
    println("${myFriend.name} is ${myFriend.age} years old and her favorite color is ${myFriend.favoriteColor}.")
}
