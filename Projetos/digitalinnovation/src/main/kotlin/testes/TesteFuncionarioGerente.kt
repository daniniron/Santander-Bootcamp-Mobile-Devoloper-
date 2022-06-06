package testes

import one.digitalinnovation.digionebank.Gerente

fun main() {


    val maria = Gerente(nome = "Maria Neves", cpf = "098.765.5432000.32", salario = 5000.0)

    imprimeRelatorioFuncionario.imprime(maria)

}