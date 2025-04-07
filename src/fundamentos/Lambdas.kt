package fundamentos

import kotlin.math.exp

fun main() {

    val upperCaseString: (String) -> String = {text: String -> text.uppercase() }
    println(upperCaseString("hello"))

    val exponents = {number: Int -> number * number}
    println(exponents(2))

    val numbers = listOf(1,2,3,4,5,6,-16,12,-6,-7,-8)

    // the function body after ->
    val positives = numbers.filter({x -> x > 0})
    println("Positive numbers: $positives")

    val negatives = numbers.filter({x -> x < 0})
    println("Positive numbers: $negatives")

}