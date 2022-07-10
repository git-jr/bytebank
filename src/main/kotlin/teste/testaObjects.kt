package teste

import br.com.alura.bytebank.modelo.*


fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "333.333.333.33"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
    println("nome cliente:${fran.nome}")


    val alex = Cliente("Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    println("totalContas: ${Conta.total}")
}


