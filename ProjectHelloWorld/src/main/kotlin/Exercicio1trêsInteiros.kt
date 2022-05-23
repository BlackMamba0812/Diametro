fun main() {

    println("Digite um numero inteiro: ")
    var numero1 = readln().toInt()

    println("Digite segundo numero inteiro: ")
    var numero2 = readln().toInt()

    println("Digite terceiro numero: ")
    var numero3 = readln().toInt()


    if (numero1 > numero2 && numero1 > numero3) {
        print("O número maior eh $numero1")


    } else if (numero2 > numero3) {
        print("O numero maior eh $numero2")

    } else {


        println("O numero maior eh $numero3")


    }
}






