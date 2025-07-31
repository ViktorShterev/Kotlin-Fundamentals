package labs

class Calculator(name: String) {
    init {
        println(name)
    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subtract(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            println("Cannot divide by 0!")
            return 0
        }
        return num1 / num2
    }

    fun power(num1: Int, num2: Int): Int {
        var result = 1
        for (i in result..num2) {
            result = result * num1
        }
        return result
    }
}

fun main() {
    var myCalc = Calculator("Codey")

    println(myCalc.add(3, 5))
    println(myCalc.subtract(5, 3))
    println(myCalc.multiply(3, 5))
    println(myCalc.divide(15, 3))
    println(myCalc.divide(15, 0))
    println(myCalc.power(5, 3))
}