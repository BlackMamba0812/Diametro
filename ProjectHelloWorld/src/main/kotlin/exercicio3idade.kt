fun main(){
//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
/*categoria ela se encontra:

 10-14 infantil
 15-17 juvenil
 18-25 adulto

 */

    println("Digite sua idade: ")
    var idade = readln().toInt()

    println("Sua categoria e: ")

    if (idade < 10) {
        println("Fora de categoria.")

    }else if (idade in 10..14) {
        println("Categoria Infantil")

    }else if (idade in 15..17){
        println("Categoria Juvenil")

    }else if (idade in 18..25){
        println("Categoria Adulto")

    }else if (idade >25){
        println("Sem Categoria")

    }
}