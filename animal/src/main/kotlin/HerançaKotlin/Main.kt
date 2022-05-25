package HerançaKotlin

fun main(){

    val cachorro = Cachorro (
        "Duque","5")

    val cavalo = Cavalo (
        "Mike","8")

    val preguiça = Preguiça (
        "Flash","12")


    cachorro.emitirSom()
    cachorro.correr()
println()
    cavalo.emitirSom()
    cavalo.correr()
println()
    preguiça.emitirSom()
    preguiça.subirEmArvore()

    }

