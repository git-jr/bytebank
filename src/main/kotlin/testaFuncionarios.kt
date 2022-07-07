fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111.12",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salário ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(nome = "Fran", cpf = "211.211.111.21", salario = 2000.0, 123)

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salário ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticado com sucesso")
    } else {
        println("Não autenticado")

    }

    val gui = Diretor(
        nome = "Gui",
        "311.211.111.21",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )


    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salário ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentica(4000)) {
        println("Autenticado com sucesso")
    } else {
        println("Não autenticado")

    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444.44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}