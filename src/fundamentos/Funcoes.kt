package fundamentos

val usuarios: MutableList<String> = mutableListOf<String>("joao_p", "giullia_v")

fun main() {
   // println(boasVindas("James"))
   // println(mensagemSufixoPrefixo("bem vindo", "welcome"))
    validarUsuario("joao_q")
}

fun boasVindas(nome: String) : String {
    var mensagemBemVindo: String = "$nome, bem vindo ao Google!"
    return mensagemBemVindo

}

fun mensagemSufixoPrefixo(sufixo: String, prefixo: String): String {
    return "$prefixo $sufixo"
}

fun validarUsuario(usuario: String): String  {

    if (usuario in usuarios) {
        println("Usuário já cadastrado na plataforma.")
        return "Usuário já cadastrado."
    } else {
        usuarios.add(usuario)
        println(usuarios)
        return "Usuário - $usuario  - adicionado com sucesos na base."
    }


}