package Fundamentos

fun main() {

    print("Insira seu nome: ")
    var nome: String? = readln() // operador seguro '?'
    println(nome?.length ?: "Variávle nula.") // operador elvis

    nome?.let{
        println("Nome não é nulo - $nome")
    }

}