class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (senha == this.senha) {
            return true
        }
        return false
    }
}