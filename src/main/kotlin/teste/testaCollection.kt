package teste

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Alex")
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes() {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}


fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Frab",
        "Gui",
        "Maria",
        "Ana"
    )

    for (nome in nomes.iterator()) {
        println(nome)
    }

    println(nomes)

    println("Tem o nome Alex? ${nomes.contains("Alexia")}")
    println("Tamanho da cole��o ${nomes.size}")
}
