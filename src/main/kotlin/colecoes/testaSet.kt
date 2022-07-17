package colecoes


fun testaSet() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val asssistiramCursoKotilin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos = assistiramCursoAndroid + asssistiramCursoKotilin

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(asssistiramCursoKotilin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)


    println(asssistiramCursoKotilin + assistiramCursoAndroid)
    println(asssistiramCursoKotilin union assistiramCursoAndroid)

    println(asssistiramCursoKotilin - assistiramCursoAndroid)
    println(asssistiramCursoKotilin subtract assistiramCursoAndroid)

    println(asssistiramCursoKotilin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList.toSet())
}
