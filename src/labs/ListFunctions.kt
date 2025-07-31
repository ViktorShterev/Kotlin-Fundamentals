package labs

fun getListOfNumbers(): List<Int> {
    var myList = mutableListOf<Int>()

    for (i in 1..7) {
        println("Please enter a number")
        var intAnswer = Integer.valueOf(readLine())
        myList.add(intAnswer)
    }
    return myList
}

fun findMax(numbers: List<Int>): Int {
    var largestNumber = numbers[0]

    for (number in numbers) {
        if (number > largestNumber) {
            largestNumber = number
        }
    }
    return largestNumber
}

fun findMin(numbers: List<Int>): Int {
    var smallestNumber = numbers[0]

    for (number in numbers) {
        if (number < smallestNumber) {
            smallestNumber = number
        }
    }
    return smallestNumber
}

fun findAverage(numbers: List<Int>): Int {
    var sum = 0

    for (number in numbers) {
        sum+=number
    }
    return sum / numbers.size
}

fun checkIfListContains(numbers: List<Int>, value: Int): Boolean {
    for (number in numbers) {
        if (value == number) {
            return true
        }
    }
    return false
}

fun differenceSmallestLargest(smallest: Int, largest: Int): Int {
    return largest - smallest
}

fun squareValues(numbers: List<Int>): List<Int> {
    var newList = mutableListOf<Int>()
    for (number in numbers) {
        var newValue = number * number
        newList.add(newValue)
    }
    return newList
}

fun main() {

    var values = getListOfNumbers()
    println(values)

    var largestValue = findMax(values)
    println("The largest number is $largestValue.")

    var smallestValue = findMin(values)
    println("The smallest number is $smallestValue.")

    var average = findAverage(values)
    println("The average is $average.")

    println("Enter a number to check for: ")
    var numToFind = Integer.valueOf(readLine())
    var containsValue = checkIfListContains(values, numToFind)

    if (containsValue) {
        println("The value exists within the list")
    } else {
        println("The value does not exist within the list")
    }

    var difference = differenceSmallestLargest(smallestValue, largestValue)
    println("The difference between the smallest and the largest values is $difference.")

    var square = squareValues(values)
    println(square)
}
