import java.text.BreakIterator

fun main() {
    /*Crie um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
Finalizar dados
 */

    val itens = mutableListOf<String>()
    println("             CONTROLE DE ESTOQUE AUTO PARTS           ")

    while (true) {
        println("Escolha uma opção")
        println("A- Adicionar itens")
        println("R- Remover itens")
        println("AT- Atualizar itens")
        println("L- Listar itens")
        println("F- Finalizar")

        print("Opção: ")
        val op = readln()

        when (op) {
            "A" -> {
                println("Selecione os itens ou pressione F para Finalizar.")
                val valores = readln()
                if (valores != "") {
                    itens.add(valores)

                    println("Itens cadastrado!\n")
                } else {
                    println("O nome do item não pode ser vazio")
                    break
                }
            }
            "R" -> {
                println("Remover item: ")
                val removitens = readln()
                if (itens.contains(removitens)) {
                    itens.remove(removitens)
                    println("Item Removido")
                } else {
                    println("Item não existe na lista.\n")
                }
            }

            "AT" -> {
                println("Lista de Itens\n")
                itens.forEach {
                    println(it)
                }
                println("\nSelecione um item a ser alterado: ")
                val attitens = readln()
                if (itens.contains(attitens)) {
                        val index = itens.indexOf(attitens)

                        println("Selecione um novo item: ")
                        val novoitens = readln()
                        itens[index] = novoitens

                        println("Item selecionado")

                    } else {

                    println("Item não existe na lista\n")
                }

            }

            "L" -> {
                println("Lista de itens\n")
                itens.forEach {
                    println(it)
                }

            }
         "F" -> break

        }

    }

}
