package collections

fun main() {

    val pares = arrayListOf(2, 4, 6)
    val impares = arrayListOf(1, 3, 5)

    /**
     * Funcao union permite unir arrays do mesmo tipo
     * em seguida usamos sorted() para ordenar a sequencia
     **/

    for (n in impares.union(pares).sorted()) {
        println( n )
    }

}