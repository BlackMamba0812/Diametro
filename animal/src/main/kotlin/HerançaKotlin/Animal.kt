package HerançaKotlin

open class Animal(var nome: String, var idade: String){

    open fun emitirSom (){
        println("Som: ")

    }
    open fun correr (){
        println("Correndo: ")


    }
    open fun subirEmArvore (){
        println("Subindo: ")
    }
}