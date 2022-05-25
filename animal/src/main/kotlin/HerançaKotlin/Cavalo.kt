package HerançaKotlin

class Cavalo(nome: String, idade: String) :Animal(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("IIIIIIIHIHIIHIHUHUHUHU")
    }

    override fun correr() {
        super.correr()
        println("POCOTÓ - POCOTÓ - POCOTÓ - POCOTÓ")
    }
}