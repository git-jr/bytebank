package teste

import exception.SaldoInsuficienteExeception

fun funcao1() {

    println("in�cio fun��o1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteExeception) {
        e.printStackTrace()
        println("SaldoInsuficienteExeception Detectada")
    }
    println("fim fun��o1")

}

fun funcao2() {
    println("in�cio func�o2")
    println("in�cio func�o2")

    for (i in 1..5) {
        println(i)
//        throw SaldoInsuficienteExeception()
    }

    println("fim fun��o2")
}
