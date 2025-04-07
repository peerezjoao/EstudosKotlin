package fundamentos

fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map {actions -> "$prefix/$id/$actions"}
    println(urls)

    repeatN(2) {
        println("Hello")
    }
}

fun repeatN(n: Int, action: () -> Unit) {
    for(i in 1 .. n) {
        action()
    }
}