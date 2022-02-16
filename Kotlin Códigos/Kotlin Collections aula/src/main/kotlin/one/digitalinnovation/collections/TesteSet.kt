package one.digitalinnovation.collections

fun main () {
    val joao = funcionario("Joao", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val funcionario1 = setOf(joao,pedro)
    val funcionario2 = setOf(maria)

    val resultunion = funcionario1.union(funcionario2)

        resultunion.forEach{println(it)}

    println ("--------------------------------------")

    val funcionario3 = setOf(joao,pedro,maria)
    val resultsubtract = funcionario3.subtract(funcionario2)

    resultsubtract.forEach{ println(it) }

    println ("--------------------------------------")
    val resultintersect = funcionario3.intersect(funcionario2)

    resultintersect.forEach{ println(it) }

}