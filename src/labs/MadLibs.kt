package labs

fun main () {

    val costOfGas = 2.28
    val mileage = 25

    var distance: Int

    println("What's your name?")
    var name = readLine()

    println("What's your friend's name?")
    var friendName = readLine()

    println("What's your trip?")
    var adjective = readLine()

    println("What city will you driving to?")
    var city = readLine()

    println("What band you will be driving to see?")
    var bandName = readLine()

    println("What kind of job you and $friendName will do in order to save money?")
    var work = readLine()

    println("What distance will be traveled?")
    distance = Integer.valueOf(readLine())

    var totalForGas = (costOfGas / mileage) * distance
    totalForGas = Math.round(totalForGas * 100) / 100.00

    var totalMoneySaved = totalForGas + 200

    print("""
    A long time ago, $name and their friend $friendName planned a $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $totalForGas dollars to get there.
    Both of them worked as $work for the whole summer and managed to save up a total of $totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}
