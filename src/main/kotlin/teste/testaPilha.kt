package teste

import exception.SaldoInsuficienteExeception

fun funcao1() {

    println("início função1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteExeception) {
        e.printStackTrace()
        println("SaldoInsuficienteExeception Detectada")
    }
    println("fim função1")

}

fun funcao2() {
    println("início funcão2")
    println("início funcão2")

    for (i in 1..5) {
        println(i)
//        throw SaldoInsuficienteExeception()
    }

    println("fim função2")
}
