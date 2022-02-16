package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }
    println("----------------------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "João", "José")
    val nomes3 = arrayOf(1,2,3,4,5,)

    println("----------------------------------------------")

    for (names in nomes2) {

        println (names)
    }


}