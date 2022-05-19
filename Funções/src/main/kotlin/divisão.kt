fun main() {

    print("Digite um número: ")
    var num1 = readln().toInt()

    print("Digite um número: ")
    var num2 = readln().toInt()

    println("A divisão do $num1 / $num2, é igual a: ${divisão(num1,num2)}")


}

fun divisão(num1:Int, num2:Int):Int{
    return num1 - num2
}