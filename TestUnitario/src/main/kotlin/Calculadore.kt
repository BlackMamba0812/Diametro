class Calculadore {

    companion object {

        fun soma (n1: Int, n2: Int): Int{
            return n1 + n2
        }
        fun subtração (n1: Int, n2: Int): Int{
            return n1 - n2
        }
        fun multiplicação (n1: Int, n2: Int): Int{
            return n1 * n2
        }
        fun divisão (n1: Double, n2: Double): Double{
            return n1 / n2
        }
        fun porcentagem (n1:Int, n2: Int): Int{
            return  n1 * (n2/100)
        }
        fun potência (n1: Double, n2: Double): Double{
            return Math.pow(n1,n2)
        }
    }

}