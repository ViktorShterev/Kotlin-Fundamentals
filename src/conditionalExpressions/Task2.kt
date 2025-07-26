package conditionalExpressions

fun main() {
    var saleHappening = false
    var price: Int

    if (saleHappening) {
        price = 12
    } else {
        price = 15
    }
    println("The total is $price dollars.")
}
