package teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import exception.SaldoInsuficienteExeception

fun testaComportamentosConta() {

    val alex = Cliente("Alex", cpf = "", senha = 1)

    val contaAlex = ContaCorrente(alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente("Fran", "", senha = 2)
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("TransferĂȘncia da conta da Fran para o Alex")

    try {
        contaFran.transfere(destino = contaAlex, valor = 250.0)
        println("TransferĂȘncia sucedida")
    } catch (e: SaldoInsuficienteExeception) {
        println("Falha na transferĂȘncia")
        println("Saldo insuficiente")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}