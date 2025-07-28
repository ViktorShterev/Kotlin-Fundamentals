package functions

fun getPrice(price: Double, couponCode: String = "None") {
    var finalPrice: Double

    if (couponCode == "save15") {
        finalPrice = price * 0.85
    } else {
        finalPrice = price
    }
    println("The total price is $finalPrice.")
}

fun main() {
    getPrice(price = 48.0, couponCode = "save15")
    getPrice(48.0)
}
