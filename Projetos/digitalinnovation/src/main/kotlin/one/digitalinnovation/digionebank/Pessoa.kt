package one.digitalinnovation.digionebank

class Pessoa {
    var name: String =" Daniel"
    private set

    var cpf: String = "123.123.123-89"
    private set

}



fun main(){
    val daniel = Pessoa()

    println(daniel.name)
    println(daniel.cpf)

}