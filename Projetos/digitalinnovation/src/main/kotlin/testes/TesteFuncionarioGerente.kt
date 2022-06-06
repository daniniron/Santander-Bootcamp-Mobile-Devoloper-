package testes

import one.digitalinnovation.digionebank.Analista

fun main() {


    val maria = Analista(nome = "Maria Neves", cpf = "098.765.5432000.32", salario = 5000.0)

    imprimeRelatorioFuncionario.imprime(maria)

}