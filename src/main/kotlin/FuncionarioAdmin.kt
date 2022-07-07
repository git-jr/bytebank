abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (senha == this.senha) {
            return true
        }
        return false
    }
}