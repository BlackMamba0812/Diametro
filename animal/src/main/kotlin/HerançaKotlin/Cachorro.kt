package HerançaKotlin

class Cachorro(nome: String, idade: String) :Animal(nome, idade){

    override fun emitirSom() {
        super.emitirSom()
        println("AUAUAUAUUUUUUUUUUUU")
    }

    override fun correr() {
        super.correr()
        println("tic tic - tic tic")
    }
}