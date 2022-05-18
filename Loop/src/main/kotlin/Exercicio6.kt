fun main (){
//    Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)

    var soma = 0
    var cont =  0

    do{
       print("Digite um número: ")
        val num = readln().toInt()

        if(num %3 == 0){
            soma+=num
            cont++
        }
    } while (num != 0)

       val media = soma / cont

    println("A soma de todos os números múltiplos de 3 digitos é: $soma" +
            " e a média dos números é: $media")

}