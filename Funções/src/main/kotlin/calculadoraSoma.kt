fun main(){

    print("Digite um número: ")
    var num1 = readln().toDouble()

    print("Digite o segundo número: ")
    var num2 = readln().toDouble()

    println("A soma do $num1 + $num2, é igual a: ${soma(num1,num2)}")


}

fun soma(num1:Double, num2:Double):Double{
    return num1 + num2

}