fun main() {

/* 7 - Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
*/

    var cliente = Cliente (
        "Pablo",
        "234876-90",
        "0006532-99",
        25000.00)
    println(cliente)

    print("Digite um valor: ")
    var saque = readln().toDouble()


    cliente.saque(saque)


    print("Digite um valor: ")
    var deposito = readln().toDouble()

    cliente.deposito(deposito)




}