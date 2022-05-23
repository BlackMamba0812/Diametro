data class Cliente constructor(
    var titular: String, val agencia: String,
    val conta: String, var saldo: Double){



    fun saque (valor:Double){

        if(valor > 0.0 && valor <= saldo){
            saldo -= valor
            println("Saque de R$$valor realizado!\n")
            println("Saldo é de R$$saldo")
        }else{
            println("Valor indisponivel")
        }

    }
    fun deposito (valor:Double){

        if (valor > 0.0){
            saldo += valor
            println("Depósito de R$$valor realizado!")
            println("Saldo é de R$$saldo")
        }else{
            println("Depósito não realizado!")
        }
    }
}



