package clientecompras

data class Cliente (val nome: String ){

     var endereço = ""
     var telefone = ""



   constructor (nome: String, endereço:String): this(nome){
       this.endereço = endereço
   }

    constructor (nome:String, endereço:String, telefone:String): this(nome,endereço){
        this.telefone = telefone
    }

    val listCompras = mutableListOf<String>()



    fun addCompras(valor: String){

        if (valor != ""){
            listCompras.add(valor)
            println("\nProduto Adicionado\n")

        }else{
            println(" *** Produto Inexistente *** ")
        }
    }

    fun removeCompras(valor: String){

        if (listCompras.contains(valor)){
            listCompras.remove(valor)
            println("Produto Removido")
        }else{
            println("Produto não existente!")

        }


    }
    fun mostrarCompras(){
        listCompras.forEach {
            println(it)
        }
    }


}