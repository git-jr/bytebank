package colecoes

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublciacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }

}
