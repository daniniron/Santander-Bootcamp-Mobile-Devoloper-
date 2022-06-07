package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> print("chave:$k - valor: $v") }

    val map2 = mapOf(
        "Pedro" to 2500.00,
        "Maria" to 3000.00
    )

    map2.forEach { (k, v) -> print("chave:$k - valor: $v") }
}