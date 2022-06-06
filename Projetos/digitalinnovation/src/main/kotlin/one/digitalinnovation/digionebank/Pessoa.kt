package one.digitalinnovation.digionebank

class Pessoa {
    var name: String =" Daniel"
    var cpf:String = "123.123.123-89"
}

fun main(){
    val daniel = Pessoa()

    println(daniel.name)
    println(daniel.cpf)
}