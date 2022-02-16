package one.digitalinnovation.collections

data class funcionario (
    val nome: String,
    val salario: Double,
    val tipocontatacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
            
        """.trimIndent()

}
