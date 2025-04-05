package Fundamentos

fun main() {

    // listas
    var listaMontadoras = listOf<String>("Volkswagen", "Fiat")

    println("Primeira montadora da lista: ${listaMontadoras[0]}")

    val listaNomes: MutableList<String> = mutableListOf("João", "Giullia")
    listaNomes.add("Fernando")

    println("Primeiro nome da lista: ${listaNomes.first()}")
    println("Último nome da lista: ${listaNomes.last()}")

    println("Removendo o primeiro nome da lista: ${listaNomes.removeFirst()}")

}