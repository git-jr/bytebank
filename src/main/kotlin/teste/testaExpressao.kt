package teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1"

    val valorRecebido: Double? =
        try {
            entrada.toDouble()
        } catch (e: NumberFormatException) {
            println("Problema na conversão")
            null
        }

    val valortaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    /*
    val valorComTaxa2: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }
    */

    if (valortaxa != null) {
        println("valor recebido: $valortaxa")
    } else {
        println("valor inválido")
    }
}
