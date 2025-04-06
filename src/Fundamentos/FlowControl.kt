package Fundamentos

fun main() {

    val nota: Double = 7.1

    if (nota in 6.0..10.0) {
        println("Aprovado!")
    } else {
        println("Reprovado! Estude mais da próxima vez.")
    }

    when (nota) {
        in 9.0..10.0 -> println("Parabéns pelo esforço")
        in 7.0..8.0 -> println("Parabéns.")
        in 5.0..6.0 -> println("Estude mais.")
        in 0.0..4.0 -> println("Você precisa estudar mais para não tirar notas vermelhas.")
        else -> println("Nota não encontrada.")
    }

}
