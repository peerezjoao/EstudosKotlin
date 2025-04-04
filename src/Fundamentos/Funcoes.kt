package Fundamentos

fun main() {
    println(boasVindas("James"))
}

fun boasVindas(nome: String) : String {
    var mensagemBemVindo: String = "$nome, bem vindo ao Google!"
    return mensagemBemVindo
}