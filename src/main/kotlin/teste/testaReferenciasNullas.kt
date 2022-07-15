package teste

import br.com.alura.bytebank.modelo.Endereco

fun testaReferenciasNullas() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "Rua 42", complemento = "Logo al�")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento n�o pode ficar vazio")
        println(tamanhoComplemento)
    }

    testeSafeCasts("1")
}


fun testeSafeCasts(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}
