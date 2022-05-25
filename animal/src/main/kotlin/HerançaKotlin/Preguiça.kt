package HerançaKotlin

class Preguiça(nome: String, idade: String) : Animal(nome, idade){

    override fun emitirSom() {
        super.emitirSom()
        println("AAAH - AAAH - AAAH")
    }

     override fun subirEmArvore() {
         super.subirEmArvore()
         println("AI QUE PREGUIÇA!!!")

    }
    }
