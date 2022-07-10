package teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        Cliente("Alex", "", senha = 1, endereco = Endereco(logradouro = "Rua Vergueiro")), numero = 1000
    )

    println("titular ${contaCorrente.titular.nome}")
    println("endereço titular ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(
        Cliente("Fran", "", senha = 2), numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente ${contaCorrente.saldo}")
    println("saldo poupança ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupnça: ${contaCorrente.saldo}")
    println("saldo poupança após reecber transferêncaia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupancça após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}