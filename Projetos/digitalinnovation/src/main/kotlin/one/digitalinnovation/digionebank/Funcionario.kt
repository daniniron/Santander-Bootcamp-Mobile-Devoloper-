package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,

) : Pessoa(nome, cpf){

  protected abstract fun calculoauxilio(): Double

    override fun toString(): String = """
     Nome: $nome
     CPF: $cpf
     Salrio: $salario
     Auxilio: ${calculoauxilio()}
    """.trimIndent()
}