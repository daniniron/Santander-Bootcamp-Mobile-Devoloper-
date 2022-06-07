package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0,"CNPJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionario1 = setOf(joao, pedro)//conjunto
    val funcionario2 = setOf(maria)//conjunto2

    val resultUniao = funcionario1.union(funcionario2)// uni
    resultUniao.forEach{println(it)}

    println("================")
    val funcionario3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)//subtrai resultado repetido
    resultSubtract.forEach{println(it)}

    println("================")
    val resultIntersect = funcionario3.intersect(funcionario2)//mostra o resultado repetido
    resultIntersect.forEach{println(it)}


}