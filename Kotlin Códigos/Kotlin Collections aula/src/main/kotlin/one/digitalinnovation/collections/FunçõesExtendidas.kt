package one.digitalinnovation.collections

import java.math.BigDecimal


fun Array<BigDecimal>.somatoria() = this.reduce { acc, valor ->
    acc + valor
}
fun Array<BigDecimal>.media() =
    if(this.isEmpty())BigDecimal.ZERO
else this.somatoria() / this.size.toBigDecimal()  // o this chama a fun Array somatoria e divide pelo tamanho do array.




