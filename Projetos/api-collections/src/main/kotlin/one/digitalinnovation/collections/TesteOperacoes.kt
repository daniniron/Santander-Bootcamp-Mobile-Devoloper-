package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("=====================")
    println("Maior salario : ${salarios.maxOrNull()}")
    println("Menor salario : ${salarios.minOrNull()}")
    println("Media salario : ${salarios.average()}")

    println("=====================")
    val salarioMaiorQue2500 = salarios.filter { it> 2500.0 }// quantidade de array maiores que
    salarioMaiorQue2500.forEach {println(it)}

    println("=====================")
    println(salarios.count{it in 2000.0 ..5000.0})// com range

    println("=====================")
    println("salario pesquisado: " + salarios.find{it == 2250.0})
    println("salario nao encontrado: " + salarios.find{it == 500.0}) // valor vai ser null

    println("=====================")
    println(salarios.any{it == 1000.0}) // retorno verdadeiro
    println(salarios.any{it == 500.0})  // retorno falso

}
