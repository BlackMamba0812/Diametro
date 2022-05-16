fun main (){
    // Cálculo do IMC

    print("Insira aqui o seu peso:")
    val peso = readln()!! . toDouble()

    print("Insira sua altura:")
    val altura = readln()!! . toDouble()

    println("\nO seu peso é $peso e sua altura é $altura")

    val imc = peso/(altura*altura)
    println("\nPortanto seu IMC é %.1f". format(imc))


    if(imc <=18.9){
     val imc = readln()

    }else if (imc <=24.9)
        readln()



}