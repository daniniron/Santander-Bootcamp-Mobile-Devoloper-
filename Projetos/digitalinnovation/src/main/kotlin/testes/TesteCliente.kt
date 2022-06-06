package testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.432.123-89",
        clienteTipo = ClienteTipo.PF,
        senha = "1234560"
    )
    println(jose)

    TesteAutenticacao().autenticacao(jose)
}