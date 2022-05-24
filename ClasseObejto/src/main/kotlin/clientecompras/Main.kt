import clientecompras.Cliente

fun main() {
    /*Cria uma Classe clientecompras.Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais
     duas opções de construtores conforme sua percepção, com os atributos: nome (String), endereço (String),
     telefone (String), listaDeCompras (mutableListOf<Strings>()).

     A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
     Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
     Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch. */


    println("Digite seu nome: ")
    val nome = readln()

    println("Digite seu endereço: ")
    val endereço = readln()

    println("Digite o numero do seu telefone:")
    val telefone = readln()

    println()

    try {

        val name = Cliente(nome)

        while (true) {

            println("1 - Adicionar compra")
            println("2 - Remover compra")
            println("3 - Listar compra")
            println("4 - Finalizar compra")

            print("Digite uma opção acima: ")
            var opc = readln().toInt()

            println()

            when (opc) {
                1 -> {
                    println("Adicione sua compra: ")
                    var compras = readln()
                    name.addCompras(compras)

                    println()
                }
                2 -> {
                    println("Remova um produto de sua compra: ")
                    var compras = readln()
                    name.removeCompras(compras)

                    println()
                }
                3 -> {
                    name.mostrarCompras()

                    println()
                }
                4 -> {
                    break
                }
            }


        }


    } catch (e: Exception) {
        println(e.message)

    }

}
