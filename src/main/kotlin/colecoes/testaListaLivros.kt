package colecoes

import br.com.alura.list.listaDeLivros


fun testaListaLivros() {

    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenaroAnoPublicacao = livros.sorted()
    ordenaroAnoPublicacao.imprimeComMarcadores()

    val ordenadoPeloTitulo = livros.sortedBy { it.titulo }
    ordenadoPeloTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()


    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }


    println(titulos)
}

private fun testaSortESorted() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublciacao = prateleira.organizarPorAnoPublciacao()

    porAutor.imprimeComMarcadores()
    porAnoPublciacao.imprimeComMarcadores()
}

private fun agrupaEFiltrarValorPadraoParaNulos() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconheciada" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora : ${livros.joinToString { it.titulo }}")
        }
}