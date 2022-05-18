fun main(){

   var idade = 0
   var id21 = 0
   var id50 = 0

    while (idade != -99){

        print("Coloque uma idade: ")
        idade = readln().toInt()

        if (idade !=-99){

            if(idade < 21){
                id21++

            }else if (idade > 50){
                id50++

            }

            println("O número de pessoas com a idade menor que 21 anos são: $id21")
            println("O número de pessoas com a idade maior que 50 anos são: $id50")



        }


    }


}