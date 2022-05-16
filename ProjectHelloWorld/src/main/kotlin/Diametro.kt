import kotlin.math.PI

fun main(){
//Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

    print("Digite o diâmetro:")
     var diametro = readln().toDouble()

    // Calcular a área do diâmetro
    // Área = Pi * R * R

    var raio = diametro / 2

    var area = PI * raio * raio

    var perimetro = 2 * PI * raio

    println("A área do diâmetro é de $area")
    println("O perimetro do diâmetro é de $perimetro")
}