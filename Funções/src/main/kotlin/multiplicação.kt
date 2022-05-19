fun main() {

    print("Digite um número: ")
    var num1 = readln().toInt()

    print("Digite um número: ")
    var num2 = readln().toInt()

    println("A multiplicação do $num1 * $num2, é igual a: ${mult(num1,num2)}")


}

fun mult(num1:Int, num2:Int):Int{
    return num1 * num2
}