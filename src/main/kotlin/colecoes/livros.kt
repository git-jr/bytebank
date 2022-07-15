package br.com.alura.list

import colecoes.Livro

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sert�o: Veredas",
        autor = "Jo�o Guimar�es Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mem�rias P�stumas de Br�s Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Sagarana",
        autor = "Jo�o Guimar�es Rosa",
        anoPublicacao = 1946
    ),
    Livro(
        titulo = "Iracema",
        autor = "Jos� de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = 1938,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = 1979,
        editora = "Editora B"
    ),
    Livro(
        titulo = "O Corti�o",
        autor = "Alu�sio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora B"
    )
)


val listaDeLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sert�o: Veredas",
        autor = "Jo�o Guimar�es Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Mem�rias P�stumas de Br�s Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Sagarana",
        autor = "Jo�o Guimar�es Rosa",
        anoPublicacao = 1946
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "Jos� de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = 1938,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = 1979,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "O Corti�o",
        autor = "Alu�sio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora B"
    )
)

