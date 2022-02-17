package one.digitalinnovation.collections

fun main(){
    val joao = funcionario("Joao", 2000.0,"CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val maria = funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach{ println(it) }

    println ("---------------List--------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }
    println ("----------------------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println ("--------------------Set-----------------")
    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)

    funcionariosSet.forEach{ println(it) }
    println ("--------------------Set-----------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}



}