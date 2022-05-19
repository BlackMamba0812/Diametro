fun main() {

    print("Digite um número: ")
    var num1 = readln().toInt()

    print("Digite um número: ")
    var num2 = readln().toInt()

    println("A subtração do $num1 - $num2, é igual a: ${sub(num1,num2)}")


}

fun sub(num1:Int, num2:Int):Int{
    return num1 - num2
}