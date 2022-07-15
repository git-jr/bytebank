package colecoes

import extensions.media
import extensions.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrays() {
    calculaMaioreMenorSalario()
    maiorEMenoridade()
    operacoesAgregadoras()
    arrayDeObjetos()
}

fun calculaMaioreMenorSalario() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.00, 8000.0, 10000.0)

    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println("Lista de salários com aumento:")
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println("Lista de salários com aumento:")
    println(salarios.contentToString())
}

fun maiorEMenoridade() {

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, -42)

    var maiorIdade = 0

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("A maior idade é $maiorIdade")

    var menorIdade = Int.MAX_VALUE

    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("A menor é $menorIdade")
}

fun testaRanges() {
    val serie: IntRange = 1.rangeTo(10)

    for (s in serie) {
        println("$s ")
    }

    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        println("Numero par: $numeroPar")
    }

    val numerosImpares = 0.until(100) step 3
    numerosImpares.forEach { println("Número Impar: $it") }

    val emQueda = 100.downTo(0).step(10).forEach { caiu -> println("Caindo $caiu") }

    val intervalo = 1000.0..5000.0
    val salario = 3000.0

    if (salario in intervalo) {
        println("Está")
    } else {
        println("Não está")
    }

    val alfaBeto = 'a'..'z'
    println('j' in alfaBeto)
    println('J' in alfaBeto)
}

fun operacoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaIdades: Double = idades.average()
    println("Média idades: $mediaIdades")

    val todoSaoMais18: Boolean = idades.all { it >= 18 }
    println("Todos são maiores de 18? $todoSaoMais18")

    val existeMaiorDeIdade = idades.any { it >= 18 }
    println("Pelo um é maior de idade $existeMaiorDeIdade")

    val todosMaiores = idades.filter { it > 18 }
    println("Todos os maiores de 18: $todosMaiores")

    val busca = idades.find { it == 18 }
    println("Busca: $busca")
}


fun arrayDeObjetos() {
    val salarios = bigDecimalArryaOf("1500.55", "2000.0", "5000.0", "10000.0")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())


    val gastoIniciail = salariosComAumento.somatoria()
    println("Gatso Inicial: $gastoIniciail")

    val meses = 6.toBigDecimal()

    val gastoTotal = salariosComAumento.fold(gastoIniciail) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto totla em 6 meses $gastoTotal")

    val mediaMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(mediaMaioresSalarios)

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println(mediaMenoresSalarios)

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArryaOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}