package main.kotlin

class Turismo(
    matricula: String,
    marca: String,
    precioPorDia: Double,
    val plazas: Int
) : Vehiculo(matricula, marca, precioPorDia) {

    override fun describir(): String ="${super.describir()} - $plazas plazas"
}