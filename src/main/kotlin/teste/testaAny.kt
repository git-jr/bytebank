package teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua 42",
        cep = "0000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua 42",
        cep = "0000-000"
    )

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )
}


fun imprime(valor: Any): Unit {
    println(valor)
}