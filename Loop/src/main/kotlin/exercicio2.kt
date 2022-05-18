fun main() {


    //Ler 10 números e imprimir quantos são pares e quantos são ímpares.

    
    var contPar = 0
    var contImpar = 0


    for (t in 1..10) {
        print("Digite um número: ")
        var num = readln().toDouble()

        if (num % 2 == 0.0) {
            contPar++

        } else {
            contImpar++

        }

    }
    println("Número par $contPar")
    println("Número ímpar $contImpar")
}
