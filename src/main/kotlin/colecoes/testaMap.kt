package colecoes

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    val mensagem: Double? = pedidos.getOrElse(0, {
        0.0
    })
    println(mensagem)

    println(pedidos.getOrDefault(1, -1))
    println(pedidos.getOrDefault(0, -1))

    println(pedidos.keys)
    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    println(pedidos.values)
    pedidos.values.forEach { println("Valor: $it") }


    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidoPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidoPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6))
    println(pedidos)

//    pedidos.putAll(listOf(7 to 90.0, 8 to 20.0,  8 to 30.0))
    pedidos += (listOf(7 to 90.0, 8 to 20.0, 8 to 30.0))
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Numero do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(3, 50.0)
    println(pedidos)
}

fun testaAgrupamentosMap() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0),
    )

    println(pedidos)

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 1, valor = 20.0)])

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }

    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)
