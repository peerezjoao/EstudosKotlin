package Fundamentos

fun main() {

    for (number in 1..100)

        if (number.mod(25) == 0) {
            println("Número dividido por 25 -- $number")
        }

    val ingredientes: List<String> = listOf("ovo", "leite", "manteiga")

    println("Preparando um bolo com os seguintes ingredientes:")
    for (item in ingredientes) {
        println("- $item")
    }

    var pizzaSlices: Int = 0

    while (pizzaSlices < 8) {
        println("Comendo o pedaço de pizza: $pizzaSlices")
        pizzaSlices++
    }

    pizzaSlices = 0
    do {
        println("pedaço: $pizzaSlices")
        pizzaSlices++
    } while (pizzaSlices < 8)


}