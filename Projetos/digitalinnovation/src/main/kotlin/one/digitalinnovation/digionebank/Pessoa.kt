package one.digitalinnovation.digionebank

class Pessoa {
    var name: String =" Daniel"
    private set

    var cpf: String = "123.123.123-89"
    private set
    constructor()

    fun pessoaInfo() = "$name e $cpf"
}






fun main(){
    val daniel = Pessoa()

    println(daniel.pessoaInfo())

}