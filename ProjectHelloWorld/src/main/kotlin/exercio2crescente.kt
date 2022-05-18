fun main (){
    //2- Faça um programa que entre com três números e coloque em ordem crescente.\\

    print("Digite um numero: ")
    var num1 = readln().toInt()

    print("Digite um numero: ")
    var num2 = readln().toInt()

    print("Digite um numero: ")
    var num3 = readln().toInt()

    if (num1 > num2) {
        var t = num1
        num1 = num2
        num2 = t
    }
    if (num1 > num3) {
        var t = num1
        num1 = num3
        num3 = t
    }
    if (num2 > num3) {
        var t = num2
        num2 = num3
        num3 = t
    }

    println("Os numeros crescentes sao: $num1, $num2, $num3")


}