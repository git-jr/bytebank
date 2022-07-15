package colecoes

fun List<Livro?>.imprimeComMarcadores() {
    val livorsFormatados = this
        .filterNotNull()
        .joinToString("\n") {
            " - ${it.titulo} de ${it.autor} ano: ${it.anoPublicacao}"
        }

    println("### Listas de Livros ### \n$livorsFormatados")
}