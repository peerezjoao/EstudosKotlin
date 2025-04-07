package fundamentos
import kotlin.math.PI

fun main() {
    cicleArea(14)
    println("Cicle Area two: ${cicleAreaTwo(14)}")
    intervalInSeconds(hours = 1)
    intervalInSeconds(hours = 2, minutes = 12, seconds = 1)
    intervalInSeconds(hours = 33)
}

/* 1 - Write a function called circleArea that takes the radius of a circle in integer format as a parameter
and outputs the area of that circle */
fun cicleArea(radius: Int): Double {

    var pi = PI
    var area = pi * radius * radius
    println("Cicle Area with radius $radius = $area ")

    return area
}

/* 2 - Rewrite the circleArea function from the previous exercise as a single-expression function. */
fun cicleAreaTwo(radius: Int): Double = PI * radius * radius

/* 3 - You have a function that translates a time interval given in hours, minutes, and seconds into seconds.
In most cases, you need to pass only one or two function parameters while the rest are equal to 0.
Improve the function and the code that calls it by using default parameter values and named arguments
so that the code is easier to read. */

fun intervalInSeconds(hours: Int=0, minutes: Int = 0, seconds: Int = 0): Int {
    var secondsTotal: Int = ((hours * 60) + minutes) * 60 + seconds
    println("Total seconds in: $hours hours $minutes minutes $seconds seconds = $secondsTotal")
    return secondsTotal
}
