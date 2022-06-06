package testes

import one.digitalinnovation.digionebank.Analista


fun main() {



    val joao = Analista(nome = "Joao Dias", cpf = "098.765.5432000.32", salario = 2000.0)

    imprimeRelatorioFuncionario.imprime(joao)

}