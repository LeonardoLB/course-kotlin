package OO.Polimorfismo

/**
 * Polimorfismo dinamico
 **/

class Feijão( val peso: Double)
class Arroz( val peso: Double )

class Pessoa( var peso: Double ) {

    fun comer(feijão: Feijão) {
        peso += feijão.peso
    }

    fun comer(arroz: Arroz) {
        peso += arroz.peso
    }

    override fun toString(): String {
        return "O peso da pessoa atualmente é $peso Kg"
    }

}

fun main() {

    val feijao = Feijão(0.3)
    val arroz = Arroz(0.7)

    val pessoa1 = Pessoa(78.0)

    println(pessoa1)
    pessoa1.comer(arroz)
    println(pessoa1)
    pessoa1.comer(feijao)
    println(pessoa1)

}