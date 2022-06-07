package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "zeca"

//    for{nome in nomes}{
//        println(nome)
//    }

    println("------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("------------------------")
    val nomes2 = arrayOf("Maria", "zeca","Jose" )
    nomes2.sort()
    nomes2.forEach { println(it) }
}