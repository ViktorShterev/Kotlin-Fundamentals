package conditionalExpressions

fun main() {
    var expressionValue: Boolean

    if (!true && (false && true || !false)) {
        println("Hello")
    } else {
        println("Goodbye")
    }

    expressionValue = false
    println(expressionValue)
}
