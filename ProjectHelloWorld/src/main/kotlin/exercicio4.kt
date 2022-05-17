import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    /*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.

     */


    print("Digite um numero: ")
    var num = readln().toDouble()

    if (num % 2 == 0){
      println("Esse numero $num eh par e sua raiz quadrada eh: ${ +
              "%.2f".format(sqrt(num))}")

    }else{
        println("Esse numero $num eh impar e ele elevado ao quadrado eh: ${ +
        "%.2f".format(num.pow(num))}")

    }
}