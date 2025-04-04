package Fundamentos

fun main() {

    val nome = "João"
    var jogo = "God Of War" // variável mutável
    val ano = 2000 // variável imutável

    // template expressions serve para chamar os valores armazenados em variáveis, $Var
    println("O meu nome é $nome, eu nasci nos anos $ano e meu jogo preferido é $jogo.")

    jogo = "CS2"

    println("Meu jogo favorito agora é $jogo.")

}

