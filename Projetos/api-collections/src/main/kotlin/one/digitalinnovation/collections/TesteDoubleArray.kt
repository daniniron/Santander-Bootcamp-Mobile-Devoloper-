package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.00

    salarios.forEach { println(it) }

    println("-----")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
        println(salarios[index])
    }

    println("-----")

    val salario2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios.sort()
    salario2.forEach { println(it) }

    println("-----")
    salarios.sort()
    salarios.forEach { println(it) }

}